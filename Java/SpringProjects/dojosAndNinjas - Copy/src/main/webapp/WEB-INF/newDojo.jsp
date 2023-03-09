<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<div class="row">
	<h3 class="text-primary">New Dojo</h3>
	<div class="gray col-sm-6">
	<form:form action="/createDojo" method="POST" modelAttribute="dojo" class="form1">
		<div>
			<form:label path="dojoName">First Name: </form:label><br>
			<form:input path="dojoName"/>
			<form:errors path="dojoName" class="text-danger"/>
		</div>

		<button class="button1">Submit</button>
		</div>
	</form:form>	
	</div>
<a href="/ninjas/new">Add a Ninja</a>
</div>
</body>
</html>