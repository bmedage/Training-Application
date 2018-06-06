
<%@page import="com.bhushan.infosoft.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    response.addHeader("Expires", "-1");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="powderblue">

	<%
	session.setAttribute("userid",session.getAttribute("name"));%>
	<table border="1" style="margin: auto;" width="80%">
		<tr>
			<td>
			<jsp:include page="header.jsp" />
			
			
			</span>
			
			</td>
			
		</tr>
		<tr>
			<td height="20"><jsp:include page="menubar.jsp" /></td>
		</tr>
		<tr>
		    
			<td height="550" align="center">
			
			<h2> Hello <%=session.getAttribute("name")%>	</h2>
	     
			<h2>${param.msg}</h2>
			
			
			
			</td>
		</tr>
		<tr>
			<td height="10"><jsp:include page="footer.jsp" /></td>
		</tr>
	</table>

</body>

</html>