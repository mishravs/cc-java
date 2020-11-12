package com.example.creditcard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.creditcard.User.User;
import com.example.creditcard.service.RegistrationImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CreditCardController {
	@Autowired
	private RegistrationImpl registrationImpl;

	@PostMapping(path = "/cardUser")
	public User registerUser(@RequestBody User user) throws Exception {

		return registrationImpl.registerUser(user);

	}

	@GetMapping("/getAllUser")
	public List<User> getAllUsers() throws Exception {
		return registrationImpl.getAllUser();
	}

}
