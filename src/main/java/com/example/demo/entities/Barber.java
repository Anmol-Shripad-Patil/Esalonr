package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="barbers")
public class Barber {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int barber_id;

    @ManyToOne
    @JoinColumn(name = "salon_id")
    private Salon salon_id;

    private String barber_name;
    private int age;
    private String gender;

    public Barber() {
    }

    public Barber(String barber_name, int age, String gender) {
        this.barber_name = barber_name;
        this.age = age;
        this.gender = gender;
    }

	public int getBarber_id() {
		return barber_id;
	}

	public void setBarber_id(int barber_id) {
		this.barber_id = barber_id;
	}

	
	

	public Salon getSalon_id() {
		return salon_id;
	}

	public void setSalon_id(Salon salon_id) {
		this.salon_id = salon_id;
	}

	public String getBarber_name() {
		return barber_name;
	}

	public void setBarber_name(String barber_name) {
		this.barber_name = barber_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

    
}

