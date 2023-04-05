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
<title>Register</title>
</head>
<body>
     <form action="#" th:action="@{/register}" th:object="${userEntity}" method="post">
            <table>
                <tr>
                    <td><label for="firstName">First Name</label></td>
                    <td><input th:field="*{firstName}" type="text" name="firstName"></input></td>
                </tr>
                <tr>
                    <td><label for="lastName">Last Name</label></td>
                    <td><input th:field="*{lastName}" type="text" name="lastName"></input></td>
                </tr>
                <tr>
                    <td><label for="emailId">Email</label></td>
                    <td><input th:field="*{emailId}" type="text" name="emailId"></input></td>
                </tr>
                <tr>
                    <td><label for="password">Password</label></td>
                    <td><input th:field="*{password}" type="password" name="password"></input></td>
                </tr>
                <tr>
                    <td><input type="reset" value="Clear"/></td>
                    <td><input type="submit" value="Submit"></input></td>
                </tr>
            </table>
        </form>
</body>
</html>