package com.cg.HotelManagementSystem.service;

import java.util.List;

import com.cg.HotelManagementSystem.model.HotelRoom;



public interface HotelRoomService {
	public abstract List<HotelRoom> getAllHotelRooms();
	public abstract HotelRoom getHotelRoomById(int id);
	public abstract HotelRoom addHotelRoom(HotelRoom hotelRoom);
	public abstract HotelRoom updateHotelRoom(HotelRoom hotelRoom);
	public abstract HotelRoom deleteHotelRoom(int id);

}
