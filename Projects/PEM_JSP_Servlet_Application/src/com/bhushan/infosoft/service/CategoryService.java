package com.bhushan.infosoft.service;

import java.util.List;

import com.bhushan.infosoft.model.Category;
import com.bhushan.infosoft.model.User;

public interface CategoryService {

	
	public void addCategory(Category category);
	public List<Category> listAllCategory(String userid);
}
