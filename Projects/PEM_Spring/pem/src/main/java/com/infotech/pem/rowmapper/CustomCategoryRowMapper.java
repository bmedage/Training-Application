package com.infotech.pem.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.infotech.pem.model.Category;

/**
 * This class provide functionality to add Category data from database using row mapper
 * @author Bhushan Medage
 *
 */
public class CustomCategoryRowMapper implements RowMapper<Category> {

	public Category mapRow(ResultSet rs, int i) throws SQLException {
		Category  category = new Category();
		category.setCategoryId(rs.getInt("id"));
		category.setName(rs.getString("name"));
		category.setUserid(rs.getString("userid"));	
		
		return category;
	}

}
