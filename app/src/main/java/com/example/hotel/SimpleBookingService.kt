package com.example.hotel

import java.time.LocalDate

class SimpleBookingService(private val roomRepository: RoomRepository) : BookingService {
    override fun makeBooking(roomId: Int, startDate: LocalDate, endDate: LocalDate): Boolean {
        val room = roomRepository.getRoomById(roomId)
        return room != null && room.isAvailable
    }
}
