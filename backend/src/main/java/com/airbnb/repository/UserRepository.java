package com.airbnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airbnb.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
