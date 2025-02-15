package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Salon;
import com.example.demo.repositories.SalonRepo;

@Service
public class SalonService {
	@Autowired
	SalonRepo salrepo;
	
	public List<Salon> getSalonByCity(int city_id)
	{
		//System.out.println("2."+city_id);
		return salrepo.getSalonObject(city_id); 
	}
}
