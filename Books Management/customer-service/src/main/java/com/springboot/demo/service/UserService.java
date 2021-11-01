package com.springboot.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.model.User;
import com.springboot.demo.repository.UserRepository;


@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

 

  public String signin(String username, String password) {
	return username;
    
  }

  public User signup(User user) {
	return user;
    
  }

 

}
