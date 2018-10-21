package jiyun.com.managesponsor.data

import java.util.*

class BankLog (

    var state: String = "", //상태
    var stateCode : Int =0 , //상태 코드 , 0 에러 1 정상 2 신청
    var writeDate: Date? = null, //발생일
    var agreementId: String = "", //약정 번호
    var donationPurpose: String = "", //기부목적
    var sponsorName : String="" //회원명

)