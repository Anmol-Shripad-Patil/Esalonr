package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Barber;
import com.example.demo.services.BarberService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class BarberController {
	@Autowired
	BarberService bserv;
	
	@GetMapping("/getspecsbybarbers/{salon_id}")
	public List<Barber> getbaberbySalon(@PathVariable("salon_id")int salon_id)
	{
		return bserv.getbarberbysalonid(salon_id);
	}
	
	
}
	
	
	

