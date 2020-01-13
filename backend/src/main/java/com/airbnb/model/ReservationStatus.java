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
@Table(name = "tbl_resetvation_status")
public class ReservationStatus {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String status;
	
	@OneToMany(mappedBy = "status", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Reservation> reservations = new ArrayList<Reservation>();

}
