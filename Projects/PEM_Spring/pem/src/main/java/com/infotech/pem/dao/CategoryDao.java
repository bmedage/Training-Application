package com.infotech.pem.dao;

import java.util.List;

import com.infotech.pem.model.Category;

/**
 *  This is interface for category to perform databasse related operation.
 * @author Bhushan Medage
 *
 */

public interface CategoryDao {

	/**
	 * This methods perform add category operation
	 * @param category
	 * @return
	 */
	public int addCategory(Category category);	
	
	
	/**This methods perform list category operation
	 * 
	 * @param userid
	 * @return
	 */
	public List<Category> listAllCategory(String userid);
	
}
