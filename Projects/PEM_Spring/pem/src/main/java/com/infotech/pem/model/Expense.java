
package com.infotech.pem.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This is Domain class for Expense
 * @author Bhushan Medage
 *
 */

public class Expense  implements Serializable {
	/**
	 * This is unique system generated id
	 */
	private int expenseId;
	
	/**
	 * Represent  category id of Expense
	 */
	private int cagetoryId;
	
private String catName;

private String payDateAndTime;

	public String getPayDateAndTime() {
	return payDateAndTime;
}
public void setPayDateAndTime(String payDateAndTime) {
	this.payDateAndTime = payDateAndTime;
}
	public String getCatName() {
	return catName;
}
public void setCatName(String catName) {
	this.catName = catName;
}
	public int getCagetoryId() {
		return cagetoryId;
	}
	public void setCagetoryId(int cagetoryId) {
		this.cagetoryId = cagetoryId;
	}
	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}
	
	public int getExpenseId() {
		return expenseId;
	}

	/**
	 * Represent Amount of Expense
	 */
	private String amount;
	private String month;
	private String year;
	
	private String total;
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}

	/**
	 * Represent Date of Expense
	 */
	private String date;
	
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * Represent Remark of Expense
	 */
	private String remark;
	
	private String userid;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Expense() {
		
	}
	public Expense(int cagetoryId, String amount, String date, String remark) {
		super();
		this.cagetoryId = cagetoryId;
		this.amount = amount;
		this.date = date;
		this.remark = remark;
	}
	
	
	
	
	
	
	
	public String getAmount() {
		return amount;
	}
	
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getRemark() {
		return remark;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
