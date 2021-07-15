package com.shong.practice_sharedpreferences

import android.content.Context
import android.content.SharedPreferences


class MyPreferences(context : Context) : PrefInterface{
    private val pref : SharedPreferences= context.getSharedPreferences("test", Context.MODE_PRIVATE)

    override fun setName(name: String) = pref.edit().putString("name",name).apply()

    override fun getName() : String = pref.getString("name","")!!

    override fun setAge(age: Int) = pref.edit().putInt("age",age).apply()

    override fun getAge(): Int = pref.getInt("age",0)
}