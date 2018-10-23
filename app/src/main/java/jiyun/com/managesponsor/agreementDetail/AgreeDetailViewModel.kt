package jiyun.com.managesponsor.agreementDetail

class AgreeDetailViewModel(val navi: AgreeDetailNavigator) {

    fun onGoExpireClick() {
       AgreeDetailDoneFragment()
               .show(navi.getSupportFragmentManager(), "expire")
    }

    fun onDialClick(phoneNumber: String) {
        navi.preparePhoneCall(phoneNumber)
    }
}