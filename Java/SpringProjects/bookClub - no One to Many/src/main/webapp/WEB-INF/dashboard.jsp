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
<title>Book Tracker</title>
</head>
<body>
<div class = "container">
	<div class="col-sm-8">
	<h1 class="text-primary">Welcome, <c:out value="${loggedUser.userName}"></c:out>!</h1>
	<div class=row>
		<a href="/logout"class="text-end">logout</a>
		<a href="/books/new" class="text-end">+ Add to my shelf!</a>  
	</div>
	<h4>Books from everyone's shelves</h4> 
		<div class="row justify-content-md-center">
			
			<table class="table table-striped">
				<thead class="table-dark">
					<tr>
						<th>ID</th>
						<th>Title</th>
						<th>Author Name</th>
						<th>Posted By</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="book" items="${books}">
					<tr>
        				<td><c:out value="${book.id}"></c:out></td>
        				<td><a href="/books/${book.id}"><c:out value="${book.bookName}"></c:out></a></td>
        				<td><c:out value="${book.authorName}"></c:out></td>
        				<td><c:out value="${book.postedBy}"></c:out></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>

</body>
</html>