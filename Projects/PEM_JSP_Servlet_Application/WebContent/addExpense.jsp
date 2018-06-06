<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<%String userid=request.getParameter("userid"); %>
<form action="AddExpenses?userid=<%=userid%>" method="post">
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
			
			<table border="1">
			<caption>Add Expense</caption>
			
			
			<tr>
			<td>Select Category</td>
			
			
			<td>
		 
							<select name="category">
							   <c:forEach items="${requestScope.catList}" var="catlist">
							       <option value="${catlist.name}"><c:out value="${catlist.name}"/></option>
							   </c:forEach>
							</select>
														
						
			 </td>
				
				</tr>
				
			
				<tr>
					<td>Expense For</td>
					<td><input type="text" name="remark" required/></td>
				</tr>
				<tr>
					<td>Amount</td>
					<td><input type="text" name="amount" required/></td>
				</tr>
				
				<tr>
					
					<td colspan="2" style="text-align: right;"><input type="submit" value="ADD"/></td>
				</tr>
				
			</table>
			
			
			
			</td>
		</tr>
		<tr>
			<td height="10"><jsp:include page="footer.jsp" /></td>
		</tr>
	</table>
</form>
</body>

</html>