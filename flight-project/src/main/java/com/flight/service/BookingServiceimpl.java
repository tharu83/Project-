package com.flight.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flight.dao.BookingDao;
import com.flight.dto.Booking;
import com.flight.exception.FlightNotAvailableException;

@Service
public class BookingServiceimpl implements BookingService{
	
	private BookingDao bookingdao;
	

	public BookingServiceimpl(BookingDao bookingdao) {
		super();
		this.bookingdao = bookingdao;
	}

	@Override
	public Booking saveBooking(Booking booking) {
		
		return bookingdao.save(booking);
	}

	@Override
	public Booking getBookingById(long bookingId) {
		
		return bookingdao.findById(bookingId).orElseThrow( ()->
		new FlightNotAvailableException("Booking" , "BookingId", bookingId));
	}

	@Override
	public List<Booking> displayAllBooking() {
		
		return bookingdao.findAll();
	}

	@Override
	public Booking updatebooking(Booking booking, long bookingId) {
		Booking exsitingBooking = bookingdao.findById(bookingId).orElseThrow( ()->
		new FlightNotAvailableException("Booking", "BookingId", bookingId));
		exsitingBooking.setBookingdate(booking.getBookingdate());
		exsitingBooking.setTicketCost(booking.getTicketCost());
		exsitingBooking.setNoOfPassenger(booking.getNoOfPassenger());
		bookingdao.save(exsitingBooking);
		return exsitingBooking;
	}

	@Override
	public void deleteBooking(long bookingId) {
		bookingdao.findById(bookingId).orElseThrow( ()->
		new FlightNotAvailableException("Booking", "BookingId", bookingId));
		bookingdao.deleteById(bookingId);
		
	}

}
