package com.flight.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Schedule {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 public long scheduleId;
	 @OneToOne
	
	 public Airport sourceAirport;
	 @OneToOne
	
	 public Airport destinationAirport;
	 @Column(name="arrival_time")
	 public String arrivaltime;
	 @Column(name="departure_time")
	 public String departureTime;
	public Schedule(long scheduleId, Airport sourceAirport, Airport destinationAirport, String arrivaltime,
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
	public Airport getSourceAirport() {
		return sourceAirport;
	}
	public void setSourceAirport(Airport sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	public Airport getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(Airport destinationAirport) {
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
