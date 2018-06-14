<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ taglib prefix="c" uri="http://www.springframework.org/tags"%>
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
	
	<%String userid=session.getAttribute("username").toString(); %>

	<div class="login-section-agileits">
		<h3 class="form-head">Add Category:<%=userid %></h3>
		<form action="./submitCategory.htm" method="post">
			<div class="w3ls-icon">
				<span class="fa fa-user" aria-hidden="true"></span>
				<input type="text" class="lock" name="name" placeholder="catname" required="" />
			</div>
			
									
			<input type="submit" value="Add">
		</form>
	</div>
	


<jsp:include page="footer.jsp"/>
</body>

</html>