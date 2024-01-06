package com.example.findrestaurant

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.example.findrestaurant.common.AppConstant
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class MyApplication : Application() {

    companion object {
        lateinit var gson: Gson

    }

    init {
        gson = GsonBuilder().setLenient().create()
    }

    override fun onCreate() {
        super.onCreate()


        if (AppConstant.isDebug) {
            Timber.plant(Timber.DebugTree())
        }
    }
}

