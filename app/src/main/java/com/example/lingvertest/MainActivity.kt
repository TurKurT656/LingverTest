package com.example.lingvertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yariksoffice.lingver.Lingver

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        Lingver.getInstance().setLocale(this, "fa")
    }
}