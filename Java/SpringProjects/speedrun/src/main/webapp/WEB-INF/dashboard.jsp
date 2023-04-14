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
<title>Speedrun Dashboard</title>
</head>
<body>

<div class = "container">
	<div class="col-sm-8">
	<div class=row>
		<p class="text-primary text-end">Welcome, <c:out value="${loggedUser.userName}"></c:out>!
		<a href="/logout"class="text-end">logout</a></p>
	</div>
	
	<div class=row>
		<a href="/items"class="text-end">Maintain Inventory</a>
	</div>
	<h4>Orders</h4> 
		<div class="row justify-content-md-center">
			
			<table class="table table-striped">
				<thead class="table-dark">
					<tr>
						<th>Order</th>
						<th>Summary</th>
						<th>Date</th>
						<th></th>
						
					</tr>
				</thead>
				<tbody>
					<c:forEach var="order" items="${orders}">
					<tr>
        				<td><c:out value="${order.id}"></c:out></td>
						<td><a href="/orders/${order.id}"><c:out value="${order.orderName}"></c:out></a></td>
						<td><c:out value="${order.createdAt}"></c:out><td>
        				
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<p><a href="/orders/new" class="btn btn-primary">Add a order</a></p>  
	</div>
</div>

</body>
</html>