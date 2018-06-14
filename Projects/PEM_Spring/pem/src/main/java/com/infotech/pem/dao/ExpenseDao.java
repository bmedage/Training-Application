package com.infotech.pem.dao;

import java.util.List;

import com.infotech.pem.model.Expense;

/**
 * 
 * @author Bhushan Medage
 *
 */

public interface ExpenseDao {

	public int addExpense(Expense expense);
	public List<Expense> listAllExpense(String userid);	
	public List<Expense> listMonthlyExpenses(String userid);	
	public List<Expense> listYearlyExpenses(String userid);
	public List<Expense> listCategoryWise(String userid);
	 public int deleteExpenses(Integer  id);
}
