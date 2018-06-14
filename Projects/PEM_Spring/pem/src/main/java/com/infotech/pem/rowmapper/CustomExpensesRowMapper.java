package com.infotech.pem.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import com.infotech.pem.model.Expense;

/**
 *  This class provide functionality to add Expense data from database using row mapper
 * @author Bhushan Medage
 *
 */
public class CustomExpensesRowMapper implements RowMapper<Expense>{

	public Expense mapRow(ResultSet rs, int i) throws SQLException {
		Expense  expense = new Expense();
		expense.setExpenseId(rs.getInt("id"));
		expense.setRemark(rs.getString("name"));
		expense.setCatName(rs.getString("catname"));		
		expense.setUserid(rs.getString("userid"));	
		expense.setAmount(rs.getString("amount"));
		expense.setPayDateAndTime(rs.getString("date"));
		expense.setMonth(rs.getString("month"));
		expense.setYear(rs.getString("year"));
		
		return expense;
	}
}
