package com.my.test.models

data class NextTraining(
    val dayOfWeek: String,
    val date: Int,
    val month: String,
    val startTime: String,
    val endTime: String,
    val type: String
)
