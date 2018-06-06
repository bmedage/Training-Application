package com.bhushan.infosoft.service;


import java.util.List;
import java.util.Map;

import com.bhushan.infosoft.model.Category;
import com.bhushan.infosoft.model.Expense;

public interface ExpenseService {

	public void addExpense(Expense expense);
	public List<Expense> listAllExpense(String userid);
	
	public  List<Expense> listMonthalyExpense(String userid);
	public  List<Expense> listYearlyExpense(String userid);
	
	public  List<Expense> listCategoryWise(String userid);
}
