package com.infotech.pem.service;

import java.io.IOException;

import com.infotech.pem.model.User;


public interface UserService {
	
	public int userRegistration(User user);
	
	public  User loginUser(String username);
	
}
