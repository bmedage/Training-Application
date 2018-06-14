package com.infotech.pem.dao;


import com.infotech.pem.model.User;


/**
 * 
 * @author Bhushan Medage
 *
 */

public interface UserDao {
	
	public int insertUser(User user);	
	public User loginUser(String username);
	
}
