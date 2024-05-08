package com.cbi.SearchHotel.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cbi.SearchHotel.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
	  List<Hotel> findByStars(int stars);
}
