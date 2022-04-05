package com.example.actioninputspranto

data class BusSchedule(
    val id : Long,
    val name : String,
    val from : String,
    val to : String,
    val departureDate : String,
    val departureTime : String,
    val busType : String,
    var favorite : Boolean = false

)
val scheduleList = mutableListOf<BusSchedule>(
    BusSchedule(id =System.currentTimeMillis(), name = "Ena", from = "Dhaka", to = "Rajshahi", departureDate = "22/04/22", departureTime = "23:00", busType = "Economy"),
    BusSchedule(id =System.currentTimeMillis(), name = "Ena", from = "Dhaka", to = "Rajshahi", departureDate = "22/04/22", departureTime = "23:00", busType = "Economy"),
    BusSchedule(id =System.currentTimeMillis(), name = "Ena", from = "Dhaka", to = "Rajshahi", departureDate = "22/04/22", departureTime = "23:00", busType = "Economy"),
    BusSchedule(id =System.currentTimeMillis(), name = "Ena", from = "Dhaka", to = "Rajshahi", departureDate = "22/04/22", departureTime = "23:00", busType = "Economy"),
    BusSchedule(id =System.currentTimeMillis(), name = "Ena", from = "Dhaka", to = "Rajshahi", departureDate = "22/04/22", departureTime = "23:00", busType = "Economy"),
    BusSchedule(id =System.currentTimeMillis(), name = "Ena", from = "Dhaka", to = "Rajshahi", departureDate = "22/04/22", departureTime = "23:00", busType = "Economy"),
    BusSchedule(id =System.currentTimeMillis(), name = "Ena", from = "Dhaka", to = "Rajshahi", departureDate = "22/04/22", departureTime = "23:00", busType = "Economy"),
    BusSchedule(id =System.currentTimeMillis(), name = "Ena", from = "Dhaka", to = "Rajshahi", departureDate = "22/04/22", departureTime = "23:00", busType = "Economy"),
    BusSchedule(id =System.currentTimeMillis(), name = "Ena", from = "Dhaka", to = "Rajshahi", departureDate = "22/04/22", departureTime = "23:00", busType = "Economy"),
    BusSchedule(id =System.currentTimeMillis(), name = "Ena", from = "Dhaka", to = "Rajshahi", departureDate = "22/04/22", departureTime = "23:00", busType = "Economy"),
    BusSchedule(id =System.currentTimeMillis(), name = "Ena", from = "Dhaka", to = "Rajshahi", departureDate = "22/04/22", departureTime = "23:00", busType = "Economy"),
    BusSchedule(id =System.currentTimeMillis(), name = "Ena", from = "Dhaka", to = "Rajshahi", departureDate = "22/04/22", departureTime = "23:00", busType = "Economy"),
    BusSchedule(id =System.currentTimeMillis(), name = "Ena", from = "Dhaka", to = "Rajshahi", departureDate = "22/04/22", departureTime = "23:00", busType = "Economy"),
    BusSchedule(id =System.currentTimeMillis(), name = "Ena", from = "Dhaka", to = "Rajshahi", departureDate = "22/04/22", departureTime = "23:00", busType = "Economy"),
    BusSchedule(id =System.currentTimeMillis(), name = "Ena", from = "Dhaka", to = "Rajshahi", departureDate = "22/04/22", departureTime = "23:00", busType = "Economy"),
)
