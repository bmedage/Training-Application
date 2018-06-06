<%@page import="com.bhushan.infosoft.model.Expense"%>
<%@page import="com.bhushan.infosoft.serviceimpl.ExpenseServiceImpl"%>
<%@page import="com.bhushan.infosoft.service.ExpenseService"%>
<%@page import="com.bhushan.infosoft.model.Category"%>
<%@page import="com.bhushan.infosoft.serviceimpl.CategoryServiceImpl"%>
<%@page import="com.bhushan.infosoft.service.CategoryService"%>
<%@page import="java.util.*"%>
<%
	//Create user object and assign the registration form data
	session.setAttribute("userid",session.getAttribute("userid"));
	
	%>

	<%!
	ExpenseService expService=new ExpenseServiceImpl();
      %>
      
  <%    
  String userid=request.getParameter("userid");
	
  List<Expense>expList=expService.listMonthalyExpense(userid);
	
	request.setAttribute("expList", expList);
	pageContext.forward("showListMontlyExp.jsp");
	
	
%>