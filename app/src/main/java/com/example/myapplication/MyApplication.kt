package com.example.myapplication

import android.app.Application
import org.osmdroid.config.Configuration

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // THIS IS THE KEY LINE
        Configuration.getInstance().userAgentValue = packageName
    }
}
