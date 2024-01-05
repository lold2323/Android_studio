package com.hankyong.hankyongsample.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

/**
 * 모범 식당 응답 데이터.
 */
data class RestaurantInfoResponse(
    /**
     * 요청 조건에 부합 하는 모범 식당 정보 총 수.
     */
    @SerializedName("list_total_count")
    val listTotalCount: Int,
    /**
     * 요청에 대한 상태 결과.
     */
    @SerializedName("RESULT")
    val requestResult: DataResult,
    /**
     * 모범 식당 리스트.
     */
    @SerializedName("row")
    val restaurantInfoDetailList: List<RestaurantInfoDetail>,
)

/**
 * 응답 결과(상태).
 */
data class DataResult(
    @SerializedName("CODE")
    val resultCode: String,
    @SerializedName("MESSAGE")
    val resultMessage: String,
)

/**
 * 모범 식당 상세.
 */
@Parcelize
data class RestaurantInfoDetail(
    /**
     * SUM_YY : 집계년도
     */
    @SerializedName("SUM_YY")
    val restaurantSumYear: String,
    /**
     * QU : 분기
     */
    @SerializedName("QU")
    val restaurantQU: String,
    /**
     * SIGUN_NM : 시군명
     */
    @SerializedName("SIGUN_NM")
    val cityName: String,
    /**
     * SIGUN_CD : 시군코드
     */
    @SerializedName("SIGUN_CD")
    val cityCode: String,
    /**
     * BIZESTBL_NM : 업소명
     */
    @SerializedName("BIZESTBL_NM")
    val restaurantName: String,
    /**
     * TELNO : 전화번호
     */
    @SerializedName("TELNO")
    val restaurantTel: String,
    /**
     * BIZCOND_NM : 업체명
     */
    @SerializedName("BIZCOND_NM")
    val businessNane: String,
    /**
     * MAIN_MENU_NM : 주메뉴명
     */
    @SerializedName("MAIN_MENU_NM")
    val mainMenu: String,
    /**
     * REFINE_ZIP_CD : 소재지우편번호
     */
    @SerializedName("REFINE_ZIP_CD")
    val zipCode: String,
    /**
     * REFINE_LOTNO_ADDR : 소재지지번주소
     */
    @SerializedName("REFINE_LOTNO_ADDR")
    val localAddress: String,
    /**
     * EMPLYM_STLE_CMMN_MM : 소재지도로명주소
     */
    @SerializedName("EMPLYM_STLE_CMMN_MM")
    val roadAddress: String,
    /**
     * REFINE_WGS84_LAT : WGS84위도
     */
    @SerializedName("REFINE_WGS84_LAT")
    val latitude: String,
    /**
     * REFINE_WGS84_LOGT : WGS84경도
     */
    @SerializedName("REFINE_WGS84_LOGT")
    val longitude: String,
) : Parcelable
