package com.cg.HotelManagementSystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.HotelManagementSystem.model.HotelRoom;



@Repository
public interface HotelRoomRepository extends JpaRepository<HotelRoom, Integer> {

}
