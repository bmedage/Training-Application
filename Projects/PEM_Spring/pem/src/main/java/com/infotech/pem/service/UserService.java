package com.infotech.pem.service;

import java.io.IOException;

import com.infotech.pem.model.User;

/**
 * 
 * @author Bhushan Medage
 *
 */
public interface UserService {
	
	/**
	 * This method is register user. It accept parameter like name , email, username and password. 
	 * @param user
	 * @return
	 */
	public int userRegistration(User user);
	
	/**
	 * This method accept username and password and login in application. if username or password is
	 *  incorrect it shows error.
	 * @param username
	 * @return
	 */
	public  User loginUser(String username);
	
	
	
}
