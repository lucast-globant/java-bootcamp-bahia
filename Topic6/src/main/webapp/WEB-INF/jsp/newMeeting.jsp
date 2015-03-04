<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create meeting</title>
</head>
<body>
	<div>
		<form:form action="add.htm" method="POST" modelAttribute="meeting">
		
			<span style="display: block;">
				<label for="desc">Meeting id:</label>
				<form:input path="id" />
		
			<span style="display: block;">
				<label for="desc">Meeting name:</label>
				<form:input path="desc" />

			
			<span style="display: block;">
				<input type="submit" value="Add" />
			</span>
			
		</form:form>
	</div>
</body>
</html>