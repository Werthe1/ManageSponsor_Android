package jiyun.com.managesponsor.data

import java.util.*

class Agreement (

    var agreementId : String="" ,//약정번호
    var startDate : Date?=null ,//시작일
    var endDate : Date?=null ,//마감일
    var pay : Long = 0 ,//납입액
    var sponsorName : String="", //회원명
    var sponsorNum : String="",//회원번호
    var payDay : Int =0 , //납입일
    var payMethod :String ="" ,//납입 방법
    var bankName : String= "",//은행
    var accountNo : String = "",//계좌번호
    var accountHolder : String = "", //예금주
    var sponsorBirth :String="" //생년월일

)
