package com.example.pages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar

class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting2)
        //Setting the back button

        val actionBar:ActionBar? = supportActionBar
        //It can be null
        //The action bar is a null checker
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }
}