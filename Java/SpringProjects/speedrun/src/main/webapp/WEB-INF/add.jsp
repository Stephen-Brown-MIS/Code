<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
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
<title>Speedrun New Order</title>
</head>
<body>
			
<div class="container">
	<h3 class="text-primary">Create an Order</h3>
	<div class="row col-sm-8">
		<div class="gray">
		<form:form action="/createOrder" method="POST" modelAttribute="order">
			<div>
				<form:label path="orderName">Name: </form:label><br>
				<form:input path="orderName"/>
				<form:errors path="orderName" class="text-danger"/>
			</div>
			<a href="/orders"class="btn btn-secondary">Cancel</a>
			<button class="btn btn-success">Submit</button>
			</div>
		</form:form>	
	</div>
</div>
</body>
</html>