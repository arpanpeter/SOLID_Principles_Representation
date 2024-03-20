package com.example.hotel

import java.time.LocalDate

interface BookingService {
    fun makeBooking(roomId: Int, startDate: LocalDate, endDate: LocalDate): Boolean
}