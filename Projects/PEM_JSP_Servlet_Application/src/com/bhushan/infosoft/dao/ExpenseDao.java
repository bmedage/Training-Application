package com.bhushan.infosoft.dao;

import java.util.List;
import java.util.Map;

import com.bhushan.infosoft.model.Category;
import com.bhushan.infosoft.model.Expense;

public interface ExpenseDao {

	public void addExpense(Expense expense);
	public List<Expense> listAllExpense(String userid);
	
	public  List<Expense>  listMonthlyExpenses(String userid);
	
	public List<Expense> listYearlyExpenses(String userid);
	public List<Expense> listCategoryWise(String userid);
}
