package com.flight.service;

import java.util.List;

import com.flight.dto.Flight;

import com.flight.dto.ScheduledFlight;

public interface ScheduledFlightService {
	ScheduledFlight scheduledFlight(ScheduledFlight scheduledFlight);
	
	 List <ScheduledFlight> viewScheduledFlight();

	 void deleteScheduledFlight(long scheduledId );
	 
	 ScheduledFlight modifyScheduledFlight(Flight flight, long scheduledId);
}
