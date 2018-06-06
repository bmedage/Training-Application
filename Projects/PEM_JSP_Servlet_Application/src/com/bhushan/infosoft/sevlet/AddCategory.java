package com.bhushan.infosoft.sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bhushan.infosoft.model.Category;
import com.bhushan.infosoft.service.CategoryService;
import com.bhushan.infosoft.service.UserService;
import com.bhushan.infosoft.serviceimpl.CategoryServiceImpl;
import com.bhushan.infosoft.serviceimpl.UserServiceImpl;

/**
 * Servlet implementation class AddCategory
 */
@WebServlet("/AddCategory")
public class AddCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
			throws ServletException, IOException { 
	
	
	response.setContentType("text/html");  
	PrintWriter out = response.getWriter();  
	
	CategoryService catservice=new CategoryServiceImpl();
	String userid=request.getParameter("userid");  
		
	HttpSession session = request.getSession(false);
	if(session!=null)
	session.setAttribute("name",userid );
	
	
	Category cat=new Category();
	cat.setName(request.getParameter("catname"));
	cat.setUserid(request.getParameter("userid"));
	
	catservice.addCategory(cat);
	RequestDispatcher rd=request.getRequestDispatcher("catAddSuccess.jsp?msg=Category Added Successfully");  
	rd.forward(request,response);

}  

}
