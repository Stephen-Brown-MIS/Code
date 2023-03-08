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
	<h1>${book.title}</h1>
	<h4>Description: ${book.description}</h4>
	<h4>Language: ${book.language}</h4>
	<h4>Number of Pages: ${book.numberOfPages}</h4>
	</div>
</div>
</body>
</html>