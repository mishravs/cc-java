package com.example.creditcard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.creditcard.Repo.UserRepo;
import com.example.creditcard.User.User;

@Service
public class RegistrationImpl {
	@Autowired
	private UserRepo userRepo;

	public User registerUser(User user) throws Exception {
		user = userRepo.save(user);
		return user;
	}

	public List<User> getAllUser() throws Exception {
		List<User> users = userRepo.findAll();
		return users;
	}
}
