<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>
			A simple web application
		</title>
	</head>
	<body>
		<%String name = request.getParameter("name");%>
		<h2>
			Welcome <%=name%>!<br>
			Have a nice day.
		</h2>
	</body>
</html>