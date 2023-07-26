package com.aya.currency.feature.fragment.home.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.activityViewModels
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

    override val mViewModel: HomeViewModel by activityViewModels()

    private var listCurrency : MutableList<SymbolItem> = mutableListOf()
    private var listCountryCurrency : MutableList<String> = mutableListOf()
    private var currencyAdapter :  ArrayAdapter<String>? = null

    private var fromRate = ""
    private var toRate = ""


    override fun onFragmentReady() {

        mViewModel.apply {
            observe(viewState) {
                handleViewState(it)
            }
        }

        binding.apply {

            btConvert.setOnClickListener {
               getConvertCurrency()
            }
            btDetails.setOnClickListener {
                navController.navigate(R.id.action_HomeFragment_to_HistoryFragment)
            }
        }
        binding.spinnerFromCurrency.adapter = currencyAdapter
        binding.spinnerFromCurrency.onItemSelectedListener = this

        binding.spinnerToCurrency.adapter = currencyAdapter
        binding.spinnerToCurrency.onItemSelectedListener = this


    }

    private fun getConvertCurrency() {
        mViewModel.rates.forEach {
            if(it.Currency == mViewModel.fromCurrency){
                fromRate = it.rate.toString()
            }
            if (it.Currency == mViewModel.toCurrency){
                toRate = it.rate.toString()
            }
        }

        val value = binding.inputNumber.text.toString().toFloat()
        val from = value.div(fromRate.toFloat())
        val to =  toRate.toFloat().times(from)

        binding.convertNumber.text = String.format("%.6f", to)

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
            is HomeAction.GetSymbols ->{
                val data = action.data
                handleCurrencyData(data)

            }
        }
    }


    private fun handleCurrencyData(data: SymbolsItem) {
        listCountryCurrency.clear()
        data.symbols.forEach {
            listCountryCurrency.add(it.Country)
        }
        listCurrency = data.symbols
        //
        mViewModel.fromCurrency = listCurrency[0].Currency
        mViewModel.toCurrency = listCurrency[0].Currency

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
                    mViewModel.fromCurrency = it.Currency
            }
            Log.d("","From ${mViewModel.fromCurrency}")

        }else if(parent?.id == binding.spinnerToCurrency.id){
            listCurrency.forEach {
                if(it.Country == item)
                    mViewModel.toCurrency = it.Currency
            }
            Log.d("","To: ${mViewModel.toCurrency}")
        }


    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }

}