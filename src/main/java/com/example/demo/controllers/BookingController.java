package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Barber;
import com.example.demo.entities.Booking;
import com.example.demo.entities.Bookingrjs;
import com.example.demo.entities.City;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Salon;
import com.example.demo.entities.SalonRegistration;
import com.example.demo.entities.Servic;
import com.example.demo.entities.TimeSlot;
import com.example.demo.services.BarberService;
import com.example.demo.services.BookingService;
import com.example.demo.services.CustomerService;
import com.example.demo.services.ServicesService;
import com.example.demo.services.TimeSlotService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BookingController {
	
	@Autowired
	BookingService bookserv;
	
	@Autowired
	BarberService barserv;
	
	@Autowired
	ServicesService serserv;
	
	@Autowired
	TimeSlotService timeserv;
	
	@Autowired
	CustomerService cserv;
	
	
	
	@PostMapping("/registerBooking")
	public Booking bookAppointment(@RequestBody Bookingrjs brjs)
	{
	
		String status="booked";
	Barber b=barserv.getBarber(brjs.getBarber_id());
	
	Servic s=serserv.getService(brjs.getService_id());
	
	TimeSlot t=timeserv.getTimeSlot(brjs.getTid());
	
	Customer c=cserv.getCustomer(brjs.getCustomer_id());
	
	Booking book = new Booking(s,b,c,t,status);

    
    Booking booked=bookserv.saveBooking(book);
	return booked;
    		
    	
	

	         
	}
	
//	@PostMapping("/bookingid")
//	public Booking bookAppointment(@RequestBody Booking bid)
//	{
//	
//	Barber b=barserv.getBarber(bid.getBarberName());
//	
//	Servic s=serserv.getService(bid.getServiceName());
//	
//	TimeSlot t=timeserv.getTimeSlot(bid.getStart_time());
//	
//	Customer c=cserv.getCustomer(bid.getFirst_name());
//	
//	Booking book = new Booking(s,b,c,t,bid.getStatus());
//
//    
//    Booking booked=bookserv.saveBooking(book);
//	return booked;
//    		
//    	
//	
//
//	         
//	}
	
	
	
}
