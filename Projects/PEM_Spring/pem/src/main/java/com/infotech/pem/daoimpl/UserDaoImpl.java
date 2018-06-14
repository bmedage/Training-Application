package com.infotech.pem.daoimpl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.infotech.pem.dao.UserDao;
import com.infotech.pem.model.User;
import com.infotech.pem.rowmapper.CustomUserRowMapper;


/**
 * This class implements all methods interface of userdao.
 * This class is also perform database related operation
 * @author Bhushan Medage
 *
 */

@Repository("dao")
public class UserDaoImpl implements UserDao {

	Connection con = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
	/**
	 * This method is register user. It store the details of user into database.
	 */
	public int insertUser(User user) {
		String sql = "insert into users(name,email,userid,address,loginName,password) values(?,?,?,?,?,?)";
		System.out.println(user.getName());
		
		int i = jdbcTemplate.update(sql, new Object[] {user.getName(),user.getEmail(),user.getUserid(),user.getAddress(),user.getLoginName(),user.getPassword()});
		if(i>0) {
			return i;
		}
		return 0;
	}


	/**
	 * This method perform operation for login. and add  the detail into row mapper 
	 */
	public User loginUser(String username) {
		String sql=null;
		User user = null;			
				sql = "select * from users where loginName = ? ";
				user = new User();
				user=jdbcTemplate.queryForObject(sql, new CustomUserRowMapper(), username);
			
			return user;
	}

	

	
	
	 

}
