package com.flight.service;
import java.util.List;

import com.flight.dto.Flight;


public interface FlightService {
	//create
    Flight saveFlight(Flight flight);
    //FindById
    Flight getFlightById(long flightId);
    //FindAll
    List<Flight> getAllFlight();
    //update
    Flight updateFlight(Flight flight,long flightId);
    //Delete
    void deleteFlight(long fligthId);


}
