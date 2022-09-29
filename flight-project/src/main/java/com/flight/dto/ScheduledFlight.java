package com.flight.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ScheduledFlight {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long scheduledFlightId;
	@Column(name="flight")
	private Flight flight;
	@Column(name="availableSeats")
	private int availableSeats;
//	@Column(name="schedule")
//	private Schedule schedule;
	public ScheduledFlight(Long scheduledFlightId, Flight flight, int availableSeats) {
		super();
		this.scheduledFlightId = scheduledFlightId;
		this.flight = flight;
		this.availableSeats = availableSeats;
	}
public ScheduledFlight() {
	super();
}
public Long getScheduledFlightId() {
	return scheduledFlightId;
}
public void setScheduledFlightId(Long scheduledFlightId) {
	this.scheduledFlightId = scheduledFlightId;
}
public Flight getFlight() {
	return flight;
}
public void setFlight(Flight flight) {
	this.flight = flight;
}
public int getAvailableSeats() {
	return availableSeats;
}
public void setAvailableSeats(int availableSeats) {
	this.availableSeats = availableSeats;
}
	
	

}
