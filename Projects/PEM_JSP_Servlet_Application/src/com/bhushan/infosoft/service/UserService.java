package com.bhushan.infosoft.service;

import java.io.IOException;

import com.bhushan.infosoft.model.User;

public interface UserService {
	
	public void userRegistration(User user);
	
	public  boolean validate(String name, String pass);
	
}
