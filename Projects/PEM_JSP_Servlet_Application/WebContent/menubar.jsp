<%
    response.addHeader("Expires", "-1");
%>



<%
     String userid=null;
     userid=session.getAttribute("userid").toString();%>
     
	<%-- user is logged in --%>
	
	<p>
	<a href="#">HOME</a> |
	<a href="addCategory.jsp?userid=<%=userid%>">ADD CATEGORY</a> |
	<a href="callListMethod.jsp?userid=<%=userid%>">LIST CATEGORY</a> |
	<a href="callAddExpense.jsp?userid=<%=userid%>">ADD EXPENSE</a> |
	<a href="callExpList.jsp?userid=<%=userid%>">LIST EXPENSES</a> |
	<a href="listMonthlyExpenses.jsp?userid=<%=userid%>">MONTHLY EXPENSES</a> |
	<a href="expListYeayCall.jsp?userid=<%=userid%>">YEARLY EXPENSES</a> |
	<a href="categoeyListCall.jsp?userid=<%=userid%>">CATEGORIZED EXPENSES</a> |
	<a href="logoutProcess.jsp">LOGOUT</a>	
</p>




