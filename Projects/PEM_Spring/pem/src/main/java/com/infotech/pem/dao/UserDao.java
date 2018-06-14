package com.infotech.pem.dao;


import com.infotech.pem.model.User;


/**
 * This is interface for user to perform databasse related operation.
 * @author Bhushan Medage
 *
 */

public interface UserDao {
	/**
	 * This method is register user. It accept parameter like name , email, username and password.
	 * @param user
	 * @return
	 */
	public int insertUser(User user);	
	
	/**
	 * This method accept username and password and login in application. if username or password is
	 *  incorrect it shows error.
	 * @param username
	 * @return
	 */
	public User loginUser(String username);
	
}
