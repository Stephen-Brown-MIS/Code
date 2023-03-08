<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current visit count</title>
</head>
<body>
<h3>You have visited <a href="/your_server">http://your_server </a><c:out value="${count}"/> times</h3>

<p><a href="/your_server">Test another visit?</a></p>

<p><a href="/your_server/reset">Reset</a></p>

</body>
</html>