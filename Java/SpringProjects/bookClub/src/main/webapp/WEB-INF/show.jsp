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
	<div class="row">
		<div class="col-sm-8">
			<h1 class="text-success"><em>${book.bookName}</em></h1>
			<div class=row>
				<a href="/books"class="text-end">back to the shelves</a>
			</div>
	
			<h4><span class="text-danger">${book.postedBy}</span> 
			read <span class="text-info">${book.bookName}</span>
			by <span class="text-success">${book.authorName}</span></h4>
			<div class="outline">
				<h6>Here are ${book.postedBy}'s thoughts:</h6>
				<p><em>${book.notes}</em></p>
			</div>
		</div><br><br>
	</div>
	<button href="/edit/${book.id}" class="button2">edit</button>
</div>
</body>
</html>