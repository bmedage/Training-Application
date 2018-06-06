package com.bhushan.infosoft.sevlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bhushan.infosoft.model.Expense;
import com.bhushan.infosoft.service.ExpenseService;
import com.bhushan.infosoft.serviceimpl.ExpenseServiceImpl;


/**
 * Servlet implementation class MonthlyReport
 */
@WebServlet("/MonthlyReport")
public class MonthlyReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
			throws ServletException, IOException { 
	
	
	response.setContentType("text/html");  
	PrintWriter out = response.getWriter();  
	
	ExpenseService expservice=new ExpenseServiceImpl();
	String userid=request.getParameter("userid");  
	
	
	
	
	expservice.listMonthalyExpense(userid);
	
	RequestDispatcher rd=request.getRequestDispatcher("expAddSuccess.jsp?msg=Expense Added Successfully");  
	rd.forward(request,response);
	
	}

}
