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
<title>Edit Expense</title>
</head>
<body>

<div class="container">
	<div class="row">
	<h3 class="text-primary">Edit Expense</h3>
	<a href="/expenses">Go back</a>
	<div class="gray col-sm-8">
	<form:form action="/expenses/${expense.id}" method="POST" modelAttribute="expense" class="form1">
    <input type="hidden" name="_method" value="PUT">
		<div>
			<form:label path="expenseName">Expense Name: </form:label><br>
			<form:input path="expenseName"/>
			<form:errors path="expenseName" class="text-danger"/>
		</div>
		<div>
			<form:label path="vendorName">Vendor: </form:label><br>
			<form:input path="vendorName"/>
			<form:errors path="vendorName" class="text-danger"/>
		</div>
		<div>
			<form:label path="expenseAmount">Amount: </form:label><br>
			<form:input path="expenseAmount" type="number" min="1" step="0.01"/>
			<form:errors path="expenseAmount" class="text-danger"/>
		</div>
		<div>
			<form:label path="description">Description: </form:label><br>
			<form:input path="description" type="text" size="50"/>
			<form:errors path="description" class="text-danger"/>
		</div>
		<button class="button1">Submit</button>
		</div>
	</form:form>	
	</div>
</div>
</body>
</html>