package com.flight.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Schedule {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 public long scheduleId;
	 @Column(name="source_airport")
	 public String sourceAirport;
	 @Column(name="destination_airport")
	 public String destinationAirport;
	 @Column(name="arrival_time")
	 public String arrivaltime;
	 @Column(name="departure_time")
	 public String departureTime;
	public Schedule(long scheduleId, String sourceAirport, String destinationAirport, String arrivaltime,
			String departureTime) {
		super();
		this.scheduleId = scheduleId;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.arrivaltime = arrivaltime;
		this.departureTime = departureTime;
	}
	public Schedule() {
		super();
	}
	public long getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(long scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getSourceAirport() {
		return sourceAirport;
	}
	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	public String getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	public String getArrivaltime() {
		return arrivaltime;
	}
	public void setArrivaltime(String arrivaltime) {
		this.arrivaltime = arrivaltime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	 
	 

}
