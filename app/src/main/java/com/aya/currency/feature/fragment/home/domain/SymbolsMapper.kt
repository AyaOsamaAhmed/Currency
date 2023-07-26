package com.aya.currency.feature.fragment.home.domain

import com.aya.currency.feature.fragment.home.data.SymbolItem
import com.aya.currency.feature.fragment.home.data.SymbolsItem
import com.aya.currency.feature.fragment.home.data.SymbolsResponse

object SymbolsMapper {

    fun mapData(res: SymbolsResponse): SymbolsItem {
        val result = SymbolsItem()

        result.success = res.success
        val symbol = res.symbols
        val list : MutableList<SymbolItem> = mutableListOf()

        list.add(SymbolItem(symbol.AED , "AED"))
        list.add(SymbolItem(symbol.AFN , "AFN"))
        list.add(SymbolItem(symbol.ALL , "ALL"))
        list.add(SymbolItem(symbol.AMD , "AMD"))
        list.add(SymbolItem(symbol.ANG , "ANG"))
        list.add(SymbolItem(symbol.AOA , "AOA"))
        list.add(SymbolItem(symbol.ARS , "ARS"))
        list.add(SymbolItem(symbol.AUD , "AUD"))
        list.add(SymbolItem(symbol.AWG , "AWG"))
        list.add(SymbolItem(symbol.AZN , "AZN"))

        list.add(SymbolItem(symbol.BAM, "BAM"))
        list.add(SymbolItem(symbol.BBD , "BBD"))
        list.add(SymbolItem(symbol.BDT , "BDT"))
        list.add(SymbolItem(symbol.BGN , "BGN"))
        list.add(SymbolItem(symbol.BHD , "BHD"))
        list.add(SymbolItem(symbol.BIF , "BIF"))
        list.add(SymbolItem(symbol.BMD , "BMD"))
        list.add(SymbolItem(symbol.BND , "BND"))
        list.add(SymbolItem(symbol.BOB , "BOB"))
        list.add(SymbolItem(symbol.BRL , "BRL"))
        list.add(SymbolItem(symbol.BSD , "BSD"))
        list.add(SymbolItem(symbol.BTC , "BTC"))
        list.add(SymbolItem(symbol.BTN , "BTN"))
        list.add(SymbolItem(symbol.BWP , "BWP"))
        list.add(SymbolItem(symbol.BYN , "BYN"))
        list.add(SymbolItem(symbol.BYR , "BYR"))
        list.add(SymbolItem(symbol.BZD , "BZD"))


        list.add(SymbolItem(symbol.CAD , "CAD"))
        list.add(SymbolItem(symbol.CDF , "CDF"))
        list.add(SymbolItem(symbol.CHF , "CHF"))
        list.add(SymbolItem(symbol.CLF , "CLF"))
        list.add(SymbolItem(symbol.CLP , "CLP"))
        list.add(SymbolItem(symbol.CNY , "CNY"))
        list.add(SymbolItem(symbol.COP , "COP"))
        list.add(SymbolItem(symbol.CRC , "CRC"))
        list.add(SymbolItem(symbol.CUC , "CUC"))
        list.add(SymbolItem(symbol.CUP , "CUP"))
        list.add(SymbolItem(symbol.CVE , "CVE"))
        list.add(SymbolItem(symbol.CZK , "CZK"))

        list.add(SymbolItem(symbol.DJF , "DJF"))
        list.add(SymbolItem(symbol.DKK , "DKK"))
        list.add(SymbolItem(symbol.DOP , "DOP"))
        list.add(SymbolItem(symbol.DZD , "DZD"))


        list.add(SymbolItem(symbol.EGP , "EGP"))
        list.add(SymbolItem(symbol.ERN , "ERN"))
        list.add(SymbolItem(symbol.ETB , "ETB"))
        list.add(SymbolItem(symbol.EUR , "EUR"))


        list.add(SymbolItem(symbol.FJD , "FJD"))
        list.add(SymbolItem(symbol.FKP , "FKP"))


        list.add(SymbolItem(symbol.GBP , "GBP"))
        list.add(SymbolItem(symbol.GEL , "GEL"))
        list.add(SymbolItem(symbol.GGP , "GGP"))
        list.add(SymbolItem(symbol.GHS , "GHS"))
        list.add(SymbolItem(symbol.GIP , "GIP"))
        list.add(SymbolItem(symbol.GMD , "GMD"))
        list.add(SymbolItem(symbol.GNF , "GNF"))
        list.add(SymbolItem(symbol.GTQ , "GTQ"))
        list.add(SymbolItem(symbol.GYD , "GYD"))


        list.add(SymbolItem(symbol.HKD , "HKD"))
        list.add(SymbolItem(symbol.HNL , "HNL"))
        list.add(SymbolItem(symbol.HRK , "HRK"))
        list.add(SymbolItem(symbol.HTG , "HTG"))
        list.add(SymbolItem(symbol.HUF , "HUF"))

        list.add(SymbolItem(symbol.IDR , "IDR"))
        list.add(SymbolItem(symbol.ILS , "ILS"))
        list.add(SymbolItem(symbol.IMP , "IMP"))
        list.add(SymbolItem(symbol.INR , "INR"))
        list.add(SymbolItem(symbol.IQD , "IQD"))
        list.add(SymbolItem(symbol.IRR , "IRR"))
        list.add(SymbolItem(symbol.ISK , "ISK"))


        list.add(SymbolItem(symbol.JEP , "JEP"))
        list.add(SymbolItem(symbol.JMD , "JMD"))
        list.add(SymbolItem(symbol.JOD , "JOD"))
        list.add(SymbolItem(symbol.JPY , "JPY"))


        list.add(SymbolItem(symbol.KES , "KES"))
        list.add(SymbolItem(symbol.KGS , "KGS"))
        list.add(SymbolItem(symbol.KHR , "KHR"))
        list.add(SymbolItem(symbol.KMF , "KMF"))
        list.add(SymbolItem(symbol.KPW , "KPW"))
        list.add(SymbolItem(symbol.KRW , "KRW"))
        list.add(SymbolItem(symbol.KWD , "KWD"))
        list.add(SymbolItem(symbol.KYD , "KYD"))
        list.add(SymbolItem(symbol.KZT , "KZT"))


        list.add(SymbolItem(symbol.LAK , "LAK"))
        list.add(SymbolItem(symbol.LBP , "LBP"))
        list.add(SymbolItem(symbol.LKR , "LKR"))
        list.add(SymbolItem(symbol.LRD , "LRD"))
        list.add(SymbolItem(symbol.LSL , "LSL"))
        list.add(SymbolItem(symbol.LTL , "LTL"))
        list.add(SymbolItem(symbol.LVL , "LVL"))
        list.add(SymbolItem(symbol.LYD , "LYD"))


        list.add(SymbolItem(symbol.MAD , "MAD"))
        list.add(SymbolItem(symbol.MDL , "MDL"))
        list.add(SymbolItem(symbol.MGA , "MGA"))
        list.add(SymbolItem(symbol.MKD , "MKD"))
        list.add(SymbolItem(symbol.MMK , "MMK"))
        list.add(SymbolItem(symbol.MNT , "MNT"))
        list.add(SymbolItem(symbol.MOP , "MOP"))
        list.add(SymbolItem(symbol.MRO , "MRO"))
        list.add(SymbolItem(symbol.MUR , "MUR"))
        list.add(SymbolItem(symbol.MVR , "MVR"))
        list.add(SymbolItem(symbol.MWK , "MWK"))
        list.add(SymbolItem(symbol.MXN , "MXN"))
        list.add(SymbolItem(symbol.MYR , "MYR"))
        list.add(SymbolItem(symbol.MZN , "MZN"))


        list.add(SymbolItem(symbol.NAD , "NAD"))
        list.add(SymbolItem(symbol.NGN , "NGN"))
        list.add(SymbolItem(symbol.NGN , "NGN"))
        list.add(SymbolItem(symbol.NIO , "NIO"))
        list.add(SymbolItem(symbol.NPR , "NPR"))
        list.add(SymbolItem(symbol.NZD , "NZD"))

        list.add(SymbolItem(symbol.OMR , "OMR"))

        list.add(SymbolItem(symbol.PAB , "PAB"))
        list.add(SymbolItem(symbol.PEN , "PEN"))
        list.add(SymbolItem(symbol.PGK , "PGK"))
        list.add(SymbolItem(symbol.PHP , "PHP"))
        list.add(SymbolItem(symbol.PKR , "PKR"))
        list.add(SymbolItem(symbol.PLN , "PLN"))
        list.add(SymbolItem(symbol.PYG , "PYG"))


        list.add(SymbolItem(symbol.QAR , "QAR"))


        list.add(SymbolItem(symbol.RON , "RON"))
        list.add(SymbolItem(symbol.RSD , "RSD"))
        list.add(SymbolItem(symbol.RUB , "RUB"))
        list.add(SymbolItem(symbol.RWF , "RWF"))


        list.add(SymbolItem(symbol.SAR , "SAR"))
        list.add(SymbolItem(symbol.SBD , "SBD"))
        list.add(SymbolItem(symbol.SCR , "SCR"))
        list.add(SymbolItem(symbol.SDG , "SDG"))
        list.add(SymbolItem(symbol.SEK , "SEK"))
        list.add(SymbolItem(symbol.SGD , "SGD"))
        list.add(SymbolItem(symbol.SHP , "SHP"))
        list.add(SymbolItem(symbol.SLE , "SLE"))
        list.add(SymbolItem(symbol.SLL , "SLL"))
        list.add(SymbolItem(symbol.SOS , "SOS"))
        list.add(SymbolItem(symbol.SRD , "SRD"))
        list.add(SymbolItem(symbol.STD , "STD"))
        list.add(SymbolItem(symbol.SVC , "SVC"))
        list.add(SymbolItem(symbol.SYP , "SYP"))
        list.add(SymbolItem(symbol.SZL , "SZL"))


        list.add(SymbolItem(symbol.THB , "THB"))
        list.add(SymbolItem(symbol.TJS , "TJS"))
        list.add(SymbolItem(symbol.TMT , "TMT"))
        list.add(SymbolItem(symbol.TND , "TND"))
        list.add(SymbolItem(symbol.TOP , "TOP"))
        list.add(SymbolItem(symbol.TRY , "TRY"))
        list.add(SymbolItem(symbol.TTD , "TTD"))
        list.add(SymbolItem(symbol.TWD , "TWD"))
        list.add(SymbolItem(symbol.TZS , "TZS"))


        list.add(SymbolItem(symbol.UAH , "UAH"))
        list.add(SymbolItem(symbol.UGX , "UGX"))
        list.add(SymbolItem(symbol.USD , "USD"))
        list.add(SymbolItem(symbol.UYU , "UYU"))
        list.add(SymbolItem(symbol.UZS , "UZS"))


        list.add(SymbolItem(symbol.VEF , "VEF"))
        list.add(SymbolItem(symbol.VES , "VES"))
        list.add(SymbolItem(symbol.VND , "VND"))
        list.add(SymbolItem(symbol.VUV , "VUV"))


        list.add(SymbolItem(symbol.WST , "WST"))


        list.add(SymbolItem(symbol.XAF , "XAF"))
        list.add(SymbolItem(symbol.XAG , "XAG"))
        list.add(SymbolItem(symbol.XAU , "XAU"))
        list.add(SymbolItem(symbol.XCD , "XCD"))
        list.add(SymbolItem(symbol.XDR , "XDR"))
        list.add(SymbolItem(symbol.XOF , "XOF"))
        list.add(SymbolItem(symbol.XPF , "XPF"))


        list.add(SymbolItem(symbol.YER , "YER"))


        list.add(SymbolItem(symbol.ZAR , "ZAR"))
        list.add(SymbolItem(symbol.ZMK , "ZMK"))
        list.add(SymbolItem(symbol.ZMW , "ZMW"))
        list.add(SymbolItem(symbol.ZWL , "ZWL"))



        result.symbols = list

        return result
    }

}