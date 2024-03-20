package com.example.hotel

interface RoomRepository {
    fun getAllRooms():List<Room>
    fun getAvailableRooms(): List<Room>
    fun getRoomById(roomId: Int): Room?

}