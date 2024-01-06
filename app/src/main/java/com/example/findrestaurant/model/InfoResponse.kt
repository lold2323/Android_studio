package com.example.findrestaurant.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

//Todo 사용하려는 공공 api 에 맞춰 수정하여 사용.
// JobInfoResponse.kt 파일을 참고.
data class InfoResponse(

    //Todo 예시 응답 값..
    @SerializedName("list_total_count")
    val listTotalCount: Int,

    @SerializedName("row")
    val infoDetailList: List<InfoDetail>,

    //Todo 여기에 데이터들을 추가..
)

@Parcelize
data class InfoDetail(

    //Todo 상호명.
    @SerializedName("BIZESTBL_NM")
    val nameRestaurant: String,

    //Todo .
    @SerializedName("REFINE_WGS84_LOGT")
    val lngRestaurant: String,

    @SerializedName("REFINE_WGS84_LAT")
    val latRestaurant: String,

    //Todo 여기에 데이터들을 추가..
) : Parcelable