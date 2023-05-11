package com.example.busschedule

import android.app.Application
import com.example.busschedule.databse.AppDatabase

class BusScheduleApplication : Application() {
    val database: AppDatabase by lazy {
        AppDatabase.getDatabase(this)
    }
}