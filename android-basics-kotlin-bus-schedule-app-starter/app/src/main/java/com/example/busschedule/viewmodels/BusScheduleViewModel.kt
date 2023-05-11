package com.example.busschedule.viewmodels

import androidx.lifecycle.ViewModel
import com.example.busschedule.databse.Schedule
import com.example.busschedule.databse.ScheduleDao
import kotlinx.coroutines.flow.Flow

class BusScheduleViewModel(private val scheduleDao: ScheduleDao): ViewModel() {

    fun fullSchedule(): Flow<List<Schedule>> = scheduleDao.getAll()

    fun scheduleForStopName(name: String): Flow<List<Schedule>> = scheduleDao.getByStopName(name)
}