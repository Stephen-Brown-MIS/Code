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
<title>TV Show Database</title>
</head>
<body>

<div class="container">
	<h3 class="text-primary">${show.showName}</h3>
	<div class="col-sm-8">
		<div class="row">
	
			<div class="gray">
			<form:form action="/shows/${show.id}" method="POST" modelAttribute="show">
		    <input type="hidden" name="_method" value="PUT">
				<div>
					<form:label path="showName">Title: </form:label><br>
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
				<a href="/shows"class="btn btn-secondary">cancel</a>
				<button class="btn btn-success">submit</button>
			</form:form>	
			</div>
		</div>
		<form action="/shows/${show.id}" method="POST">
		<input type="hidden" name="_method" value="delete">
        <button type="submit" class="btn btn-danger">Delete Show</button>
		</form>
	</div>
</div>
</body>
</html>