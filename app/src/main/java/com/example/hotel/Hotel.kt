package com.example.hotel

import java.time.LocalDate

class Hotel(private val roomRepository: RoomRepository, private val bookingService: BookingService) {
    fun getAllRooms(): List<Room> {
        return roomRepository.getAllRooms()
    }

    fun getAvailableRooms(): List<Room> {
        return roomRepository.getAvailableRooms()
    }

    fun makeBooking(roomId: Int, startDate: LocalDate, endDate: LocalDate): Boolean {
        return bookingService.makeBooking(roomId, startDate, endDate)
    }
}
