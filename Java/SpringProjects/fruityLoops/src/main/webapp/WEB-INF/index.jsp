<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/main.css"/>
	<!-- For any Bootstrap that uses JS -->
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<title>Fruity Loops</title>
</head>
<body>
	<h1>Fruit Store</h1>
	<div class="col-md-6">
	<div class = "container">
		<div class="row justify-content-md-center">
			
			<table class="table">
				<thead>
					<tr>
						<th>Name</th>
						<th>Price</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="oneFruit" items="${myFruitList}">
					<tr>
        				<td><c:out value="${oneFruit.name}"></c:out></td>
        				<td><c:out value="${oneFruit.price}"></c:out></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
	</div>
</div>
</div>
</body>
</html>