package com.flight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.dao.ScheduledFlightDao;
import com.flight.dto.Flight;
import com.flight.dto.Schedule;
import com.flight.dto.ScheduledFlight;
import com.flight.exception.FlightNotAvailableException;
@Service
public class ScheduledFlightServiceimpl implements ScheduledFlightService{
	@Autowired
	private ScheduledFlightDao scheduledflightdao;
	

	public ScheduledFlightServiceimpl(ScheduledFlightDao scheduledflightdao) {
		super();
		this.scheduledflightdao = scheduledflightdao;
	}

	@Override
	public ScheduledFlight scheduledFlight(ScheduledFlight scheduledFlight) {

		return  scheduledflightdao.save(scheduledFlight);
	}

	@Override
	public List<ScheduledFlight> viewScheduledFlight() {
		
		return scheduledflightdao.findAll();
	}

	@Override
	public ScheduledFlight modifyScheduledFlight(Flight flight, Schedule schedule,long scheduledFlightId) {
		ScheduledFlight existingScheduledFlight = scheduledflightdao.findById(scheduledFlightId).orElseThrow(() ->
		new FlightNotAvailableException("ScheduledFlight", "Id", scheduledFlightId));
		existingScheduledFlight.setAvailableSeats(flight.getSeatCapacity());
		existingScheduledFlight.setFlight(flight);
		existingScheduledFlight.setSchedule(schedule);
		scheduledflightdao.save(existingScheduledFlight);
		return existingScheduledFlight;
	}

	@Override
	public void deleteScheduledFlight(long scheduledFlightId) {
		scheduledflightdao.findById(scheduledFlightId).orElseThrow(()->
		new FlightNotAvailableException("ScheduledFlight", "Id", scheduledFlightId));
		scheduledflightdao.deleteById(scheduledFlightId);
		
	}

}
