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
<title>Burger Tracker</title>
</head>
<body>
<div class = "container">
	<h3 class="text-primary">Burger Tracker</h3>
	<div class="col-sm-6">
		<div class="row justify-content-md-center">
			
			<table class="table table-striped">
				<thead class="table-dark">
					<tr>
						
						<th>Burger Name</th>
						<th>Restaurant Name</th>
						<th>Rating (out of 5)</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="burger" items="${burgers}">
					<tr>
        				<td><c:out value="${burger.burgerName}"></c:out></td>
        				<td><c:out value="${burger.restaurantName}"></c:out></td>
        				<td><c:out value="${burger.rating}"></c:out></td>
        				<td><a href="/burgers/edit/${burger.id}">edit</a></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
<div class="container">
	<div class="row">
	<h3 class="text-primary">Add a Burger</h3>
	<div class="gray col-sm-6">
	<form:form action="/createBurger" method="POST" modelAttribute="burger">
		<div>
			<form:label path="burgerName">Burger Name: </form:label><br>
			<form:input path="burgerName"/>
			<form:errors path="burgerName" class="text-danger"/>
		</div>
		<div>
			<form:label path="restaurantName">Restaurant Name: </form:label><br>
			<form:input path="restaurantName"/>
			<form:errors path="restaurantName" class="text-danger"/>
		</div>
		<div>
			<form:label path="rating">Rating: </form:label><br>
			<form:input path="rating" type="number" min="1" max="5"/>
			<form:errors path="rating" class="text-danger"/>
		</div>
		<div>
			<form:label path="notes">Notes: </form:label><br>
			<form:input path="notes" type="text" size="50"/>
			<form:errors path="notes" class="text-danger"/>
		</div>
		<button>Submit</button>
		</div>
	</form:form>	
	</div>
</div>
</body>
</html>