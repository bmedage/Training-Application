package com.bhushan.infosoft.serviceimpl;

import java.util.List;

import com.bhushan.infosoft.dao.CategoryDao;
import com.bhushan.infosoft.daoimpl.CategoryDaoImpl;
import com.bhushan.infosoft.model.Category;
import com.bhushan.infosoft.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {

	private CategoryDao categoryDao=null;
	
	public CategoryServiceImpl() {
		categoryDao= new CategoryDaoImpl();
	}
	
	@Override
	public void addCategory(Category category) {
		categoryDao.addCategory(category);

	}

	@Override
	public List<Category> listAllCategory(String userid) {
		return categoryDao.listAllCategory(userid);

	}

}
