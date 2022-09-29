package com.flight.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.dto.User;
import com.flight.service.UserService;
import com.flight.service.UserServiceimpl;

@RestController
@RequestMapping("/user")
public class UserController {
	private UserService userServiceimpl;

	public UserController(UserService userServiceimpl) {
		super();
		this.userServiceimpl = userServiceimpl;
	}
	
	@PostMapping
    public ResponseEntity<User> createUser(@RequestBody User newUser){
        return new ResponseEntity<User>(userServiceimpl.createUser(newUser), HttpStatus.CREATED);
        
    }
	
	 @PutMapping("{UserId}")
	    public ResponseEntity<User> updateUser(@PathVariable("UserId") long userId, @RequestBody User newUser){
	        return new ResponseEntity <User>
	        (userServiceimpl.updateUser(newUser, userId), HttpStatus.OK);
	    }
	 @GetMapping("{UserId}")
	 public ResponseEntity<User>findUserById(@PathVariable("UserId") long userId,@RequestBody User user){
		return new ResponseEntity<User>(userServiceimpl.findUserById(userId),HttpStatus.OK);
		 
	 }
	 
	  @GetMapping
	    public List<User> displayAllUser(){
	        return userServiceimpl.displayAllUser();
	    }
	  
	  @DeleteMapping("{UserId}")
	    public ResponseEntity<String> deleteUser(@PathVariable("UserId") long userId){
	        userServiceimpl.deleteUser(userId);
	        return new ResponseEntity<String>
	        ("Flight data delete successfully",HttpStatus.OK);
	  }
}
