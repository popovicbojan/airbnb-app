package com.airbnb.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
@DiscriminatorValue(value = "GUEST")
public class Guest extends User{
	
	@ManyToMany
	@JoinTable(
			  name = "visited_apartments", 
			  joinColumns = @JoinColumn(name = "guest_id"), 
			  inverseJoinColumns = @JoinColumn(name = "apartment_id"))
	private List<Apartment> rentedApartments = new ArrayList<Apartment>();
	
	@OneToMany(mappedBy = "guest", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Reservation> reservations = new ArrayList<Reservation>();
	
	@OneToMany(mappedBy = "guest", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	List<Comment> comments = new ArrayList<Comment>();

}
