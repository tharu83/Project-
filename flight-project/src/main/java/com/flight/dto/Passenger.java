package com.flight.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passenger {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long passengerid;
	@Column(name="pnrnumber")
	private long pnrnumber;
	@Column(name = "passengerName")
	private String passengerName;
	@Column(name = "passenegerAge")
	private int passengerAge;
	@Column(name = "passengerUIN")
	private String passengerUIN;
	@Column(name = "luggage")
	private double luggage;
	
	public Passenger(long passengerid, long pnrnumber, String passengerName, int passengerAge, String passengerUIN,
			double luggage) {
		super();
		this.passengerid = passengerid;
		this.pnrnumber = pnrnumber;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerUIN = passengerUIN;
		this.luggage = luggage;
	}
	public Passenger() {
		super();
	}
	public long getPassengerid() {
		return passengerid;
	}
	public void setPassengerid(long passengerid) {
		this.passengerid = passengerid;
	}
	public long getPnrnumber() {
		return pnrnumber;
	}
	public void setPnrnumber(long pnrnumber) {
		this.pnrnumber = pnrnumber;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public String getPassengerUIN() {
		return passengerUIN;
	}
	public void setPassengerUIN(String passengerUIN) {
		this.passengerUIN = passengerUIN;
	}
	public double getLuggage() {
		return luggage;
	}
	public void setLuggage(double luggage) {
		this.luggage = luggage;
	}
	
	

}
