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

	public ReservationStatus() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	

}
