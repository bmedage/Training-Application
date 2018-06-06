package com.bhushan.infosoft.dao;

import java.util.List;

import com.bhushan.infosoft.model.Category;

public interface CategoryDao {

	public void addCategory(Category category);
	
	public List<Category> listAllCategory(String userid);
}
