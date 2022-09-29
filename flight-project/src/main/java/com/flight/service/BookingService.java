package com.flight.service;

import java.util.List;

import com.flight.dto.Booking;

public interface BookingService {
	
	public Booking saveBooking(Booking booking);
	
	Booking getBookingById(long bookingId);
	
	List<Booking> displayAllBooking();
	
	Booking updatebooking (Booking booking, long bookingId);
	
	void deleteBooking (long bookingId);

}
