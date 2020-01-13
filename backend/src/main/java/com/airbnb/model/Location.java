package com.airbnb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_location")
public class Location {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private double latitude;
	
	@Column
	private double longitude;
	
	@OneToOne
	private Address address;
}
