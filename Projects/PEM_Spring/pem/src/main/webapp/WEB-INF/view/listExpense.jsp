<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ taglib prefix="c" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s"%>
<!DOCTYPE HTML>
<html lang="zxx">

<head>
	<title>PEM App</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="Appraise Register Form template Responsive, Login form web template,Flat Pricing tables,Flat Drop downs Sign up Web Templates, 
 Flat Web Templates, Login sign up Responsive web template, SmartPhone Compatible web template, free web designs for Nokia, Samsung, LG, SonyEricsson, Motorola web design">
	<script type="application/x-javascript">
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<!-- Custom Theme files -->
	
	
	<c:url value="/static/css/font-awesome.css"  var="mainCss" />
	<c:url value="/static/css/style.css" var="styleCss" />
	
	<link href="${mainCss}" rel="stylesheet" />
	<link href="${styleCss}" rel="stylesheet" type='text/css'  />
	
	
	<!--fonts-->
	<link href="//fonts.googleapis.com/css?family=Josefin+Sans:100,100i,300,300i,400,400i,600,600i,700,700i" rel="stylesheet">
	<link href="//fonts.googleapis.com/css?family=PT+Sans:400,400i,700,700i" rel="stylesheet">
	<!--//fonts-->
</head>

<body>
<jsp:include page="menubar.jsp"/><br><br><br><br><br><br><br><br>
	<!-- login -->
	
	

	<div class="login-section-agileits">
	<h1 style="font-size: 25px; color: maroon;"> List Of Category :: <%=session.getAttribute("username")%>	</h1><br>
		
		
		
		<style>
			table, th, td {
			    border: 1px solid black;
			}
			</style>

		<div align="center">
		<table border="2" cellpadding="5">
          
			    <thead>
			      <tr style="font-size: 25px; color: #000080; background-color: #FFA07A;">
			        <th><b>Expense Id </b></th>
			        <th><b>Category </b></th>
			        <th><b>Expense For</b></th>
			        <th><b>Amount </b></th>
			        <th><b>Date of Pay </b></th>
			        
			                
			      </tr>
			    </thead>
			    <tbody >
					  <s:forEach items="${requestScope.explist}" var="explist"> 
                 
					      <tr>
					      
					        <td align="center">${explist.expenseId}</td>
					        <td align="center">${explist.catName}</td>
					        <td align="center">${explist.remark}</td>
					        <td align="center">${explist.amount}</td>
					        <td align="center">${explist.payDateAndTime}</td>
					        
					      </tr>    
					   </s:forEach>
					   
					    </tbody>
					  </table>  
		</div>			  
		
	</div>
	


<jsp:include page="footer.jsp"/>
</body>

</html>