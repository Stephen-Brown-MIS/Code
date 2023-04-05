<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
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
<title>Edit Book</title>
</head>
<body>

<div class="container">
	<h3 class="text-primary">Change your Entry</h3>
	<div class="col-sm-8">
		<div class="row">
			<a href="/books"class="text-end">back to the shelves</a>
	
			<div class="gray">
			<form:form action="/books/${book.id}" method="POST" modelAttribute="book">
		    <input type="hidden" name="_method" value="PUT">
				<div>
					<form:label path="bookName">Title: </form:label><br>
					<form:input path="bookName"/>
					<form:errors path="bookName" class="text-danger"/>
				</div>
				<div>
					<form:label path="authorName">Author Name: </form:label><br>
					<form:input path="authorName"/>
					<form:errors path="authorName" class="text-danger"/>
				</div>
				<div>
					<form:label path="notes">Notes: </form:label><br>
					<form:textarea path="notes" class="form-control"/>
					<form:errors path="notes" class="text-danger"/>
				</div>
				<button class="button2">Submit</button>
			</form:form>	
			</div>
		</div>
	</div>
</div>
</body>
</html>