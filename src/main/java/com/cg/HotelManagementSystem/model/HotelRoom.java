package com.cg.HotelManagementSystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HotelRoomTable")
public class HotelRoom {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int room_id;
	
	private String room_type;
	private int room_cost;
	private String room_status;
	private String food;
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public int getRoom_cost() {
		return room_cost;
	}
	public void setRoom_cost(int room_cost) {
		this.room_cost = room_cost;
	}
	public String getRoom_status() {
		return room_status;
	}
	public void setRoom_status(String room_status) {
		this.room_status = room_status;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	@Override
	public String toString() {
		return "HotelRoom [room_id=" + room_id + ", room_type=" + room_type + ", room_cost=" + room_cost
				+ ", room_status=" + room_status + ", food=" + food + "]";
	}
	public HotelRoom(int room_id, String room_type, int room_cost, String room_status, String food) {
		super();
		this.room_id = room_id;
		this.room_type = room_type;
		this.room_cost = room_cost;
		this.room_status = room_status;
		this.food = food;
	}
	public HotelRoom() {}
	
	

}
