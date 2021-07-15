package com.shong.practice_sharedpreferences

import android.app.Application

class MyApp : Application() {
    companion object{
        lateinit var pref_Global : MyPreferences
    }

    override fun onCreate() {
        super.onCreate()
        pref_Global = MyPreferences(applicationContext)
    }
}