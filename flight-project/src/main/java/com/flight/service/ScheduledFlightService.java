package com.flight.service;

import java.util.List;

import com.flight.dto.Flight;
import com.flight.dto.Schedule;
import com.flight.dto.ScheduledFlight;

public interface ScheduledFlightService {
	ScheduledFlight scheduledFlight(ScheduledFlight scheduledFlight);
	 List <ScheduledFlight> viewScheduledFlight();
	 ScheduledFlight modifyScheduledFlight(Flight flight, Schedule schedule,long scheduledFlightId);
	 void deleteScheduledFlight(long scheduledFlightId );

}
