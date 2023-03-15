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
			
<div class="container">
	<div class="row col-sm-6">
	<h3 class="text-primary">Add a Book to Your Shelf!</h3>
	
				<a href="/books"class="text-end">back to the shelves</a>
	<div class="gray">
	<form:form action="/createBook" method="POST" modelAttribute="book">
		<div>
			<form:label path="bookName">Book Name: </form:label><br>
			<form:input path="bookName"/>
			<form:errors path="bookName" class="text-danger"/>
		</div>
		<div>
			<form:label path="authorName">Author Name: </form:label><br>
			<form:input path="authorName"/>
			<form:errors path="authorName" class="text-danger"/>
		</div>
		<div>
			<form:label path="postedBy">Posted By: </form:label><br>
			<form:input path="postedBy" />
			<form:errors path="postedBy" class="text-danger"/>
		</div>
		<div>
			<form:label path="notes">Notes: </form:label><br>
			<form:textarea path="notes" class="form-control"/>
			<form:errors path="notes" class="text-danger"/>
		</div>
		<button class="button2">Submit</button>
		</div>
	</form:form>	
	</div>
</div>
</body>
</html>