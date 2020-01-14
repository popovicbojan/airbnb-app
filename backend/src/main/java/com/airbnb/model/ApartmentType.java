package com.airbnb.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_apartment_type")
public class ApartmentType {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String type;

	@OneToMany(mappedBy = "type", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Apartment> apartments = new ArrayList<Apartment>();

	public ApartmentType() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Apartment> getApartments() {
		return apartments;
	}

	public void setApartments(List<Apartment> apartments) {
		this.apartments = apartments;
	}
	
	
}
