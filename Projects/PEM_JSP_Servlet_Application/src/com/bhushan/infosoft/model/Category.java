package com.bhushan.infosoft.model;

import java.io.Serializable;

/**
 * This is domain class for Category
 * @author Bhushan Medage
 *
 */

public class Category implements Serializable{
	
	/**
	 * This is simply system genrated unique code for Id
	 */
	private int categoryId;
	
	
	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	/**
	 * This is name of Category
	 */
	private String name;
	
	private String userid;
		

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Category(String name) {
		this.name = name;
	}

	public Category(int categoryId, String name) {
		this.categoryId = categoryId;
		this.name = name;
	}

	public Category() {
		
	}	
	
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	

}
