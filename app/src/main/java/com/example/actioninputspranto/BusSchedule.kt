package com.example.actioninputspranto

data class BusSchedule(
    val id:Long,
    val name:String,
    val from : String,
    val to : String,
    val departureDate : String,
    val departureTime : String,
    val busType :String

)
