package com.hankyong.hankyongsample.common

object BuildConfig {
    const val DEBUG = true
    const val API_REAL = "http://openapi.seoul.go.kr:8088"
    const val API_DEV = "http://dev.openapi.seoul.go.kr:8088"
    const val API_AUTH_KEY = "d60393d3468b47ff8f5cb1fe32ceaa42"
    const val REQ_CODE_PROPERTIES = 750_001
    const val NOTIFICATION_CHANNEL_ID = "${BuildConfig.}.notification.channel"
    const val NOTIFICATION_ID_DEFAULT = 850_001
    const val NOTIFICATION_ID_STEPS = 850_002
    const val STR_KEY_SOME = "key.some"
    const val STR_USER_ID = "pref.user.id"
    const val STR_USER_NAME = "pref.user.name"
}