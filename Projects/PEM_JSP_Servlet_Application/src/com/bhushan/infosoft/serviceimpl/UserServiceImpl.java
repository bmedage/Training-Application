package com.bhushan.infosoft.serviceimpl;

import java.io.IOException;

import com.bhushan.infosoft.dao.UserDao;
import com.bhushan.infosoft.daoimpl.UserDaoImpl;
import com.bhushan.infosoft.model.User;
import com.bhushan.infosoft.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao=null;
	
	public UserServiceImpl() {
		userDao=new UserDaoImpl();
	}

	@Override
	public void userRegistration(User user) {
		userDao.insertUser(user);

	}

	
	@Override
	public boolean validate(String name, String pass) {
		return userDao.validate(name, pass);
	}

}
