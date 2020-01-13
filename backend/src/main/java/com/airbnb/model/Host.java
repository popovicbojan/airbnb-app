package com.airbnb.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue(value = "HOST")
public class Host extends User{
	
	@OneToMany(mappedBy = "host", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Apartment> forRent = new ArrayList<Apartment>();

}
