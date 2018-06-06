package com.bhushan.infosoft.sevlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bhushan.infosoft.model.Category;
import com.bhushan.infosoft.model.Expense;
import com.bhushan.infosoft.service.CategoryService;
import com.bhushan.infosoft.service.ExpenseService;
import com.bhushan.infosoft.serviceimpl.CategoryServiceImpl;
import com.bhushan.infosoft.serviceimpl.ExpenseServiceImpl;

/**
 * Servlet implementation class AddExpenses
 */
@WebServlet("/AddExpenses")
public class AddExpenses extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
			throws ServletException, IOException { 
	
	
	response.setContentType("text/html");  
	PrintWriter out = response.getWriter();  
	
	ExpenseService expservice=new ExpenseServiceImpl();
	String userid=request.getParameter("userid");  
	 
	
	System.out.println(request.getParameter("category"));
	System.out.println(request.getParameter("userid"));
	System.out.println(request.getParameter("amount"));
	System.out.println(request.getParameter("remark"));
	
	
	HttpSession session = request.getSession(false);
	if(session!=null)
	session.setAttribute("name",userid );
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");  
	   LocalDateTime now = LocalDateTime.now();  
	   System.out.println(dtf.format(now));
	   
	   String dt=dtf.format(now);
	   
	
	
	Expense exp=new Expense();
	
	exp.setRemark(request.getParameter("remark"));
	exp.setAmount(request.getParameter("amount"));
	exp.setUserid(request.getParameter("userid"));
	exp.setCatName(request.getParameter("category"));
	exp.setPayDateAndTime(dt);
	
	expservice.addExpense(exp);
	RequestDispatcher rd=request.getRequestDispatcher("expAddSuccess.jsp?msg=Expense Added Successfully");  
	rd.forward(request,response);
	
	
	
	}

}
