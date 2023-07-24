package com.aya.currency.feature.fragment.home.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.aya.currency.R
import com.aya.currency.base.BaseFragment
import com.aya.currency.core.extension.observe
import com.aya.currency.databinding.HomeFragmentBinding
import com.aya.currency.feature.fragment.home.data.SymbolItem
import com.aya.currency.feature.fragment.home.data.SymbolsItem
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HomeFragment : BaseFragment<HomeFragmentBinding, HomeViewModel>() ,
    AdapterView.OnItemSelectedListener {

    private lateinit var nav : NavHostFragment
    private lateinit var navController : NavController

    override val mViewModel: HomeViewModel by viewModels()

    private var listCurrency : MutableList<SymbolItem> = mutableListOf()
    private var listCountryCurrency : MutableList<String> = mutableListOf()
    private var currencyAdapter :  ArrayAdapter<String>? = null


    private var fromCurrency = ""
    private var toCurrency = ""

    override fun onFragmentReady() {

        mViewModel.apply {
            observe(viewState) {
                handleViewState(it)
            }
        }

        binding.apply {

            btConvert.setOnClickListener {
                mViewModel.getLatest(toCurrency)
            }

        }
        binding.spinnerFromCurrency.adapter = currencyAdapter
        binding.spinnerFromCurrency.onItemSelectedListener = this

        binding.spinnerToCurrency.adapter = currencyAdapter
        binding.spinnerToCurrency.onItemSelectedListener = this


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
                val data = action.data

            }
            is HomeAction.GetSymbols ->{
                val data = action.data
                handleCurrencyData(data)
                showToast(data.AED)

            }
        }
    }


    private fun handleCurrencyData(data: SymbolsItem) {
        listCountryCurrency.clear()
        listCountryCurrency.add(data.AED)
        listCountryCurrency.add(data.AFN)
        listCountryCurrency.add(data.ALL)
        listCountryCurrency.add(data.AMD)
        listCountryCurrency.add(data.ANG)
        listCountryCurrency.add(data.AOA)

        listCurrency.clear()
        listCurrency.add(SymbolItem(data.AED,"AED"))
        listCurrency.add(SymbolItem(data.AFN,"AFN"))
        listCurrency.add(SymbolItem(data.ALL,"ALL"))
        listCurrency.add(SymbolItem(data.AMD,"AMD"))
        listCurrency.add(SymbolItem(data.ANG,"ANG"))
        listCurrency.add(SymbolItem(data.AOA,"AOA"))

        fromCurrency = listCurrency[0].Currency
        toCurrency = listCurrency[0].Currency

        currencyAdapter =  ArrayAdapter<String>(requireContext(), android.R.layout.simple_spinner_item , listCountryCurrency)
        currencyAdapter!!.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerFromCurrency.adapter = currencyAdapter
        binding.spinnerToCurrency.adapter = currencyAdapter

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        // On selecting a spinner item
        val item = parent?.getItemAtPosition(position).toString()
        if(parent?.id == binding.spinnerFromCurrency.id) {
            listCurrency.forEach {
                if(it.Country == item)
                    fromCurrency = it.Currency
            }

            showToast(" From : $fromCurrency")

        }else if(parent?.id == binding.spinnerToCurrency.id){
            listCurrency.forEach {
                if(it.Country == item)
                    toCurrency = it.Currency
            }
            showToast(" To : $toCurrency")
        }


    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }

}