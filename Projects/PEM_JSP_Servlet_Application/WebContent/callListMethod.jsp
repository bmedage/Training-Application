<%@page import="com.bhushan.infosoft.model.Category"%>
<%@page import="com.bhushan.infosoft.serviceimpl.CategoryServiceImpl"%>
<%@page import="com.bhushan.infosoft.service.CategoryService"%>
<%@page import="java.util.*"%>
<%
	//Create user object and assign the registration form data
	session.setAttribute("userid",session.getAttribute("userid"));
	
	%>

	<%!
	CategoryService catService=new CategoryServiceImpl();
      %>
      
  <%    
  String userid=request.getParameter("userid");
	List<Category>catList=catService.listAllCategory(userid);
	
	request.setAttribute("catList", catList);
	pageContext.forward("listCategory.jsp");
	
	
%>