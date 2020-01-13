package com.airbnb.model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name = "tbl_apartment")
public class Apartment {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private ApartmentType type;
	
	@Column
	private int numerOfRooms;
	
	@Column
	private int numberOfGuest;
	
	@OneToMany(mappedBy = "apartment")
	private List<AvailableDates> availableDates = new ArrayList<AvailableDates>();
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Host host;
	
	@OneToMany(mappedBy = "apartment", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Comment> comments = new ArrayList<Comment>();
	
	@OneToMany(mappedBy = "apartment", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Picture> pictures = new ArrayList<Picture>();
	
	@Column
	private double pricePerNight;
	
	@Column
	private LocalTime checkInTime = LocalTime.of(14, 00, 00);
	
	@Column
	private LocalTime checkOutTime = LocalTime.of(10, 00, 00);
	
	@Column
	private boolean status;
		
	@ManyToMany(mappedBy = "rentedApartments")
	private List<Guest> guests = new ArrayList<Guest>();
	
	@OneToMany(mappedBy = "apartment", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Reservation> reservations = new ArrayList<Reservation>();
	
	//TODO Add Amenities property to class
	

}
