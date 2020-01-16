package com.airbnb.service;

import java.util.List;

import com.airbnb.model.Apartment;
import com.airbnb.model.Guest;
import com.airbnb.model.Reservation;

public interface ReservationService {
	
	Reservation findOne(Long id);
	List<Reservation> findAll();
	List<Reservation> findByApartment(Apartment a);
	List<Reservation> findByGuest(Guest g);
	Reservation save(Reservation reservation);
	Reservation delete(Long id);

}
