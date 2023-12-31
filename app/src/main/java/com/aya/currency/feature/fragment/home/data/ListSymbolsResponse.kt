package com.aya.currency.feature.fragment.home.data

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ListSymbolsResponse (

    @SerializedName("AED") var AED : String,
    @SerializedName("AFN") var AFN : String,
    @SerializedName("ALL") var ALL : String,
    @SerializedName("AMD") var AMD : String,
    @SerializedName("ANG") var ANG : String,
    @SerializedName("AOA") var AOA : String,
    @SerializedName("ARS") var ARS : String,
    @SerializedName("AUD") var AUD : String,
    @SerializedName("AWG") var AWG : String,
    @SerializedName("AZN") var AZN : String,

    @SerializedName("BAM") var BAM : String,
    @SerializedName("BBD") var BBD : String,
    @SerializedName("BDT") var BDT : String,
    @SerializedName("BGN") var BGN : String,
    @SerializedName("BHD") var BHD : String,
    @SerializedName("BIF") var BIF : String,
    @SerializedName("BMD") var BMD : String,
    @SerializedName("BND") var BND : String,
    @SerializedName("BOB") var BOB : String,
    @SerializedName("BRL") var BRL : String,
    @SerializedName("BSD") var BSD : String,
    @SerializedName("BTC") var BTC : String,
    @SerializedName("BTN") var BTN : String,
    @SerializedName("BWP") var BWP : String,
    @SerializedName("BYN") var BYN : String,
    @SerializedName("BYR") var BYR : String,
    @SerializedName("BZD") var BZD : String,

    @SerializedName("CAD") var CAD : String,
    @SerializedName("CDF") var CDF : String,
    @SerializedName("CHF") var CHF : String,
    @SerializedName("CLF") var CLF : String,
    @SerializedName("CLP") var CLP : String,
    @SerializedName("CNY") var CNY : String,
    @SerializedName("COP") var COP : String,
    @SerializedName("CRC") var CRC : String,
    @SerializedName("CUC") var CUC : String,
    @SerializedName("CUP") var CUP : String,
    @SerializedName("CVE") var CVE : String,
    @SerializedName("CZK") var CZK : String,


    @SerializedName("DJF") var DJF : String,
    @SerializedName("DKK") var DKK : String,
    @SerializedName("DOP") var DOP : String,
    @SerializedName("DZD") var DZD : String,

    @SerializedName("EGP") var EGP : String,
    @SerializedName("ERN") var ERN : String,
    @SerializedName("ETB") var ETB : String,
    @SerializedName("EUR") var EUR : String,

    @SerializedName("FJD") var FJD : String,
    @SerializedName("FKP") var FKP : String,

    @SerializedName("GBP") var GBP : String,
    @SerializedName("GEL") var GEL : String,
    @SerializedName("GGP") var GGP : String,
    @SerializedName("GHS") var GHS : String,
    @SerializedName("GIP") var GIP : String,
    @SerializedName("GMD") var GMD : String,
    @SerializedName("GNF") var GNF : String,
    @SerializedName("GTQ") var GTQ : String,
    @SerializedName("GYD") var GYD : String,


    @SerializedName("HKD") var HKD : String,
    @SerializedName("HNL") var HNL : String,
    @SerializedName("HRK") var HRK : String,
    @SerializedName("HTG") var HTG : String,
    @SerializedName("HUF") var HUF : String,


    @SerializedName("IDR") var IDR : String,
    @SerializedName("ILS") var ILS : String,
    @SerializedName("IMP") var IMP : String,
    @SerializedName("INR") var INR : String,
    @SerializedName("IQD") var IQD : String,
    @SerializedName("IRR") var IRR : String,
    @SerializedName("ISK") var ISK : String,


    @SerializedName("JEP") var JEP : String,
    @SerializedName("JMD") var JMD : String,
    @SerializedName("JOD") var JOD : String,
    @SerializedName("JPY") var JPY : String,

    @SerializedName("KES") var KES : String,
    @SerializedName("KGS") var KGS : String,
    @SerializedName("KHR") var KHR : String,
    @SerializedName("KMF") var KMF : String,
    @SerializedName("KPW") var KPW : String,
    @SerializedName("KRW") var KRW : String,
    @SerializedName("KWD") var KWD : String,
    @SerializedName("KYD") var KYD : String,
    @SerializedName("KZT") var KZT : String,


    @SerializedName("LAK") var LAK : String,
    @SerializedName("LBP") var LBP : String,
    @SerializedName("LKR") var LKR : String,
    @SerializedName("LRD") var LRD : String,
    @SerializedName("LSL") var LSL : String,
    @SerializedName("LTL") var LTL : String,
    @SerializedName("LVL") var LVL : String,
    @SerializedName("LYD") var LYD : String,


    @SerializedName("MAD") var MAD : String,
    @SerializedName("MDL") var MDL : String,
    @SerializedName("MGA") var MGA : String,
    @SerializedName("MKD") var MKD : String,
    @SerializedName("MMK") var MMK : String,
    @SerializedName("MNT") var MNT : String,
    @SerializedName("MOP") var MOP : String,
    @SerializedName("MRO") var MRO : String,
    @SerializedName("MUR") var MUR : String,
    @SerializedName("MVR") var MVR : String,
    @SerializedName("MWK") var MWK : String,
    @SerializedName("MXN") var MXN : String,
    @SerializedName("MYR") var MYR : String,
    @SerializedName("MZN") var MZN : String,


    @SerializedName("NAD") var NAD : String,
    @SerializedName("NGN") var NGN : String,
    @SerializedName("NIO") var NIO : String,
    @SerializedName("NOK") var NOK : String,
    @SerializedName("NPR") var NPR : String,
    @SerializedName("NZD") var NZD : String,


    @SerializedName("OMR") var OMR : String,

    @SerializedName("PAB") var PAB : String,
    @SerializedName("PEN") var PEN : String,
    @SerializedName("PGK") var PGK : String,
    @SerializedName("PHP") var PHP : String,
    @SerializedName("PKR") var PKR : String,
    @SerializedName("PLN") var PLN : String,
    @SerializedName("PYG") var PYG : String,


    @SerializedName("QAR") var QAR : String,

    @SerializedName("RON") var RON : String,
    @SerializedName("RSD") var RSD : String,
    @SerializedName("RUB") var RUB : String,
    @SerializedName("RWF") var RWF : String,

    @SerializedName("SAR") var SAR : String,
    @SerializedName("SBD") var SBD : String,
    @SerializedName("SCR") var SCR : String,
    @SerializedName("SDG") var SDG : String,
    @SerializedName("SEK") var SEK : String,
    @SerializedName("SGD") var SGD : String,
    @SerializedName("SHP") var SHP : String,
    @SerializedName("SLE") var SLE : String,
    @SerializedName("SLL") var SLL : String,
    @SerializedName("SOS") var SOS : String,
    @SerializedName("SRD") var SRD : String,
    @SerializedName("STD") var STD : String,
    @SerializedName("SVC") var SVC : String,
    @SerializedName("SYP") var SYP : String,
    @SerializedName("SZL") var SZL : String,


    @SerializedName("THB") var THB : String,
    @SerializedName("TJS") var TJS : String,
    @SerializedName("TMT") var TMT : String,
    @SerializedName("TND") var TND : String,
    @SerializedName("TOP") var TOP : String,
    @SerializedName("TRY") var TRY : String,
    @SerializedName("TTD") var TTD : String,
    @SerializedName("TWD") var TWD : String,
    @SerializedName("TZS") var TZS : String,

    @SerializedName("UAH") var UAH : String,
    @SerializedName("UGX") var UGX : String,
    @SerializedName("USD") var USD : String,
    @SerializedName("UYU") var UYU : String,
    @SerializedName("UZS") var UZS : String,

    @SerializedName("VEF") var VEF : String,
    @SerializedName("VES") var VES : String,
    @SerializedName("VND") var VND : String,
    @SerializedName("VUV") var VUV : String,

    @SerializedName("WST") var WST : String,

    @SerializedName("XAF") var XAF : String,
    @SerializedName("XAG") var XAG : String,
    @SerializedName("XAU") var XAU : String,
    @SerializedName("XCD") var XCD : String,
    @SerializedName("XDR") var XDR : String,
    @SerializedName("XOF") var XOF : String,
    @SerializedName("XPF") var XPF : String,

    @SerializedName("YER") var YER : String,

    @SerializedName("ZAR") var ZAR : String,
    @SerializedName("ZMK") var ZMK : String,
    @SerializedName("ZMW") var ZMW : String,
    @SerializedName("ZWL") var ZWL : String


): Parcelable