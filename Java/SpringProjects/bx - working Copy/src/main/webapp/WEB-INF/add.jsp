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
<title>Show Tracker</title>
</head>
<body>
			
<div class="container">
	<h3 class="text-primary">Create a New TV Show</h3>
	<div class="row col-sm-8">
		<div class="gray">
		<form:form action="/createShow" method="POST" modelAttribute="show">
			<div>
				<form:label path="showName">Show Name: </form:label><br>
				<form:input path="showName"/>
				<form:errors path="showName" class="text-danger"/>
			</div>
			<div>
				<form:label path="network">Network: </form:label><br>
				<form:input path="network"/>
				<form:errors path="network" class="text-danger"/>
			</div>
			<div>
				<form:label path="description">Description: </form:label><br>
				<form:textarea path="description" class="form-control"/>
				<form:errors path="description" class="text-danger"/>
			</div>
			<button class="btn btn-success">Submit</button>
			<a href="/shows"class="btn btn-secondary">Cancel</a>
			</div>
		</form:form>	
	</div>
</div>
</body>
</html>