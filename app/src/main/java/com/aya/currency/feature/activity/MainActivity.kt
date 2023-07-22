package com.aya.currency.feature.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.aya.currency.R
import com.aya.currency.base.BaseActivity
import com.aya.currency.core.extension.observe
import com.aya.currency.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    private lateinit var nav : NavHostFragment
    private lateinit var navController : NavController
    override val mViewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel.apply {
            observe(viewState) {

            }
        }
        nav =   supportFragmentManager.findFragmentById(R.id.main_layout) as NavHostFragment
        navController = nav.navController

    }

}