package com.infotech.pem.service;

import java.util.List;

import com.infotech.pem.model.Category;


/**
 * This is interface for category service.
 * @author Bhushan Medage
 *
 */
public interface CategoryService {

	/**
	 * This method add category which is enter by user
	 * @param category
	 * @return
	 */
	public int addCategory(Category category);
	
	
	/**
	 * This method list all category which is enter by user
	 * @param userid
	 * @return
	 */
	public List<Category> listAllCategory(String userid);
	
}
