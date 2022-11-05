package com.cg.HotelManagementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.HotelManagementSystem.model.HotelRoom;
import com.cg.HotelManagementSystem.repository.HotelRoomRepository;

@Service
public class HotelRoomServiceImpl implements HotelRoomService{
	
	@Autowired
	HotelRoomRepository hotelRoomRepository;

	@Override
	public List<HotelRoom> getAllHotelRooms() {
		
		return hotelRoomRepository.findAll();
	}

	@Override
	public HotelRoom getHotelRoomById(int id) {
		Optional<HotelRoom>  roomOptional= hotelRoomRepository.findById(id);
		
		return roomOptional.get();
	}

	@Override
	public HotelRoom addHotelRoom(HotelRoom hotelRoom) {
		
		return hotelRoomRepository.save(hotelRoom);
	}

	@Override
	public HotelRoom updateHotelRoom(HotelRoom hotelRoom) {
		Optional<HotelRoom> roomOptional = hotelRoomRepository.findById(hotelRoom.getRoom_id());
		if(roomOptional.isPresent()) {
			
			return hotelRoomRepository.save(hotelRoom);
		}
		else return null; //Exception will be added
		
		 
	}

	@Override
	public HotelRoom deleteHotelRoom(int id) {
		Optional<HotelRoom> roomOptional = hotelRoomRepository.findById(id);
		if(roomOptional.isPresent()) {
			HotelRoom room= roomOptional.get();
			hotelRoomRepository.delete(room);
			return room;
		}
		else return null; //Exception will be added
	}
	
	

}
