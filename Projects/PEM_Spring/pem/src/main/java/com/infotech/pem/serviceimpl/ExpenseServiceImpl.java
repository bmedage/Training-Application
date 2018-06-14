package com.infotech.pem.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.pem.dao.ExpenseDao;
import com.infotech.pem.daoimpl.ExpenseDaoImpl;
import com.infotech.pem.model.Expense;
import com.infotech.pem.service.ExpenseService;


@Service ("expservice")
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	ExpenseDao expensedao;

	public int addExpense(Expense expense) {
		return expensedao.addExpense(expense);
		
		
	}

	public List<Expense> listAllExpense(String userid) {
		return expensedao.listAllExpense(userid);
	}

	public List<Expense> listMonthalyExpense(String userid) {
		return expensedao.listMonthlyExpenses(userid);
	}

	public List<Expense> listYearlyExpense(String userid) {
		return expensedao.listYearlyExpenses(userid);
	}

	public List<Expense> listCategoryWise(String userid) {
		return expensedao.listCategoryWise(userid);
	}

	public int deleteExpenses(Integer id) {
		return expensedao.deleteExpenses(id);
	}
	

}
