package com.cbi.SearchHotel.rs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cbi.SearchHotel.dao.HotelRepository;
import com.cbi.SearchHotel.model.Hotel;



import ch.qos.logback.core.model.Model;


public class HotelRest {
	@RequestMapping("/")
    public String home(){
        return "Hello World!";
    }
	@Autowired
	HotelRepository repository;

	@GetMapping("hotels")
	public List<Hotel> listeEtudiants() {
		return repository.findAll();
	}
	
	@GetMapping("hotels/{idHotel}")
	public Optional<Hotel> getEtudiantById(@PathVariable("idHotel") long id) {
		return repository.findById(id);
	}
	
//	@GetMapping("/hotels")
//	public List<Hotel> getHotelsByStarsAndCity(@RequestParam int stars, @RequestParam String city) {
//	    return HotelRepository.findByStarsAndCity(stars, city);
//	}
}
