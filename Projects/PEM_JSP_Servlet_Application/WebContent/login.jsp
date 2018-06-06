<span class="message">${param.msg}</span>
<form action="loginServlet" method="post">
	
	<table border="1" style="height: 150px;width: 300px">
		<tr>
			<td>User id</td>
			<td><input type="text" name="userid"/></td>
		</tr>
		
		<tr>
			<td>Password</td>
			<td><input type="password" name="password"/></td>
		</tr>
		<tr>
			
			<td colspan="2" style="text-align: right;"><a href="registration.jsp">Registration</a>&nbsp;&nbsp;<input type="submit" value="Login"/></td>
		</tr>
	
	</table>

</form>