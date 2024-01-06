package com.example.findrestaurant.common

import com.example.findrestaurant.BuildConfig

object AppConstant {

    val isDebug = BuildConfig.DEBUG

    const val API_REAL = "https://openapi.gg.go.kr/ParagonRestaurant" //Todo 운영용 api 요청 url. base url. ex)http://openapi.seoul.go.kr:8088
    const val API_DEV = "https://openapi.gg.go.kr/ParagonRestaurant" //Todo 개발용 api 요청 url. base url. ex)http://dev.openapi.seoul.go.kr:8088
    val API_HOST = if (isDebug) API_DEV else API_REAL //Todo 개발과 운영 서버가 나눠져 있지 않다면 REAL 과 DEV 가 동일.

    const val API_AUTH_KEY = "2f426691ed814443b634e610f35713e7" //Todo 공공 api 사용을 위한 인증 키. 공공 api 사용 사이트에서 발급. ex)52454256736a62738133304d7962756e

    //int code
    const val REQ_CODE_PROPERTIES = 750_001

}