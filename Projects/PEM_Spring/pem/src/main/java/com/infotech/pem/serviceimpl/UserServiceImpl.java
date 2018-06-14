package com.infotech.pem.serviceimpl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.pem.dao.UserDao;
import com.infotech.pem.daoimpl.UserDaoImpl;
import com.infotech.pem.model.User;
import com.infotech.pem.service.UserService;

@Service ("service")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao dao;
	
	
	public int userRegistration(User user) {
		return	dao.insertUser(user);
	}


	public User loginUser(String username) {
	   return dao.loginUser(username);	
	}

	

}
