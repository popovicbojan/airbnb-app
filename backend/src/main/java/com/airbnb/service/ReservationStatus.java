package com.airbnb.service;

import java.util.List;

public interface ReservationStatus {

	ReservationStatus findOne(Long id);
	List<ReservationStatus> findAll();
	ReservationStatus save(ReservationStatus reservationStatus);
	ReservationStatus delete(Long id);
	
}
