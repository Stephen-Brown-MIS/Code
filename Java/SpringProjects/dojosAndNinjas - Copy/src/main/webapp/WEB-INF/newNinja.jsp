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
<title>New Ninja</title>
</head>
<body>
<div class="container">
	<div class="row">
	<h3 class="text-primary">New Ninja</h3>
	<div class="gray col-sm-6">
	<form:form action="/createNinja" method="POST" modelAttribute="ninja" class="form1">
		<div>
			<form:label path="dojo">Dojo: </form:label><br>
			<form:select path="dojo">
        		<c:forEach var="oneDojo" items="${dojos}">
            	<!--- Each option VALUE is the id of the dojo --->
            		<form:option value="${oneDojo.id}" path="dojo">
            	<!--- This is what shows to the user as the option --->
                	<c:out value="${oneDojo.dojoName}"/>
            		</form:option>
        		</c:forEach>
    		</form:select>
			<form:errors path="dojo" class="text-danger"/>
		</div>
		<div>
			<form:label path="firstName">First Name: </form:label><br>
			<form:input path="firstName"/>
			<form:errors path="firstName" class="text-danger"/>
		</div>
		<div>
			<form:label path="lastName">Last Name: </form:label><br>
			<form:input path="lastName"/>
			<form:errors path="lastName" class="text-danger"/>
		</div>
		<div>
			<form:label path="age">Age: </form:label><br>
			<form:input path="age" type="number"/>
			<form:errors path="age" class="text-danger"/>
		</div>
		
		<button class="button1">Submit</button>
		</div>
	</form:form>	
	</div>
</div>

</body>
</html>