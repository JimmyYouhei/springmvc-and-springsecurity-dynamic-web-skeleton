<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<%@ include file="parts/header.jsp" %>

<title>Login Page</title>
</head>
<body>


<div class="container">
	<h1>Login Page</h1>
	<hr>
	<form:form action="${pageContext.request.contextPath}/authenticateUser" method="post">
	
	
	<c:if test="${param.error != null}">
		<p>Username or password or both are incorrect please check</p>
	</c:if>
	
	<c:if test="${param.logout != null}">
		<p>You have been logout</p>
	</c:if>

		<table>
			<tbody>
				<tr>
					<td scope="row"><label>Username:</label></td>
					<td><input type="text" name="username"/></td>
				</tr>
				
				<tr>
					<td scope="row"><label>Password:</label></td>
					<td><input type="password" name="password"/></td>
				</tr>
				
				<tr>
					<td scope="row"></td>
					<td><input type="submit" value="check"></td>
				</tr>
			</tbody>	
		</table>
	</form:form>
	
</div>
</body>
</html>