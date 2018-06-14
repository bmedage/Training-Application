package com.infotech.pem.service;


import java.util.List;
import java.util.Map;

import com.infotech.pem.model.Expense;


public interface ExpenseService {

	public int addExpense(Expense expense);
	public List<Expense> listAllExpense(String userid);	
	public int deleteExpenses(Integer  id);
	public  List<Expense> listMonthalyExpense(String userid);
	public  List<Expense> listYearlyExpense(String userid);	
	public  List<Expense> listCategoryWise(String userid);
}
