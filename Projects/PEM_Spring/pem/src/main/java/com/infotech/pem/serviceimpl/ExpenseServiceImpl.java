package com.infotech.pem.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.pem.dao.ExpenseDao;
import com.infotech.pem.daoimpl.ExpenseDaoImpl;
import com.infotech.pem.model.Expense;
import com.infotech.pem.service.ExpenseService;

/**
 * This class implements methods of Expense service
 * Then Provide call to ExpenseDao
 * @author Bhushan Medage
 *
 */

@Service ("expservice")
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	ExpenseDao expensedao;

	/**
	 * This method call addExpense method of ExpenseDao class
	 */
	public int addExpense(Expense expense) {
		return expensedao.addExpense(expense);	
		
	}

	
	/**
	 * This method call listAllExpense method of ExpenseDao class
	 */
	public List<Expense> listAllExpense(String userid) {
		return expensedao.listAllExpense(userid);
	}

	
	
	/**
	 * This method call listMonthalyExpense method of ExpenseDao class
	 */
	public List<Expense> listMonthalyExpense(String userid) {
		return expensedao.listMonthlyExpenses(userid);
	}

	
	/**
	 * This method call listYearlyExpense method of ExpenseDao class
	 */
	public List<Expense> listYearlyExpense(String userid) {
		return expensedao.listYearlyExpenses(userid);
	}

	
	/**
	 * This method call listCategoryWise method of ExpenseDao class
	 */
	public List<Expense> listCategoryWise(String userid) {
		return expensedao.listCategoryWise(userid);
	}

	
	/**
	 * This method call deleteExpenses method of ExpenseDao class
	 */
	public int deleteExpenses(Integer id) {
		return expensedao.deleteExpenses(id);
	}
	

}
