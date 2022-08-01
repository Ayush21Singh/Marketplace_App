package com.example.shopkart

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

/**
 * Created By Ayush
 */
@HiltAndroidApp
class ShopKartApplication : Application() {

    override fun getApplicationContext(): Context {
        return super.getApplicationContext()
    }
}