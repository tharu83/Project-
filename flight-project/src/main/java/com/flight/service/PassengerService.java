package com.flight.service;

import java.util.List;

import com.flight.dto.Passenger;

public interface PassengerService {
	
	Passenger savePassenger(Passenger passenger);
	
	Passenger updatePassenger(Passenger passenger, long passengerid);
	
	void deletePassenger(long passengerid);
	
	List<Passenger> displayAllPassenger();
	
	Passenger findPassengerById(long passengerid);
	
	

}
