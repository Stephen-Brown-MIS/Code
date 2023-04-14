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
	<h4 class="text-primary">${item.description}</h4>
	<div class="row">
		<div class="col-sm-8">
			<div class=row>
				<a href="/items"class="text-end">Back to Inventory</a>
			</div>
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
					<tr><td>Description: </td><td>${item.description}</td></tr>	
					<tr><td>Unit: </td><td>${item.unit}</td></tr>	
					<tr><td>Size: </td><td>${item.size}</td></tr>	
					<tr><td>Price: </td><td>${item.price}</td></tr>
					<tr><td>Aisle: </td><td>${item.aisle}</td></tr>
				</tbody>
			</table>	
		</div><br><br>
	</div>
				
	
		<form action="edit/${item.id}">
		<button type="submit" class="btn btn-primary">edit</button>
		</form>
		
		<form action="/items/${item.id}" method="POST">
		<input type="hidden" name="_method" value="delete">
        <button type="submit" class="btn btn-danger">delete</button>
		</form>
	
</div>
</body>
</html>