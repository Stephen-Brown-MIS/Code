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
<title>New License</title>
</head>
<body>
<div class="container">
	<div class="row">
	<h3 class="text-primary">New License</h3>
	<div class="gray col-sm-6">
	<form:form action="/createLicense" method="POST" modelAttribute="license" class="form1">
		<div>
			<form:label path="person">Person: </form:label><br>
			<form:select path="person">
        		<c:forEach var="onePerson" items="${persons}">
            	<!--- Each option VALUE is the id of the person --->
            		<form:option value="${onePerson.id}" path="person">
            	<!--- This is what shows to the user as the option --->
                	<c:out value="${onePerson.personFirstName}"/>
                	<c:out value="${onePerson.personLastName}"/>
            		</form:option>
        		</c:forEach>
    		</form:select>
			<form:errors path="person" class="text-danger"/>
		</div>
		<div>
			<form:label path="licenseState">State: </form:label><br>
			<form:input path="licenseState"/>
			<form:errors path="licenseState" class="text-danger"/>
		</div>
		<div>
			<form:label path="licenseExpireDate">Exp Date: </form:label><br>
			<form:input path="licenseExpireDate" type="date"/>
			<form:errors path="licenseExpireDate" class="text-danger"/>
		</div>
		
		<button class="button1">Submit</button>
		</div>
	</form:form>	
	</div>
</div>

</body>
</html>