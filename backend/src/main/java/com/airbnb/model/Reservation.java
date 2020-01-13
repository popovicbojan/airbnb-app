package com.airbnb.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_reservation")
public class Reservation {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Apartment apartment;
	
	@Column
	private LocalDate startDate;
	
	@Column
	private int numberOfDays = 1;
	
	@Column
	private double totalPrice;
		
	@ManyToOne(fetch = FetchType.EAGER)
	private Guest guest;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private ReservationStatus status;

}
