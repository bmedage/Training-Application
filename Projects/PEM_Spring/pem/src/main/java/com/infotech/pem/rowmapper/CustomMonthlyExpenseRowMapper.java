package com.infotech.pem.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.infotech.pem.model.Expense;


/**
 *  This class provide functionality to add expenses data from database using row mapper
 *  This row mapper is used for generating reports.
 * @author Bhushan Medage
 *
 */
public class CustomMonthlyExpenseRowMapper implements RowMapper<Expense>{	
	public Expense mapRow(ResultSet rs, int i) throws SQLException {
		Expense  expense = new Expense();		
		expense.setMonth(rs.getString("month"));
		expense.setTotal(rs.getString("total"));
		expense.setYear(rs.getString("year"));
		expense.setCatName(rs.getString("catname"));
		return expense;
	}
}
