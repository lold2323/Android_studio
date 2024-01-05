package com.hankyong.hankyongsample.network

import com.google.gson.annotations.SerializedName

//Todo 공공 api 응답의 최상위 객체를 위한 데이터 클래스.

data class BaseResponse<out T>(
    @SerializedName("GetJobInfo")
    val info: T?
)