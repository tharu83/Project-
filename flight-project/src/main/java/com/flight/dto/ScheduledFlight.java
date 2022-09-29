package com.flight.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ScheduledFlight {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long scheduledFlightId;
	@OneToOne
	private Flight flight;
	@Column(name = "available_seats")
	private int availableSeats;
	@OneToOne
	private Schedule schedule;
	

	public ScheduledFlight(Long scheduledFlightId, Flight flight, int availableSeats, Schedule schedule) {
		super();
		this.scheduledFlightId = scheduledFlightId;
		this.flight = flight;
		this.availableSeats = availableSeats;
		this.schedule = schedule;
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
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	
	

}
