<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/css/main.css"/>
<title>Index</title>
</head>
<body>
<h1>Send an Omikuji!</h1>
<div class=container>
	<form action="/omikuji/collect" method="POST">
		<label for="points">Pick any number from 5 to 25:</label>
		<input type="number" id="points" name="points" min="5" max="25"><br><br>
	
		<label for="city">Enter the name of any city</label><br><br>
	  	<input type="text" id="city" name="city"><br><br>
	  
	  	<label for="name">Enter the name of any real person:</label><br><br>
	 	<input type="text" id="name" name="name"><br><br>
	 	
	 	<label for="hobby">Enter professional endeavor or hobby:</label><br><br>
		<input type="text" id="hobby" name="hobby"><br><br>

	    <label for="thing">Enter any type of living thing:</label><br><br>
		<input type="text" id="thing" name="thing"><br><br>
	  	
	  	<label for="message">Say something nice to someone:</label><br><br>
	  	<textarea id="message" name="message" rows="4" cols="50"></textarea><br><br>
	  
	  	<input type="submit" value="Send">
	</form>
</div>
</body>
</html>