package com.bhushan.infosoft.serviceimpl;

import java.util.List;
import java.util.Map;

import com.bhushan.infosoft.dao.ExpenseDao;
import com.bhushan.infosoft.daoimpl.ExpenseDaoImpl;
import com.bhushan.infosoft.model.Category;
import com.bhushan.infosoft.model.Expense;
import com.bhushan.infosoft.service.ExpenseService;

public class ExpenseServiceImpl implements ExpenseService {

	private ExpenseDao expenseDao=null;
	
	public ExpenseServiceImpl() {
		expenseDao=new ExpenseDaoImpl();
	}
	@Override
	public void addExpense(Expense expense) {
		
		expenseDao.addExpense(expense);
	}

	@Override
	public List<Expense> listAllExpense(String userid) {
		return expenseDao.listAllExpense(userid);

	}
	@Override
	public List<Expense> listMonthalyExpense(String userid) {
		// TODO Auto-generated method stub
		return expenseDao.listMonthlyExpenses(userid);
	}
	
	@Override
	public List<Expense> listYearlyExpense(String userid) {
		// TODO Auto-generated method stub
		return expenseDao.listYearlyExpenses(userid);
	}
	
	@Override
	public List<Expense> listCategoryWise(String userid) {
		// TODO Auto-generated method stub
		return expenseDao.listCategoryWise(userid);
	}

}
