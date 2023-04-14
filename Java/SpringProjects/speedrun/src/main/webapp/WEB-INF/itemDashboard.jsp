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
<title>item Club</title>
</head>
<body>
<div class = "container">
	<div class="col-sm-8">
	<h3 class="text-primary">Welcome, <c:out value="${loggedUser.userName}"></c:out>!</h3>
	<div class=row>
		<a href="/logout"class="text-end">logout</a>
		<a href="/items/new" class="text-end">+ Add to my shelf!</a>  
	</div>
	<h4>Inventory</h4> 
		<div class="row justify-content-md-center">
		
		<div>
			<form>
				Filter:
				<input type="text" name="keyword"/> 
				<input type="submit" value="Search" class="btn btn-primary"/> 
				<input type="button" value="Clear" class="btn btn-primary" onclick="clearFilter"/> 
			</form>

		</div>	
			<table class="table table-striped">
				<thead class="table-dark">
					<tr>
						<th>Item</th>
						<th>Description</th>
						<th>Store</th>
						<th>Brand</th>
						<th>Unit</th>
						<th>Size</th>
						<th>Price</th>
						<th>Aisle</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${items}">
					<tr>
        				<td><c:out value="${item.id}"></c:out></td>
        				<td><a href="/items/${item.id}"><c:out value="${item.description}"></c:out></a></td>
        				<td><c:out value="${item.store}"></c:out></td>
        				<td><c:out value="${item.brand}"></c:out></td>
        				<td><c:out value="${item.unit}"></c:out></td>
        				<td><c:out value="${item.size}"></c:out></td>
        				<td><c:out value="${item.price}"></c:out></td>
        				<td><c:out value="${item.aisle}"></c:out></td>
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