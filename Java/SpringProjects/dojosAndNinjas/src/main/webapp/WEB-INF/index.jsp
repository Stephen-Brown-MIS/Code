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
<title>Dojos and Ninjas</title>
</head>
<body>
<div class = "container">
	<h1 class="text-primary">Welcome to the Dojos!</h1>
	
	<div class="col-sm-4">

			<a href="/dojos/new">Add a Dojo</a>
			<a href="/ninjas/new">Add a Ninja</a><br><br>

	</div>
	
	<div class="col-sm-6">
		<div class="row justify-content-md-center">
			
			<table class="table">
				<thead class="table-dark">
					<tr>
						
						<th>Dojo Name</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="dojo" items="${dojos}">
					<tr>
        				<td><a href="/dojos/${dojo.id}"><c:out value="${dojo.dojoName}"></c:out></a></td>
        				        				
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>

</body>
</html>