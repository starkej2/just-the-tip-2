package com.binaryblacksheep.justthetip

import android.app.Application

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        println("Application init")
    }
}