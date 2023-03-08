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
<title>Ninja Gold Game</title>
</head><body>
<div class="row">
	<div class="col"></div>

	<div class="col">
		<h5>Your Gold: <c:out value="${gold}"/></h5>
	</div>
	
</div>



<div class="row">
		<div class="col">
		<div class="container">
 			<form action="/farm" method="POST">
			<h6>Farm</h6>
			<label for="farm">(earns 10-20 gold)</label><br><br>
			<input type="submit" name="farm" value="Find Gold">
		</form>
		</div>	
		</div>	
		
		<div class="col">
		<div class="container">
		<form action="/cave" method="POST">
			<h6>Cave</h6>
			<label for="cave">(earns 5-10 gold)</label><br><br>
			<input type="submit" name="cave" value="Find Gold">
		</form>
		</div>
		</div>
	
		<div class="col">
		<div class="container">
		<form action="/house" method="POST">
			<h6>House</h6>	  
		  	<label for="house">(earns 2-5 gold)</label><br><br>
			<input type="submit" name="house" value="Find Gold">
		</form>
		</div>
		</div>
	
		<div class="col">
		<div class="container">
		<form action="/quest" method="POST">
			<h6>Quest</h6>
		 	<label for="quest">(earns 0-50 gold)</label><br><br>
			<input type="submit" name="quest" value="Find Gold">
		</form>
		</div>
		</div>

</div>

<h5>Activites:</h5>
<iframe src="/activities" title="Activities Iframe"></iframe>
</body>
</html>