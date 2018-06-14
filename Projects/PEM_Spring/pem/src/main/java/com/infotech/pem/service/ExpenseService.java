package com.infotech.pem.service;


import java.util.List;
import java.util.Map;

import com.infotech.pem.model.Expense;

/**
 * This is interface for expense service 
 * Tis interface contains various unimplemented methods
 * @author Bhushan Medage
 *
 */
public interface ExpenseService {

	/**
	 * This method add expense depending in category
	 * @param expense
	 * @return
	 */
	public int addExpense(Expense expense);
	
	/**
	 * This method list all expenses depending upon userid
	 * @param userid
	 * @return
	 */
	public List<Expense> listAllExpense(String userid);	
	
	/**
	 * This method delete  expenses depending upon expense id
	 * @param id
	 * @return
	 */
	public int deleteExpenses(Integer  id);
	
	
	/**
	 * This method list all expenses monthly
	 * @param userid
	 * @return
	 */
	public  List<Expense> listMonthalyExpense(String userid);
	
	/**
	 * This method list all expenses  Yearly
	 * @param userid
	 * @return
	 */
	public  List<Expense> listYearlyExpense(String userid);	
	
	/**
	 * This method list all expenses Category wise
	 * @param userid
	 * @return
	 */
	public  List<Expense> listCategoryWise(String userid);
}
