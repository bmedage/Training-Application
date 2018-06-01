
package com.infosoft.bhushan;

import java.util.Date;

/**
 * This is Domain class for Expense
 * @author Bhushan Medage
 *
 */

public class Expense {
	/**
	 * This is unique system generated id
	 */
	private Long expenseId = System.currentTimeMillis();
	
	/**
	 * Represent  category id of Expense
	 */
	private Long cagetoryId;
	
	/**
	 * Represent Amount of Expense
	 */
	private double amount;
	/**
	 * Represent Date of Expense
	 */
	private Date date;
	
	/**
	 * Represent Remark of Expense
	 */
	private String remark;
	
	public Expense() {
		
	}
	public Expense(Long cagetoryId, double amount, Date date, String remark) {
		super();
		this.cagetoryId = cagetoryId;
		this.amount = amount;
		this.date = date;
		this.remark = remark;
	}
	
	public Long getExpenseId() {
		return expenseId;
	}
	
	public void setExpenseId(Long expenseId) {
		this.expenseId = expenseId;
	}
	
	public Long getCagetoryId() {
		return cagetoryId;
	}
	
	public void setCagetoryId(Long cagetoryId) {
		this.cagetoryId = cagetoryId;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getRemark() {
		return remark;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
