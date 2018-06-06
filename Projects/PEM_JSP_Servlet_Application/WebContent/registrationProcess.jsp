
<%@page import="com.bhushan.infosoft.serviceimpl.UserServiceImpl"%>
<%@page import="com.bhushan.infosoft.service.UserService"%>
<%@page import="com.bhushan.infosoft.model.User"%>
<%
	//Create user object and assign the registration form data
	User user=new User();
	user.setName(request.getParameter("name"));
	user.setEmail(request.getParameter("email"));
	user.setAddress(request.getParameter("address"));
	user.setLoginName(request.getParameter("loginName"));
	user.setPassword(request.getParameter("password"));
	// use UserServiceImpl object to register user
	
	UserService userService=new UserServiceImpl();
	userService.userRegistration(user);
	pageContext.forward("index.jsp?msg=User Registered Successfully!");
%>