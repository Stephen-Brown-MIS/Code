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
<title>Add Order Item Qty</title>
</head>
<body>

<div class="container">
	<h3 class="text-primary">How many do you want?</h3>
	<div class="col-sm-8">
		<div class="row">
			<a href="orderitem/add"class="text-end">Back to Order</a>
	<h3>Order: ${order.orderName}</h3>
			<div class="gray">
			
			<form:form action="/createOrderItem/${order.id}" method="POST" modelAttribute="orderItem">
		    <input type="hidden" name="_method" value="GET">
				<div>
					<input type="hidden" id="order" name="order" value="${order.id}">
					<input type="hidden" id="item" name="item" value="${item.id}">
					
					<form:label path="quantity">Quantity: </form:label><br>
					<form:input path="quantity"/>
					<form:errors path="quantity" class="text-danger"/>
				</div>
				<button class="btn btn-primary">Submit</button>
			</form:form>

	<table class="table">
				<thead>
					<tr>
					<th></th>
					<th></th>
					</tr>
				</thead>
				<tbody>
					<tr><td>Store: </td><td>${item.store}</td></tr>	
					<tr><td>Brand: </td><td>${item.brand}</td></tr>
					<tr><td>Description:</td><td>${item.description}</td></tr>	
					<tr><td>Unit: </td><td>${item.unit}</td></tr>	
					<tr><td>Size: </td><td>${item.size}</td></tr>	
					<tr><td>Price: </td><td>${item.price}</td></tr>
					<tr><td>Aisle: </td><td>${item.aisle}</td></tr>
				</tbody>
			</table>	
	
	 		</div>
		</div>
	</div>
</div>
</body>
</html>