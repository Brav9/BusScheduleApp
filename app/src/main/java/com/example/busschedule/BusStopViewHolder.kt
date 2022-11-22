package com.example.busschedule

import android.annotation.SuppressLint
import android.icu.text.SimpleDateFormat
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.busschedule.database.schedule.Schedule
import com.example.busschedule.databinding.BusStopItemBinding
import java.util.*

class BusStopViewHolder(private var binding: BusStopItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    @RequiresApi(Build.VERSION_CODES.N)
    @SuppressLint("SimpleDateFormat")
    fun bind(schedule: Schedule) {
        binding.stopNameTextView.text = schedule.stopName
        binding.arrivalTimeTextView.text = SimpleDateFormat(
            "h:mm a").format(Date(schedule.arrivalTime.toLong() * 1000))
    }
}