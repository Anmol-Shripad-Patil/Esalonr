package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Salon;

@Repository
public interface SalonRepo extends JpaRepository<Salon, Integer>  {
	@Query("select s from Salon s where s.city_id.city_id = :city_id")
	public List<Salon> getSalonObject(int city_id);
}
