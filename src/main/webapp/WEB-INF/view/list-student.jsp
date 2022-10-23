<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" 
integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"  crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>

<div class="container">
	<div class="jumbotron">
		<h1>Öğrenci Sistemine Hoşgeldiniz.</h1>
		<hr class="my-4">
		<p><a class="btn btn-primary btn-lg" onclick="window.location.href='showStudentForm'; return false;" type="button" role="button">Ogrenci Ekle</a></p>
		  
	</div>
	<div>
		<table class="table table-striped" >
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email Address</th>
				<th>Update/Delet</th>
			</tr>
			<c:forEach var = "tempStudent" items="${students}">
				<tr>
					<td>${tempStudent.firstName}</td>
					<td>${tempStudent.lastName}</td>
					<td>${tempStudent.email}</td>
					<td>
						<a class="btn btn-warning" href="${pageContext.request.contextPath}/student/showFormForUpdate?studentID=${tempStudent.id}">Update</a> 
						<a class="btn btn-danger" href="${pageContext.request.contextPath}/student/deleteStudent?studentID=${tempStudent.id}"
						onClick="if(!(confirm('Are you sure you want to delete this student ?'))) return false;">Delete</a>
					</td>
					
				</tr>
			</c:forEach>
		</table>
	</div>
</div>
	
</body>
</html>