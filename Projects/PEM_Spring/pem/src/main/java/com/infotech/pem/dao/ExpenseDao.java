package com.infotech.pem.dao;

import java.util.List;

import com.infotech.pem.model.Expense;

/**
 * This is interface for Expense to perform databasse related operation.
 * @author Bhushan Medage
 *
 */

public interface ExpenseDao {

	/**
	 * This methods perform add Expense operation
	 * @param expense
	 * @return
	 */
	public int addExpense(Expense expense);
	
	/**
	 * This methods perform list all Expense operation
	 * @param userid
	 * @return
	 */
	
	public List<Expense> listAllExpense(String userid);	
	
	
	
	/**
	 * This methods perform list monthaly Expense operation
	 * @param userid
	 * @return
	 */
	public List<Expense> listMonthlyExpenses(String userid);	
	
	/**
	 * This methods perform list Yearly Expense operation
	 * @param userid
	 * @return
	 */
	public List<Expense> listYearlyExpenses(String userid);
	
	/**
	 * This methods perform list category wise Expense operation
	 * @param userid
	 * @return
	 */
	public List<Expense> listCategoryWise(String userid);
	
	/**
	 * This methods perform delete Expense operation
	 * @param id
	 * @return
	 */
	 public int deleteExpenses(Integer  id);
}
