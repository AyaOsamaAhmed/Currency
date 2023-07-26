package com.aya.currency.feature.fragment.home.domain

import com.aya.currency.feature.fragment.home.data.*

object LatestMapper {

    fun mapData(res: LatestResponse): LatestItem {
        val result = LatestItem()

        result.success = res.success
        result.date = res.date
        result.timestamp = res.timestamp
        result.base = res.base
        
        val rate = res.rates
        val list : MutableList<RateItem> = mutableListOf()

        list.add(RateItem( "AED" , rate.AED ))
        list.add(RateItem( "AFN" , rate.AFN ))
        list.add(RateItem( "ALL" , rate.ALL ))
        list.add(RateItem( "AMD" ,rate.AMD ))
        list.add(RateItem( "ANG" , rate.ANG ))
        list.add(RateItem( "AOA", rate.AOA ))
        list.add(RateItem( "ARS" , rate.ARS ))
        list.add(RateItem( "AUD" , rate.AUD ))
        list.add(RateItem( "AWG" , rate.AWG ))
        list.add(RateItem("AZN" , rate.AZN ))

        list.add(RateItem( "BAM" , rate.BAM))
        list.add(RateItem("BBD" ,rate.BBD ))
        list.add(RateItem( "BDT" , rate.BDT ))
        list.add(RateItem( "BGN" , rate.BGN ))
        list.add(RateItem("BHD" ,rate.BHD ))
        list.add(RateItem( "BIF" , rate.BIF ))
        list.add(RateItem("BMD" , rate.BMD ))
        list.add(RateItem( "BND" , rate.BND ))
        list.add(RateItem( "BOB" , rate.BOB ))
        list.add(RateItem( "BRL" , rate.BRL ))
        list.add(RateItem( "BSD" , rate.BSD ))
        list.add(RateItem( "BTC" , rate.BTC ))
        list.add(RateItem("BTN" , rate.BTN ))
        list.add(RateItem( "BWP" , rate.BWP ))
        list.add(RateItem( "BYN" , rate.BYN ))
        list.add(RateItem( "BYR" , rate.BYR ))
        list.add(RateItem("BZD" , rate.BZD ))


        list.add(RateItem( "CAD" , rate.CAD ))
        list.add(RateItem("CDF" , rate.CDF ))
        list.add(RateItem("CHF" , rate.CHF ))
        list.add(RateItem( "CLF" , rate.CLF ))
        list.add(RateItem( "CLP" , rate.CLP ))
        list.add(RateItem( "CNY" , rate.CNY ))
        list.add(RateItem( "COP" , rate.COP ))
        list.add(RateItem("CRC" , rate.CRC ))
        list.add(RateItem( "CUC" , rate.CUC ))
        list.add(RateItem( "CUP" , rate.CUP ))
        list.add(RateItem( "CVE" , rate.CVE ))
        list.add(RateItem( "CZK" , rate.CZK ))

        list.add(RateItem( "DJF" , rate.DJF ))
        list.add(RateItem( "DKK" , rate.DKK ))
        list.add(RateItem( "DOP" , rate.DOP ))
        list.add(RateItem( "DZD" , rate.DZD ))


        list.add(RateItem( "EGP" , rate.EGP ))
        list.add(RateItem( "ERN" , rate.ERN ))
        list.add(RateItem( "ETB" , rate.ETB ))
        list.add(RateItem( "EUR" , rate.EUR ))


        list.add(RateItem( "FJD" ,rate.FJD ))
        list.add(RateItem( "FKP" , rate.FKP ))


        list.add(RateItem( "GBP" , rate.GBP ))
        list.add(RateItem( "GEL" , rate.GEL ))
        list.add(RateItem("GGP" , rate.GGP ))
        list.add(RateItem( "GHS" , rate.GHS ))
        list.add(RateItem( "GIP" , rate.GIP ))
        list.add(RateItem( "GMD" , rate.GMD ))
        list.add(RateItem( "GNF" , rate.GNF ))
        list.add(RateItem( "GTQ" , rate.GTQ ))
        list.add(RateItem( "GYD" , rate.GYD ))


        list.add(RateItem( "HKD" , rate.HKD ))
        list.add(RateItem( "HNL" , rate.HNL ))
        list.add(RateItem( "HRK" , rate.HRK ))
        list.add(RateItem( "HTG" , rate.HTG ))
        list.add(RateItem( "HUF" , rate.HUF ))

        list.add(RateItem( "IDR" , rate.IDR ))
        list.add(RateItem( "ILS" , rate.ILS ))
        list.add(RateItem( "IMP" , rate.IMP ))
        list.add(RateItem( "INR" , rate.INR ))
        list.add(RateItem( "IQD" , rate.IQD ))
        list.add(RateItem( "IRR" , rate.IRR ))
        list.add(RateItem( "ISK" , rate.ISK ))


        list.add(RateItem( "JEP" , rate.JEP ))
        list.add(RateItem( "JMD" , rate.JMD ))
        list.add(RateItem( "JOD" , rate.JOD ))
        list.add(RateItem( "JPY" , rate.JPY ))


        list.add(RateItem( "KES" , rate.KES ))
        list.add(RateItem( "KGS" , rate.KGS ))
        list.add(RateItem( "KHR" , rate.KHR ))
        list.add(RateItem( "KMF" , rate.KMF ))
        list.add(RateItem( "KPW" , rate.KPW ))
        list.add(RateItem( "KRW" , rate.KRW ))
        list.add(RateItem( "KWD" , rate.KWD ))
        list.add(RateItem( "KYD" , rate.KYD ))
        list.add(RateItem( "KZT" , rate.KZT ))


        list.add(RateItem("LAK" , rate.LAK ))
        list.add(RateItem( "LBP" , rate.LBP ))
        list.add(RateItem( "LKR" , rate.LKR ))
        list.add(RateItem( "LRD" , rate.LRD ))
        list.add(RateItem( "LSL" , rate.LSL ))
        list.add(RateItem( "LTL" , rate.LTL ))
        list.add(RateItem( "LVL" , rate.LVL ))
        list.add(RateItem( "LYD" , rate.LYD ))


        list.add(RateItem( "MAD" , rate.MAD ))
        list.add(RateItem( "MDL" , rate.MDL ))
        list.add(RateItem( "MGA" , rate.MGA ))
        list.add(RateItem("MKD" , rate.MKD ))
        list.add(RateItem( "MMK" , rate.MMK ))
        list.add(RateItem( "MNT" , rate.MNT ))
        list.add(RateItem( "MOP" ,rate.MOP ))
        list.add(RateItem( "MRO" , rate.MRO ))
        list.add(RateItem( "MUR" , rate.MUR ))
        list.add(RateItem( "MVR" , rate.MVR ))
        list.add(RateItem("MWK" , rate.MWK ))
        list.add(RateItem( "MXN" ,rate.MXN ))
        list.add(RateItem( "MYR" , rate.MYR ))
        list.add(RateItem( "MZN" , rate.MZN ))


        list.add(RateItem( "NAD" , rate.NAD ))
        list.add(RateItem( "NGN" , rate.NGN ))
        list.add(RateItem( "NIO" , rate.NIO ))
        list.add(RateItem( "NPR" ,rate.NPR ))
        list.add(RateItem( "NZD" , rate.NZD ))

        list.add(RateItem( "OMR" ,rate.OMR ))

        list.add(RateItem( "PAB" , rate.PAB ))
        list.add(RateItem( "PEN" , rate.PEN ))
        list.add(RateItem( "PGK" , rate.PGK ))
        list.add(RateItem( "PHP" , rate.PHP ))
        list.add(RateItem( "PKR" , rate.PKR ))
        list.add(RateItem( "PLN" , rate.PLN ))
        list.add(RateItem( "PYG" , rate.PYG ))


        list.add(RateItem( "QAR" , rate.QAR ))


        list.add(RateItem("RON" , rate.RON ))
        list.add(RateItem( "RSD" , rate.RSD ))
        list.add(RateItem( "RUB" , rate.RUB ))
        list.add(RateItem( "RWF" , rate.RWF ))


        list.add(RateItem( "SAR" , rate.SAR ))
        list.add(RateItem( "SBD" , rate.SBD ))
        list.add(RateItem( "SCR" ,rate.SCR ))
        list.add(RateItem( "SDG" , rate.SDG ))
        list.add(RateItem( "SEK" ,rate.SEK ))
        list.add(RateItem( "SGD" , rate.SGD ))
        list.add(RateItem( "SHP" , rate.SHP ))
        list.add(RateItem( "SLE" , rate.SLE ))
        list.add(RateItem( "SLL" , rate.SLL ))
        list.add(RateItem( "SOS" , rate.SOS ))
        list.add(RateItem( "SRD" , rate.SRD ))
        list.add(RateItem( "STD" , rate.STD ))
        list.add(RateItem( "SVC" , rate.SVC ))
        list.add(RateItem( "SYP" , rate.SYP ))
        list.add(RateItem( "SZL" , rate.SZL ))


        list.add(RateItem( "THB" ,rate.THB ))
        list.add(RateItem("TJS" , rate.TJS ))
        list.add(RateItem( "TMT" , rate.TMT ))
        list.add(RateItem( "TND" , rate.TND ))
        list.add(RateItem( "TOP" ,rate.TOP ))
        list.add(RateItem("TRY" ,rate.TRY ))
        list.add(RateItem( "TTD" , rate.TTD ))
        list.add(RateItem( "TWD" , rate.TWD ))
        list.add(RateItem("TZS" , rate.TZS ))


        list.add(RateItem( "UAH" ,rate.UAH))
        list.add(RateItem( "UGX" , rate.UGX ))
        list.add(RateItem("USD" ,rate.USD ))
        list.add(RateItem( "UYU" , rate.UYU ))
        list.add(RateItem( "UZS" , rate.UZS ))


        list.add(RateItem( "VEF" ,rate.VEF ))
        list.add(RateItem( "VES" , rate.VES ))
        list.add(RateItem( "VND" , rate.VND ))
        list.add(RateItem( "VUV" ,rate.VUV ))


        list.add(RateItem( "WST" ,rate.WST ))


        list.add(RateItem( "XAF" ,rate.XAF ))
        list.add(RateItem( "XAG" , rate.XAG ))
        list.add(RateItem( "XAU" , rate.XAU ))
        list.add(RateItem( "XCD" , rate.XCD ))
        list.add(RateItem( "XDR" , rate.XDR ))
        list.add(RateItem( "XOF", rate.XOF ))
        list.add(RateItem( "XPF" ,rate.XPF ))


        list.add(RateItem( "YER" , rate.YER ))


        list.add(RateItem( "ZAR" ,rate.ZAR ))
        list.add(RateItem("ZMK" , rate.ZMK ))
        list.add(RateItem( "ZMW" , rate.ZMW ))
        list.add(RateItem( "ZWL" , rate.ZWL ))



        result.rates = list

        return result
    }

}