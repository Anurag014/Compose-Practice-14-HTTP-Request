package com.example.cp14httprequest

import android.app.Application
import com.example.cp14httprequest.data.AppContainer
import com.example.cp14httprequest.data.DefaultAppContainer

class MarsPhotosApplication: Application() {

    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }

}