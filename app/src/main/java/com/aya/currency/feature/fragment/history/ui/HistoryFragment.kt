package com.aya.currency.feature.fragment.history.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.aya.currency.R
import com.aya.currency.base.BaseFragment
import com.aya.currency.databinding.HistoryFragmentBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HistoryFragment : BaseFragment<HistoryFragmentBinding, HistoryViewModel>()  {

    private lateinit var nav : NavHostFragment
    private lateinit var navController : NavController

    override val mViewModel: HistoryViewModel by viewModels()

    override fun onFragmentReady() {

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav =  activity?.supportFragmentManager?.findFragmentById(R.id.main_layout) as NavHostFragment
        navController = nav.navController
    }



}