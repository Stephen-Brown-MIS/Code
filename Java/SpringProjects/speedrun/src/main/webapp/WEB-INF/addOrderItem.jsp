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
<title>Speedrun Add Order Item</title>
</head>
<body>
<div class = "container">
	<div class="col-sm-8">
	<h3 class="text-primary">Welcome, <c:out value="${loggedUser.userName}"></c:out>!</h3>
		<div class=row>
			<a href="/logout" class="text-end">logout</a>
			<a href="/orders/${order.id}" class="text-end">Back</a>  
		</div>
		<div class="row">
		<h5>Choose items to add to your list</h5> 
				<form class="text-end">
					Filter:
					<input type="text" name="keyword"/> 
					<input type="submit" value="Search" class=""/> 
					<input type="button" value="Clear" class="" onclick="clearFilter"/> 
				</form>
				
		</div>	
		<br>
			<table class="table table-striped">
				<thead class="table-dark">
					<tr>
						
						<th>Store</th>
						<th>Description</th>
						<th>Brand</th>
						<th>Unit</th>
						<th>Size</th>
						<th>Action</th>				
							
					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${items}">
					<tr>
        				
        				<td><c:out value="${item.store}"></c:out></td>
        				<td><c:out value="${item.description}"></c:out></td>
        				<td><c:out value="${item.brand}"></c:out></td>
        				<td><c:out value="${item.unit}"></c:out></td>
        				<td><c:out value="${item.size}"></c:out></td>
        				<td><form action="/order/${order.id}/addItem/${item.id}" method="GET" modelAttribute="order_item">
        					<input type="hidden" name="method" value="PUT">
        					<button class="white">
        						<svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" fill="currentColor" class="bi bi-plus-circle text-success" viewBox="0 0 16 16">
  								<path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
  								<path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"/>
								</svg>
							</button>
        					</form>
        				</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
	</div>
</div>
<script type="text/javascript">
	function clearFilter() {
		window.location = '/items';
	}
</script>
</body>
</html>