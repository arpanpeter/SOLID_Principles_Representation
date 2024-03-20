package com.example.hotel

class InMemoryRoomRepository : RoomRepository {
    private val rooms = mutableListOf<Room>()

    override fun getAllRooms(): List<Room> {
        return rooms.toList()
    }

    override fun getAvailableRooms(): List<Room> {
        return rooms.filter { it.isAvailable }
    }

    override fun getRoomById(roomId: Int): Room? {
        return rooms.find { it.number == roomId }
    }
}
