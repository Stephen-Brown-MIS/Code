<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/css/main.css"/>
<title>Omikuji Show</title>
</head>
<body>
<h1>Here's Your Omikuji!</h1>
<div class=container2>
	<h2 class=blue>In <c:out value="${points}"/> months, you will live in
	<c:out value="${city}"/> with 
	<c:out value="${name}"/> as yor roomate,
	<c:out value="${hobby}"/> for a living. The next time you see a
	<c:out value="${thing}"/> you will have good luck. Also,
	<c:out value="${message}"/></h2>
</div>
<p><a href="/omikuji/">Go Back</a></p>
</body>
</html>