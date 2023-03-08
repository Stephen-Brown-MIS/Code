<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
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
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<div class="row">
	<h1>Create a New Book</h1>
	<div class="gray col-sm-6">
	<form:form action="/books" method="POST" modelAttribute="book">
		<div>
			<form:label path="title">Title: </form:label>
			<form:input path="title"/>
			<form:errors path="title"/>
		</div>
		<div>
			<form:label path="description">Description: </form:label>
			<form:input path="description"/>
			<form:errors path="description"/>
		</div>
		<div>
			<form:label path="language">Language: </form:label>
			<form:input path="language"/>
			<form:errors path="language"/>
		</div>
		<div>
			<form:label path="numberOfPages">Number of Pages: </form:label>
			<form:input path="numberOfPages" type="number"/>
			<form:errors path="numberOfPages"/>
		</div>
		<button>Submit</button>
		</div>
	</form:form>	
	</div>
</div>
</body>
</html>