package com.shong.practice_sharedpreferences


import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //일반적인 사용방법
        val m_pref = MyPreferences(this)
        m_pref.setName("sHong")
        m_pref.setAge(29)

        val name = m_pref.getName()
        val age = m_pref.getAge()
        Log.d("${this}_test", "$name : $age")

        MyApp.pref_Global.setName("7month later sHong")
        MyApp.pref_Global.setAge(30)

        val global_name = MyApp.pref_Global.getName()
        val global_Age = MyApp.pref_Global.getAge()
        Log.d("${this}_test", "$global_name : $global_Age")
    }
}