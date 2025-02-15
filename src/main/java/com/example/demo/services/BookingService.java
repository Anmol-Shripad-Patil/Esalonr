package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Booking;
import com.example.demo.entities.City;
import com.example.demo.entities.Salon;
import com.example.demo.repositories.BookingRepo;

import com.example.demo.repositories.SalonRegRepo;

@Service
public class BookingService {
	
	@Autowired
	BookingRepo brepo;
	
	public Booking saveBooking(Booking b)
	{
		return brepo.save(b);
	}
	
	
	
}
