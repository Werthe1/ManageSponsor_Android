package jiyun.com.managesponsor.data

import java.util.*

class Schedule (

    var date : Date?=null ,//이벤트 발생일
    var content : String = "", //내용
    var writer : String="", //작성자
    var alert : Int =0 //알림 주기
)