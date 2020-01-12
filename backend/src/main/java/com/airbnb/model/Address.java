package com.airbnb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_address")
public class Address {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String street;
	
	@Column
	private String number;
	
	@Column
	private String city;
	
	@Column
	private int postNumber;
	
}
