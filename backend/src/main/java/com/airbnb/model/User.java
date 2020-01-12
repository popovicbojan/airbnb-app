package com.airbnb.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String username;

	@Column
	private String password;

	@Column
	private String name;
	
	@Column
	private String lastName;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Role role;
	
	@OneToMany(mappedBy = "host", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Apartment> forRent = new ArrayList<Apartment>();
	
	@ManyToMany
	@JoinTable(
			  name = "visited_apartments", 
			  joinColumns = @JoinColumn(name = "guest_id"), 
			  inverseJoinColumns = @JoinColumn(name = "apartment_id"))
	private List<Apartment> rentedApartments = new ArrayList<Apartment>();
	
	@OneToMany(mappedBy = "guest", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Reservation> reservations = new ArrayList<Reservation>();

}
