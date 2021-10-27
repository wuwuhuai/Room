package com.example.room

import android.app.Application
import android.util.Log

class MyApp:Application() {

    override fun onCreate() {
        super.onCreate()
        Log.v("xxxxx","agagagaagg")
        app = this
    }
    companion object {
        lateinit var app: MyApp
    }
}