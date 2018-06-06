package com.bhushan.infosoft.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.websocket.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bhushan.infosoft.dao.CategoryDao;
import com.bhushan.infosoft.model.Category;
import com.bhushan.infosoft.util.JDBCUtil;


import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class CategoryDaoImpl extends JDBCUtil implements CategoryDao {

	@Override
	public void addCategory(Category category) {
		final Logger logger=LoggerFactory.getLogger(UserDaoImpl.class);

		
		PreparedStatement pstmt=super.createPreparedStatement("insert into categories(name,userid) values (?,?)");
		try {
			pstmt.setString(1, category.getName());
			pstmt.setString(2, category.getUserid());
			
			
			pstmt.executeUpdate();
			logger.info("Success :  Category Inserted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			super.closePreparedStatement(pstmt);
			super.closeConnection();			
		}

	}

	@Override
	public List<Category> listAllCategory(String userid) {
		List<Category> catList=new ArrayList<>();
		ResultSet rs=null;
		
		PreparedStatement pstmt=super.createPreparedStatement("select * from categories where userid=?");
		try {
			pstmt.setString(1, userid);
			
			rs=pstmt.executeQuery();
			while(rs.next()){
				Category category=new Category();
				category.setCategoryId(rs.getInt("id"));
				category.setName(rs.getString("name"));
				category.setUserid(rs.getString("userid"));
				
				
				catList.add(category);
				
			}
			}
			catch(SQLException ex){
				ex.printStackTrace();
			}
			finally{
				super.closeResultSet(rs);
				super.closePreparedStatement(pstmt);
				super.closeConnection();
			}
			return catList;
		
	}

}
