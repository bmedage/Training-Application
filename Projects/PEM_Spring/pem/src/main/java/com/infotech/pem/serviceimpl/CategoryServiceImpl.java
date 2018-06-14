package com.infotech.pem.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.pem.dao.CategoryDao;
import com.infotech.pem.dao.UserDao;
import com.infotech.pem.daoimpl.CategoryDaoImpl;
import com.infotech.pem.model.Category;
import com.infotech.pem.service.CategoryService;


@Service ("catservice")
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryDao categorydao;
	

	public int addCategory(Category category) {
		return categorydao.addCategory(category);
		
	}

	public List<Category> listAllCategory(String userid) {
		return categorydao.listAllCategory(userid);
	}

	public int deleteCategory(Integer id) {
		return categorydao.deleteCategory(id);
	}
	
	

}
