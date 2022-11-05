package com.cg.HotelManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.HotelManagementSystem.model.HotelRoom;
import com.cg.HotelManagementSystem.service.HotelRoomServiceImpl;

@RestController
@RequestMapping("/hotelroom")
public class HotelRoomController {
	
	@Autowired
	private HotelRoomServiceImpl hotelRoomServiceImpl;
	
//	http://localhost:8080/hotelroom/get-all-rooms	
	@GetMapping("/get-all-rooms")
	public List<HotelRoom> getAllRooms(){
		return hotelRoomServiceImpl.getAllHotelRooms();
	}
	
//	http://localhost:8080/hotelroom/get-room-by-id/{rid}	
	@GetMapping("/get-room-by-id/{rid}")
	public HotelRoom getRoomById(@PathVariable(name="rid") int roomId) {
	return hotelRoomServiceImpl.getHotelRoomById(roomId);
	
	}
	
//	http://localhost:8080/hotelroom/add-room
	@PostMapping("/add-room")
	public HotelRoom addRoom(@RequestBody HotelRoom hotelroom) {
		HotelRoom room =hotelRoomServiceImpl.addHotelRoom(hotelroom);
		return room;	
	}
	
//	http://localhost:8080/hotelroom/update-room
	@PutMapping("/update-room")
	public HotelRoom updateRoom(@RequestBody HotelRoom hotelroom) {
		HotelRoom room =hotelRoomServiceImpl.updateHotelRoom(hotelroom);
		return room;		
	}
	
//	http://localhost:8080/hotelroom/delete-room/{rid}	
	@DeleteMapping("/delete-room/{rid}")
	public HotelRoom deleteRoom(@PathVariable(name = "rid") int roomId) {
		return hotelRoomServiceImpl.deleteHotelRoom(roomId);
	}
	

}
