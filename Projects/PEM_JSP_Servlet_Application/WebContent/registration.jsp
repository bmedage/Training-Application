<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>user registration</title>
</head>
<body background="image/bg.jpg">

<table border="1" style="margin: auto;" width="80%">
<tr>
	<td>
		<jsp:include page="header.jsp"/>
	</td>
</tr>
<tr>
	<td height="20">
		<jsp:include page="menubar.jsp"/>
	</td>
</tr>
<tr>
	<td height="400" align="center">
		<form action="registrationProcess.jsp" method="post">
			<table border="1">
			<caption>User Registration</caption>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" required/></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" required/></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" required/></td>
				</tr>
				<tr>
					<td>Login Name</td>
					<td><input type="text" name="loginName" required/></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" required/></td>
				</tr>
				<tr>
					
					<td colspan="2" style="text-align: right;"><input type="submit" value="Register"/></td>
				</tr>
				
			</table>
		
		</form>
	</td>
</tr>
<tr>
	<td height="10">
		<jsp:include page="footer.jsp"/>
	</td>
</tr>
</table>

</body>
</html>