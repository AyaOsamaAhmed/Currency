package com.aya.currency.core.extension

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.content.res.Resources
import android.os.Build
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.WindowInsets
import androidx.activity.OnBackPressedCallback
import androidx.activity.addCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner

fun Fragment.hideKeyboard() = activity?.hideKeyboard()

fun Activity.showKeyboard() = WindowInsetsControllerCompat(window, window.decorView).show(
    WindowInsetsCompat.Type.ime()
)

fun Activity.hideKeyboard() =
    WindowInsetsControllerCompat(window, window.decorView).hide(WindowInsetsCompat.Type.ime())


fun LifecycleOwner.getStatusBarHeight(): Int {
    val res: Resources = if (this is AppCompatActivity) {
        resources
    } else {
        this as Fragment
        resources
    }
    val statusBarRes = res.getIdentifier("status_bar_height", "dimen", "android")
    return res.getDimensionPixelSize(statusBarRes)
}

fun Fragment.setActivityResult(bundle: Bundle? = null, resultCode: Int = Activity.RESULT_OK) {
    activity?.setResult(resultCode, Intent().apply {
        if (bundle != null)
            putExtras(bundle)
    })
    activity?.finish()
}

/*This called when method onBackClick in activity is called */
fun Fragment.onBackClick(callback: (onBackPressedCallback: OnBackPressedCallback) -> Unit) {
    // This callback will only be called when Fragment is at least Started.
    activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner) {
        isEnabled = true
        callback.invoke(this)
    }
}

val Fragment.supportFragmentManager: FragmentManager
    get() = requireActivity().supportFragmentManager

//Binding View (Activity - Fragment) on the fly
//usually used in base Fragment/Activity
@Suppress("UNCHECKED_CAST")
fun <B : ViewDataBinding> LifecycleOwner.bindView(container: ViewGroup? = null): B {
    return if (this is Activity) {
        val inflateMethod = getTClass<B>().getMethod("inflate", LayoutInflater::class.java)
        val invokeLayout = inflateMethod.invoke(null, this.layoutInflater) as B
        this.setContentView(invokeLayout.root)
        invokeLayout
    } else {
        val fragment = this as Fragment
        val inflateMethod = getTClass<B>().getMethod(
            "inflate",
            LayoutInflater::class.java,
            ViewGroup::class.java,
            Boolean::class.java
        )
        val lifecycle = fragment.viewLifecycleOwner.lifecycle
        if (!lifecycle.currentState.isAtLeast(Lifecycle.State.INITIALIZED)) {
            error("Cannot access view bindings. View lifecycle is ${lifecycle.currentState}!")
        }
        val invoke: B = inflateMethod.invoke(null, layoutInflater, container, false) as B
        invoke
    }
}


fun AppCompatActivity.setWindowLayoutDirection(layoutDirection: Int) {
    window.decorView.layoutDirection = layoutDirection
}

fun <T : AppCompatActivity> Fragment.showActivity(
    activity: Class<T>,
    args: Bundle? = null,
    clearAllStack: Boolean = false
) {
    val intent = Intent(requireContext(), activity).apply {
        if (args != null)
            putExtras(args)
        if (clearAllStack)
            flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
    }
    startActivity(intent)
}

@Suppress("DEPRECATION")
inline val Fragment.windowWidth: Int
    @SuppressLint("ObsoleteSdkInt")
    get() {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            val metrics = requireActivity().windowManager.currentWindowMetrics
            val insets = metrics.windowInsets.getInsets(WindowInsets.Type.systemBars())
            metrics.bounds.width() - insets.left - insets.right
        } else {
            val view = requireActivity().window.decorView
            val insets: Int = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                val res = WindowInsetsCompat.toWindowInsetsCompat(view.rootWindowInsets, view)
                    .getInsets(WindowInsetsCompat.Type.systemBars())
                return resources.displayMetrics.widthPixels - res.left - res.right
            } else {
                val displayMetrics = DisplayMetrics()
                requireActivity()
                    .windowManager.defaultDisplay.getMetrics(displayMetrics)
                displayMetrics.widthPixels
            }
            return insets
        }

    }