package com.bhushan.infosoft.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.bhushan.infosoft.dao.ExpenseDao;
import com.bhushan.infosoft.model.Category;
import com.bhushan.infosoft.model.Expense;
import com.bhushan.infosoft.util.JDBCUtil;


public class ExpenseDaoImpl extends JDBCUtil implements ExpenseDao {

	@Override
	public void addExpense(Expense expense) {
		
		PreparedStatement pstmt=super.createPreparedStatement("insert into expenses(name,userid,catname,amount,date,month,year) values (?,?,?,?,?,?,?)");
		try {
			pstmt.setString(1, expense.getRemark());
			pstmt.setString(2, expense.getUserid());
			pstmt.setString(3, expense.getCatName());
			pstmt.setString(4, expense.getAmount());
			pstmt.setString(5, expense.getPayDateAndTime());
			
			
			String dt=expense.getPayDateAndTime();
			   //System.out.println(dt);
			   
			   String arr[]=dt.split("/");
			   String month = null;
			   String year = null;
			   for (int i = 0; i < arr.length; i++) {
						
				 month=arr[1];
				System.out.println("------------m"+month);
				
				year=arr[2];
				System.out.println("-----------y"+year);
			
			   }
			
			   pstmt.setString(6,month);
			   pstmt.setString(7,year);
			   
			   
			   
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			super.closePreparedStatement(pstmt);
			super.closeConnection();			
		}

	}

	@Override
	public List<Expense> listAllExpense(String userid) {
		List<Expense> expList=new ArrayList<>();
		ResultSet rs=null;
		
		PreparedStatement pstmt=super.createPreparedStatement("select * from expenses where userid=?");
		try {
			pstmt.setString(1, userid);
			
			rs=pstmt.executeQuery();
			while(rs.next()){
				Expense expense=new Expense();
				expense.setExpenseId(rs.getInt("id"));
				expense.setRemark(rs.getString("name"));
				expense.setUserid(rs.getString("userid"));
				expense.setCatName(rs.getString("catname"));
				expense.setAmount(rs.getString("amount"));
				expense.setPayDateAndTime(rs.getString("date"));
				
				expList.add(expense);
				
			}
			}
			catch(SQLException ex){
				ex.printStackTrace();
			}
			finally{
				super.closeResultSet(rs);
				super.closePreparedStatement(pstmt);
				super.closeConnection();
			}
			return expList;

	}

	@Override
	public  List<Expense>  listMonthlyExpenses(String userid) {
		List<Expense> expList=new ArrayList<>();
		ResultSet rs=null;
		ResultSet rs2=null;
		String totalExpense=null;
		PreparedStatement pstmt=super.createPreparedStatement("SELECT  month,SUM(amount) as 'total' FROM expenses where userid=? GROUP BY month");
		try {
			pstmt.setString(1, userid);
			
			rs=pstmt.executeQuery();
			while(rs.next()){
				Expense expense=new Expense();
				
				
				
				
				expense.setMonth(rs.getString("month"));
						
				
				totalExpense=	rs.getString("total");
				
				expense.setTotal(totalExpense);
				
			
				
				expList.add(expense);
				
			
				
			}
			}
			catch(SQLException ex){
				ex.printStackTrace();
			}
			finally{
				super.closeResultSet(rs);
				super.closePreparedStatement(pstmt);
				super.closeConnection();
			}
			return expList;
	}

	@Override
	public List<Expense> listYearlyExpenses(String userid) {
		List<Expense> expList=new ArrayList<>();
		ResultSet rs=null;
		ResultSet rs2=null;
		String totalExpense=null;
		PreparedStatement pstmt=super.createPreparedStatement("SELECT  year,SUM(amount) as 'total' FROM expenses where userid=? GROUP BY year");
		try {
			pstmt.setString(1, userid);
			
			rs=pstmt.executeQuery();
			while(rs.next()){
				Expense expense=new Expense();
				
				expense.setYear(rs.getString("year"));						
				
				totalExpense=	rs.getString("total");
				
				expense.setTotal(totalExpense);	
			
				
				expList.add(expense);		
			
				
			}
			}
			catch(SQLException ex){
				ex.printStackTrace();
			}
			finally{
				super.closeResultSet(rs);
				super.closePreparedStatement(pstmt);
				super.closeConnection();
			}
			return expList;
	}

	@Override
	public List<Expense> listCategoryWise(String userid) {
		List<Expense> expList=new ArrayList<>();
			ResultSet rs=null;
			
			String totalExpense=null;
			PreparedStatement pstmt=super.createPreparedStatement("SELECT  catname,SUM(amount) as 'total' FROM expenses where userid=? GROUP BY catname");
			try {
				pstmt.setString(1, userid);
				
				rs=pstmt.executeQuery();
				while(rs.next()){
					Expense expense=new Expense();
					
					expense.setCatName(rs.getString("catname"));						
					
					totalExpense=	rs.getString("total");
					
					expense.setTotal(totalExpense);	
				
					
					expList.add(expense);		
				
					
				}
				}
				catch(SQLException ex){
					ex.printStackTrace();
				}
				finally{
					super.closeResultSet(rs);
					super.closePreparedStatement(pstmt);
					super.closeConnection();
				}
				return expList;
		
	}

}	