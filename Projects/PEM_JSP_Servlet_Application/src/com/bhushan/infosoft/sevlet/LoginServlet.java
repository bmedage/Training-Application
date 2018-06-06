package com.bhushan.infosoft.sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bhushan.infosoft.dao.UserDao;
import com.bhushan.infosoft.daoimpl.UserDaoImpl;
import com.bhushan.infosoft.service.UserService;
import com.bhushan.infosoft.serviceimpl.UserServiceImpl;



public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)  
			throws ServletException, IOException {  
		
		UserService service=new UserServiceImpl();
		//UserDaoImpl daoimpl=new UserDaoImpl();
		//UserServiceImpl service=new UserServiceImpl();
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		
		String n=request.getParameter("userid");  
		String p=request.getParameter("password"); 
		
		HttpSession session = request.getSession(false);
		if(session!=null)
		session.setAttribute("name", n);

		if(service.validate(n, p)){  
			RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");  
			rd.forward(request,response);  
		}  
		else{  
			 
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp?msg=<p style=\"color:red\">Sorry username or password error</p>");  
			rd.include(request,response);  
		}  

		out.close();  
	}  
}  