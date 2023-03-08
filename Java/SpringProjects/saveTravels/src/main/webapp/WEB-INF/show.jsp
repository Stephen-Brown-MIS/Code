<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
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
<title>Show</title>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-sm-8">
	<h2 class="text-success">${expense.expenseName}</h2>
	<h5>Vendor:${expense.vendorName}</h5>
	<h5>Amount: $${expense.expenseAmount}</h5>
	<h5>Description: ${expense.description}</h5>
	</div><br><br>
	<a href="/expenses">Go back</a>
	</div>
</div>
</body>
</html>