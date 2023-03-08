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
<title>Expense Tracker</title>
</head>
<body>
<div class = "container">
	<h1 class="text-primary">Save Travels</h1>
	<div class="col-sm-8">
		<div class="row justify-content-md-center">
			
			<table class="table">
				<thead class="table-dark">
					<tr>
						
						<th>Expense</th>
						<th>Vendor</th>
						<th>Amount</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="expense" items="${expenses}">
					<tr>
        				<td><a href="/expenses/${expense.id}"><c:out value="${expense.expenseName}"></c:out></a></td>
        				<td><c:out value="${expense.vendorName}"></c:out></td>
        				<td>$<c:out value="${expense.expenseAmount}"></c:out></td>
        				<td><a href="/expenses/edit/${expense.id}" class="btn btn-primary">edit</a></td>
        				<td><form action="/expenses/${expense.id}" method="POST">
        					<input type="hidden" name="_method" value="delete"> 
        					<button class="btn btn-danger">delete</button> </form></td>
        				
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
<div class="container">
	<div class="row">
	<h3 class="text-primary">Add an Expense</h3>
	<div class="gray col-sm-6">
	<form:form action="/createExpense" method="POST" modelAttribute="expense" class="form1">
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