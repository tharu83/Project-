package com.flight.service;

import java.util.List;

import com.flight.dto.User;

public interface UserService {
	 User createUser(User newUser);
	 
	  User updateUser(User newUser, long userId);
	   
	  void deleteUser(long userId);
	   
	  List<User>displayAllUser();
	 
	  User findUserById(long userId);
	

}
