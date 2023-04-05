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
<title>TV Show Database</title>
</head>
<body>
<div class = "container">
	<div class="col-sm-8">
	<h3 class="text-primary">Welcome, <c:out value="${loggedUser.userName}"></c:out>!</h3>
	<div class=row>
		<a href="/logout"class="text-end">logout</a>
	</div>
	<h4>TV Shows</h4> 
		<div class="row justify-content-md-center">
			
			<table class="table table-striped">
				<thead class="table-dark">
					<tr>
						<th>Show</th>
						<th>Network</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="show" items="${shows}">
					<tr>
        				<td><a href="/shows/${show.id}"><c:out value="${show.showName}"></c:out></a></td>
        				<td><c:out value="${show.network}"></c:out></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<p><a href="/shows/new" class="btn btn-primary">Add a Show</a></p>  
	</div>
</div>

</body>
</html>