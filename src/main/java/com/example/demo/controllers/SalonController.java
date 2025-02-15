package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.City;
import com.example.demo.entities.Login;
import com.example.demo.entities.Salon;
import com.example.demo.services.CityService;
import com.example.demo.services.LoginService;
import com.example.demo.services.SalonService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class SalonController {
	
	@Autowired
	SalonService salerv;
	
	@Autowired
	CityService cityserv;
	
	
	@GetMapping("/getspecsalons/{city_id}")
	public List<Salon> getsalonBycity(@PathVariable int city_id)
	{
		//System.out.println("1."+city_id);
		//City c=cityserv.getCity_(null);
		
		return salerv.getSalonByCity(city_id);
	}
}
