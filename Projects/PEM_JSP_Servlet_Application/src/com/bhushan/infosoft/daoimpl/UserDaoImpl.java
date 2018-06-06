package com.bhushan.infosoft.daoimpl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bhushan.infosoft.dao.UserDao;
import com.bhushan.infosoft.model.User;
import com.bhushan.infosoft.util.JDBCUtil;


public class UserDaoImpl extends JDBCUtil implements UserDao {
	 private static final Logger logger=
				LoggerFactory.getLogger(UserDaoImpl.class);


	@Override
	public void insertUser(User user) {
		PreparedStatement pstmt=super.createPreparedStatement("insert into users(name,email,address,loginName,password) values (?,?,?,?,?)");
		try {
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getAddress());
			pstmt.setString(4, user.getLoginName());
			pstmt.setString(5, user.getPassword());
			pstmt.executeUpdate();
			logger.info("Success :  User Inserted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			super.closePreparedStatement(pstmt);
			super.closeConnection();			
		}
	}

	@Override
	public void deleteUser(int userid) {
		PreparedStatement pstmt=super.createPreparedStatement("delete from users where userid=?");
		try {
			pstmt.setInt(1, userid);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			super.closePreparedStatement(pstmt);
			super.closeConnection();
		}
	}

	@Override
	public void editUser(User user) {
		PreparedStatement pstmt=super.createPreparedStatement("update user set name=?, email=?, address=?, password=? where userId=?");
		try {
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getAddress());
			pstmt.setString(4, user.getPassword());
			pstmt.setInt(5, user.getUserid());
			pstmt.executeUpdate();
			logger.info("Success : record updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			super.closePreparedStatement(pstmt);
			super.closeConnection();
		}
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	public  boolean validate(String name, String pass) {		
		boolean status = false;
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "pem";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "root";
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager
					.getConnection(url + dbName, userName, password);

			pst = conn
					.prepareStatement("select * from users where loginName=? and password=?");
			pst.setString(1, name);
			pst.setString(2, pass);

			rs = pst.executeQuery();
			status = rs.next();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pst != null) {
				try {
					pst.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return status;
	}

}
