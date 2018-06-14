package com.infotech.pem.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.websocket.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.infotech.pem.dao.CategoryDao;
import com.infotech.pem.model.Category;
import com.infotech.pem.rowmapper.CustomCategoryRowMapper;
import com.infotech.pem.util.JDBCUtil;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

@Repository("catdao")
public class CategoryDaoImpl implements CategoryDao {
 
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
	
	
	
	public int addCategory(Category category) {
		String sql = "insert into categories(name,userid) values(?,?)";
		
		int i = jdbcTemplate.update(sql,new Object[] {category.getName(),category.getUserid()});
				
		if(i>0) {
			return i;
		}
		return 0;
	}

	public List<Category> listAllCategory(String userid) {
		String sql="select * from categories where userid=?";
		
		List<Category> catlist=new ArrayList<Category>();
		catlist=jdbcTemplate.query(sql, new CustomCategoryRowMapper(),userid);
		
		return catlist;
	}


	public int deleteCategory(Integer id) {
		String DELETE = " DELETE FROM categories WHERE id=?";
	    int i=jdbcTemplate.update(DELETE, id);
		if(i>0) {
			return i;
		}
		return 0;
	}

	
}
