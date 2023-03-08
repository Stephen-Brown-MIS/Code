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
<title>Insert title here</title>
</head>
<body>

<div class = "container">
	<h1>All Books</h1>
	<div class="col-sm-6">
		<div class="row justify-content-md-center">
			
			<table class="table table-striped">
				<thead class="table-dark">
					<tr>
						<th>ID</th>
						<th>Title</th>
						<th>Language</th>
						<th># Pages</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="book" items="${books}">
					<tr>
        				<td><c:out value="${book.id}"></c:out></td>
        				<td><a href="/books/${book.id}"><c:out value="${book.title}"></c:out></a></td>
        				<td><c:out value="${book.language}"></c:out></td>
        				<td><c:out value="${book.numberOfPages}"></c:out></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
<a href="/books/new">Create New Book</a>
</div>
</body>
</html>