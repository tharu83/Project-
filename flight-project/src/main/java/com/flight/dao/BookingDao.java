package com.flight.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.dto.Booking;

@Repository
public interface BookingDao extends JpaRepository<Booking, Long> {

}
