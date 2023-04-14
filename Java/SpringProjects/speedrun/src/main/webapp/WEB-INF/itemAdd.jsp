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
<title>item Tracker</title>
</head>
<body>
			
<div class="container">
	<h3 class="text-primary">Add an Item to Inventory</h3>
	<div class="row col-sm-8">
		<a href="/items"class="text-end">back to the shelves</a>
		<div class="gray">
		<form:form action="/createitem" method="POST" modelAttribute="item">
			<div>
				<form:label path="store">Store: </form:label><br>
				<form:input path="store"/>
				<form:errors path="store" class="text-danger"/>
			</div>
			<div>
				<form:label path="brand">Brand: </form:label><br>
				<form:input path="brand"/>
				<form:errors path="brand" class="text-danger"/>
			</div>
			<div>
				<form:label path="description">Description: </form:label><br>
				<form:input path="description"/>
				<form:errors path="description" class="text-danger"/>
			</div>
			<div>
				<form:label path="unit">Unit: </form:label><br>
				<form:input path="unit" class="form-control"/>
				<form:errors path="unit" class="text-danger"/>
			</div>
			<div>
				<form:label path="size">Size: </form:label><br>
				<form:input path="size" class="form-control"/>
				<form:errors path="size" class="text-danger"/>
			</div>
			<div>
				<form:label path="price">Price: </form:label><br>
				<form:input path="price" class="form-control"/>
				<form:errors path="price" class="text-danger"/>
			</div>
			
			<div>
				<form:label path="aisle">Aisle: </form:label><br>
				<form:input path="aisle" class="form-control"/>
				<form:errors path="aisle" class="text-danger"/>
			</div>
			<button class="button2">Submit</button>
			</div>
		</form:form>	
	</div>
</div>
</body>
</html>