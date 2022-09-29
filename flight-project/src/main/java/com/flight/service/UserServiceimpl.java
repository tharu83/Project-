package com.flight.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flight.dao.UserDao;
import com.flight.dto.User;
import com.flight.exception.FlightNotAvailableException;

@Service
public class UserServiceimpl implements UserService {
	private UserDao userdao;
	
	public UserServiceimpl(UserDao userdao) {
		super();
		this.userdao = userdao;
	}

	@Override
	public User createUser(User newUser) {
		
		return userdao.save(newUser);
	}

	@Override
	public User updateUser(User newUser, long userId) {
		User existinguser=userdao.findById(userId).orElseThrow(()->new 
				FlightNotAvailableException("User","userid",userId));
		existinguser.setUsername(newUser.getUsername());
		existinguser.setUserPassword(newUser.getUserPassword());
		existinguser.setUserPhone(newUser.getUserPhone());
		existinguser.setUserEmail(newUser.getUserEmail());
		userdao.save(existinguser);
		return existinguser;
	}

	@Override
	public void deleteUser(long userId) {
		userdao.findById(userId).orElseThrow(()->new FlightNotAvailableException("User","userid",userId));
		userdao.deleteById(userId);
	}

	@Override
	public List<User> displayAllUser() {
		
		return userdao.findAll();
	}

	@Override
	public User findUserById(long userId) {
		
		return userdao.findById(userId).orElseThrow(()-> new FlightNotAvailableException("User","userid",userId));
	}

}
