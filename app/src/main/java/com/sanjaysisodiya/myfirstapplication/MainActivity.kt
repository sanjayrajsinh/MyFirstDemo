package com.sanjaysisodiya.myfirstapplication

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var PREF="myPref"
    var myPref: SharedPreferences?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(View.OnClickListener {
            tvname.setText(etname.text)
        })

        myPref=getSharedPreferences(PREF,0)
        var editor: SharedPreferences.Editor =(myPref as SharedPreferences?)!!.edit()

    }
}
