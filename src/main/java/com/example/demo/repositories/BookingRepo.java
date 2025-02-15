package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Booking;


@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {
	
	
	@Query("select b from Booking b where b.barber.barber_id= :barber_id")
	public List<Booking> findByBarber_BarberId(int barber_id);

}
