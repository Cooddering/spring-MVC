<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ taglib prefix="form" uri ="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" 
integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<div class="jumbotron">
			<h1>Add New Student</h1>
		</div>
			<form:form class="form-horizantal" modelAttribute="student" action="saveStudent" method="POST">
			<form:hidden path="id"/>
				<div class="form-group">
					<label for="adi" class="col-sm-10 control-label"> Ogrenci Adi</label>
					<div>
						<form:input type="text" class="form-control" id="adi" placeholder="Adi" path="firstName"></form:input>
					</div>
				</div>
				<div class="form-group">
					<label for="adi" class="col-sm-10 control-label"> Ogrenci Soyadi</label>
					<div>
						<form:input type="text" class="form-control" id="soyadi" placeholder="Soyadi" path="lastName"></form:input>
					</div>
				</div>
				<div class="form-group">
					<label for="adi" class="col-sm-10 control-label"> Ogrenci Email</label>
					<div>
						<form:input type="text" class="form-control" id="email" placeholder="Email" path="email"></form:input>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-10">
						<button type="submit" class="btn btn-primary">Kaydet</button>
					</div>
				</div>
			</form:form>
		<div>
		<br>
		<p>
			<a href="${pageContext.request.contextPath}/student/list"Ögrenci Sayfasına Geri Git></a>
		</p>
			<h1>Add New Student</h1>
		</div>
	</div>

	
</body>
</html>