package com.bhushan.infosoft.dao;

import java.io.IOException;
import java.util.List;

import com.bhushan.infosoft.model.User;


public interface UserDao {
	public void insertUser(User user);
	public void deleteUser(int userid);
	public void editUser(User user);
	public List<User> getAllUsers();
	
	public  boolean validate(String name, String pass);
	
}
