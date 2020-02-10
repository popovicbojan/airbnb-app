package com.airbnb.web.dto;

import java.time.LocalTime;

public class ApartmentDTO {


	private Long id;

	private Long apartmentTypeId;
	
	private int numberOfRooms;

	private int numberOfGuest;

	private Long hostId;

	private double pricePerNight;

	private LocalTime checkInTime = LocalTime.of(14, 00, 00);

	private LocalTime checkOutTime = LocalTime.of(10, 00, 00);	

	private boolean status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getApartmentTypeId() {
		return apartmentTypeId;
	}

	public void setApartmentTypeId(Long apartmentTypeId) {
		this.apartmentTypeId = apartmentTypeId;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public int getNumberOfGuest() {
		return numberOfGuest;
	}

	public void setNumberOfGuest(int numberOfGuest) {
		this.numberOfGuest = numberOfGuest;
	}

	public Long getHostId() {
		return hostId;
	}

	public void setHostId(Long hostId) {
		this.hostId = hostId;
	}

	public double getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public LocalTime getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(LocalTime checkInTime) {
		this.checkInTime = checkInTime;
	}

	public LocalTime getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(LocalTime checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
