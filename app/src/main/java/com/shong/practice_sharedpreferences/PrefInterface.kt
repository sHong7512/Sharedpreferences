package com.shong.practice_sharedpreferences

interface PrefInterface{
    fun setName(name:String)
    fun getName() : String
    fun setAge(age : Int)
    fun getAge() : Int
}