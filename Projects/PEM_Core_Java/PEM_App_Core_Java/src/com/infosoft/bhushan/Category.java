package com.infosoft.bhushan;
/**
 * This is domain class for Category
 * @author Bhushan Medage
 *
 */

public class Category {
	
	/**
	 * This is simply system genrated unique code for Id
	 */
	private Long categoryId=System.currentTimeMillis();
	
	/**
	 * This is name of Category
	 */
	private String name;
		

	public Category(String name) {
		this.name = name;
	}

	public Category(Long categoryId, String name) {
		this.categoryId = categoryId;
		this.name = name;
	}

	public Category() {
		
	}	
	
	public Long getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	

}
