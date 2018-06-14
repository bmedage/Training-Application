package com.infotech.pem.dao;

import java.util.List;

import com.infotech.pem.model.Category;

/**
 * 
 * @author Bhushan Medage
 *
 */

public interface CategoryDao {

	public int addCategory(Category category);	
	public List<Category> listAllCategory(String userid);
	public int deleteCategory(Integer  id);
}
