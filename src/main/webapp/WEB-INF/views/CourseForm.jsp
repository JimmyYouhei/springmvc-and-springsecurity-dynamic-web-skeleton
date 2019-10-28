<%@ include file="parts/head.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<%@ include file="parts/header.jsp" %>
<title>Course Form Page</title>
</head>
<body class="bg-secondary">

<div class="container">
	<h1 class="text-info text-center font-weight-bold">Course Form Page</h1>
	<hr>
	
	<form:form action="${pageContext.request.contextPath}/admin/processForm" method="post" modelAttribute="student">
		<table class="table table-bordered table-dark">
			<tbody>
			
				<tr>
					<td scope="row"><label>Full Name</label></td>
					<td><form:input path="fullName"/></td>
					
					<td><form:errors path="fullName"/></td>
					
				</tr>
				
				<tr>
					<td scope="row"><label>Age</label></td>
					<td><form:input path="age"/></td>
					<td><form:errors path="age"/></td>
				</tr>
				
				<tr>
					<td scope="row"><label>Nation</label></td>
					<td>
						<form:select  path="nation">
							<form:option value="" label=""/>
							<form:options items="${nations}"/>
						</form:select>
					</td>
					
						<td><form:errors path="nation"/></td>
						
				</tr>
				
				<tr>
					<td scope="row"><label>Courses</label></td>
					<td>
						<form:select  path="courses" multiple="true">
							<form:options items="${courses}"/>
						</form:select>
					</td>
						<td><form:errors path="courses"/></td>
						
				</tr>
				
				<tr>
					<td scope="row"><label>Language</label></td>
					<td>
						<form:checkboxes items="${languages}" path="languages"/>
					</td>
						<td><form:errors path="languages"/></td>
						
				</tr>
				
				
				<tr>
					<td>
						<button type="submit">Submit</button>
					</td>
					
					<td>
						<a href="${pageContext.request.contextPath}/"><button type="button" >Back</button></a>
					</td>
				</tr>
				
			</tbody>
		</table>
		
	</form:form>

	
</div>

</body>
</html>