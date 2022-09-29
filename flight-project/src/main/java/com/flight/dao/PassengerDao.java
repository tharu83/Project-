package com.flight.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.dto.Passenger;

@Repository
public interface PassengerDao extends JpaRepository<Passenger,Long>{

}
