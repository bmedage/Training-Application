package com.infotech.pem.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.infotech.pem.dao.ExpenseDao;
import com.infotech.pem.model.Category;
import com.infotech.pem.model.Expense;
import com.infotech.pem.rowmapper.CustomCategoryRowMapper;
import com.infotech.pem.rowmapper.CustomExpensesRowMapper;
import com.infotech.pem.rowmapper.CustomMonthlyExpenseRowMapper;


/**
 * This class implements all methods interface of expensedao.
 * This class is also perform database related operation
 * @author Bhushan Medage
 *
 */

@Repository("expdao")
public class ExpenseDaoImpl implements ExpenseDao {

	Connection con = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	/**
	 * This method add the details of expenses into the database
	 */
	public int addExpense(Expense expense) {
		
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");  
		   LocalDateTime now = LocalDateTime.now(); 		  	   
		   String dt=dtf.format(now);   
		   
		   String arr[]=dt.split("/");
		   String month = null;
		   String year = null;
		   for (int i = 0; i < arr.length; i++) {					
			 month=arr[1];						
			year=arr[2];					
		   }
		   
		String sql = "insert into expenses(name,catname,userid,amount,date,month,year) values(?,?,?,?,?,?,?)";
		
		int i = jdbcTemplate.update(sql,new Object[] {expense.getRemark(),expense.getCatName(),expense.getUserid(),expense.getAmount(),dt,month,year});
				
		if(i>0) {
			return i;
		}
		return 0;
		
	}

	
	/**
	 * This method list the details of Expenses from database
	 */
	public List<Expense> listAllExpense(String userid) {
		
		String sql="select * from expenses where userid=?";		
		List<Expense> explist=new ArrayList<Expense>();
		explist=jdbcTemplate.query(sql, new CustomExpensesRowMapper(),userid);		
		return explist;	
	}

	

	/**
	 * This method list monthly the details of Expenses from database 
	 */
	
	public List<Expense> listMonthlyExpenses(String userid) {
		String sql="SELECT  month,year,catname,SUM(amount) as 'total' FROM expenses where userid=? GROUP BY month ASC";		
		List<Expense> explist=new ArrayList<Expense>();
		explist=jdbcTemplate.query(sql, new CustomMonthlyExpenseRowMapper(),userid);		
		return explist;
	}

	
	/**
	 * This method list yrarly the details of Expenses from database
	 */
	public List<Expense> listYearlyExpenses(String userid) {
		String sql="SELECT  month,year,catname,SUM(amount) as 'total' FROM expenses where userid=? GROUP BY year ASC";		
		List<Expense> explist=new ArrayList<Expense>();
		explist=jdbcTemplate.query(sql, new CustomMonthlyExpenseRowMapper(),userid);		
		return explist;
	}
	
	
	/**
	 * This method list category wise the details of Expenses from database
	 */

	public List<Expense> listCategoryWise(String userid) {
		String sql="SELECT  month,year,catname,SUM(amount) as 'total' FROM expenses where userid=? GROUP BY catname ASC";		
		List<Expense> explist=new ArrayList<Expense>();
		explist=jdbcTemplate.query(sql, new CustomMonthlyExpenseRowMapper(),userid);		
		return explist;
	}


	/**
	 * This method delete the details of Expenses from database depending on expense id
	 */
	public int deleteExpenses(Integer id) {
		String DELETE = " DELETE FROM expenses WHERE id=?";
	    int i=jdbcTemplate.update(DELETE, id);
		if(i>0) {
			return i;
		}
		return 0;
	}

	

}	