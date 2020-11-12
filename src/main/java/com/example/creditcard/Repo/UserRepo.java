package com.example.creditcard.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.creditcard.User.User;

public interface UserRepo extends MongoRepository<User, String> {

}
