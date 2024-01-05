package com.hankyong.hankyongsample.functional

//Todo 앱에서 사용하는 enum 클래스들을 정의하여 사용.
// 아래 코드들은 '서울시 일자리플러스센터 채용 정보' api 요청에서 사용. SampleApiInfo 파일 참조.
// 필요 시 사용 하는 공공 api 에 따라, 정의 하여 사용.

/**
 * 좌표 코드.
 */
enum class Coordinates(val code: String) {
    WGS84_LAT("WGS84위도"),
    WGS84_LOG("WGS84경도"),
}

/**
 * 업소 세부 코드.
 */
enum class Business(val codeName: String) {
    업태명("업태명"),
    주메뉴명("주메뉴명"),
}

/**
 * 소재지 코드
 */
enum class Location(val code: String) {
    시군명("시군명"),
    시군코드("시군코드"),
    소재지지번주소("소재지지번주소"),
    소재지도로명주소("소재지도로명주소"),
}