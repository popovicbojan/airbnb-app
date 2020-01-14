package com.airbnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airbnb.model.Guest;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long>{

}
