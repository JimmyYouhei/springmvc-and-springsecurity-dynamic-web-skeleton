<%@ include file="parts/head.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="parts/header.jsp" %>
<title>show information from Course Form</title>
</head>

<body class="bg-secondary">

	<div class="container">
	
		<h1 class="text-info text-center font-weight-bold">Course Enrollment Form Detail</h1>
		<hr>
	
		<table class="table table-bordered table-dark">
			<thead>
				<tr>
					<th scope="col">Full Name</th>
					<th scope="col">Age</th>
					<th scope="col">Nation</th>
					<th scope="col">Courses enroll</th>
					<th scope="col">Languages</th>
				</tr>
			</thead>
		
			<tbody>
				<tr>
					<td scope="row">${student.fullName}</td>
					<td>${student.age}</td>
					<td>${student.nation}</td>
					<td>${student.printCourses()}</td>
					<td>${student.printLanguages()}</td>
					
				</tr>
			</tbody>
		
		</table>
	
	</div>
	
	<%@ include file ="parts/footer.jsp" %>

	
</body>
</html>

				
				