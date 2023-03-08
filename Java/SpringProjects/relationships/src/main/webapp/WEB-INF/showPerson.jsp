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
<h1>Person Details: </h1>
<table class="table">
    <thead class="thead-dark">
        <tr>
            <th>Name</th>
            <th>License Number</th>
            <th>State</th>
            <th>Exp Date</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>
                <c:out value="${person.personFirstName}"/>
                <c:out value="${person.personLastName}"/>
            </td>
        	<c:forEach var="license" items="${licenses}">
            	<td><c:out value="${person.license.number}"/></td>
	            <td><c:out value="${person.license.state}"/></td>
    	        <td>
        	        <c:out value="${person.license.expirationDate}"/>
            	</td>
            </c:forEach>	
        </tr>
    </tbody>
</table>
</div>
</div>
</body>
</html>