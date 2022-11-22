package com.example.busschedule.database.schedule

import android.app.Application
import com.example.busschedule.database.AppDataBase

class BusScheduleApplication : Application() {
    val database: AppDataBase by lazy { AppDataBase.getDataBase(this) }
}