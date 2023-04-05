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
<title>TV Show Database</title>
</head>
<body>
<div class="container">
	<h3 class="text-primary">${show.showName}</h3>
	<div class="row">
		<div class="col-sm-8">
			<div class=row>
				<a href="/shows"class="text-end">Back to Dashboard</a>
			</div>
			
			<table class="table noborder">
				<thead>
					<tr>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<tr>
        				<td><h5>Posted By:</h5></td>
        				<td><h5>${show.postedBy.userName}</h5></td>
					</tr>
					<tr>
        				<td>Network:</td>
        				<td>${show.network}</td>
					</tr>
					<tr>
        				<td>Description:</td>
        				<td>${show.description}</td>
					</tr>
				</tbody>
			</table>
	
			</div>
			<c:if test="${loggedUser.userName == show.postedBy.userName}">
				<form action="edit/${show.id}">
				<button type="submit" class="btn btn-primary">edit</button>
				</form>
				
			</c:if>	
		</div><br><br>
	</div>
</body>
</html>