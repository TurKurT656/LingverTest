package com.example.lingvertest

import android.app.Application
import com.yariksoffice.lingver.Lingver

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Lingver.init(this, "fa")
    }

}