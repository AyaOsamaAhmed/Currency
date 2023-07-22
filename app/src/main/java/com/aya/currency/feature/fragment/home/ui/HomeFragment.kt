package com.aya.currency.feature.fragment.home.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.aya.currency.R
import com.aya.currency.base.BaseFragment
import com.aya.currency.core.extension.observe
import com.aya.currency.databinding.HomeFragmentBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HomeFragment : BaseFragment<HomeFragmentBinding, HomeViewModel>()  {

    private lateinit var nav : NavHostFragment
    private lateinit var navController : NavController

    override val mViewModel: HomeViewModel by viewModels()

    override fun onFragmentReady() {

        mViewModel.apply {
            observe(viewState) {
                handleViewState(it)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        nav =  activity?.supportFragmentManager?.findFragmentById(R.id.main_layout) as NavHostFragment
        navController = nav.navController

        return super.onCreateView(inflater, container, savedInstanceState)
    }

    private fun handleViewState(action: HomeAction) {
        when (action) {
            is HomeAction.ShowLoading -> {
                showProgress(action.show)
            }
            is HomeAction.ShowFailureMsg -> showToast(action.message)
            is HomeAction.ShowLatest -> {
            }
        }
    }
}