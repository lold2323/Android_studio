package com.example.findrestaurant.model

import com.google.gson.annotations.SerializedName
import com.example.findrestaurant.common.AppConstant

//Todo 사용하려는 공공 api 에 맞춰 수정하여 사용.
// JobInfoRequest.kt 파일을 참고.
data class InfoRequest(

    @SerializedName("KEY") //api 명세에 정의된 파라메터 명.
    val authKey: String = AppConstant.API_AUTH_KEY, //앱에서 사용 하려는 변수명.

    @SerializedName("Type")
    val responseType: String = "json",

    //요청 변수 추가...
)