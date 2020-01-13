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
@Table(name = "tbl_available_dates")
public class AvailableDates {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private LocalDate startDate;

	@Column
	private LocalDate endDate;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Apartment apartment;
}
