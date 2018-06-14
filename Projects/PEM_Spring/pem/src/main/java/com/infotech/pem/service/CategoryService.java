package com.infotech.pem.service;

import java.util.List;

import com.infotech.pem.model.Category;



public interface CategoryService {

	
	public int addCategory(Category category);
	public List<Category> listAllCategory(String userid);
	public int deleteCategory(Integer  id);
}
