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
<title>Insert title here</title>
</head>
<body>
<div class="container">
<div class="row">
<h1 class="text-primary"><c:out value="${dojo.dojoName}"/> Location Ninjas</h1>
	<div>
	<a href="/ninjas/new">Add a Ninja</a>
	<a href="/">Return to Dashboard</a><br><br>
	</div>

<table class="table table-striped">
    <thead class="table-dark">
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
            
        </tr>
    </thead>
    <tbody>
        <c:forEach var="ninja" items="${dojo.ninjas}">
        	<tr>
            	<td><c:out value="${ninja.firstName}"/></td>
	            <td><c:out value="${ninja.lastName}"/></td>
    	        <td><c:out value="${ninja.age}"/></td>
        	</tr>
		</c:forEach>	
    </tbody>
</table>

</div>
</div>
</body>
</html>