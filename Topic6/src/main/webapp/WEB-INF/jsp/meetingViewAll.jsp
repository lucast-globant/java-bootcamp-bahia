<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ include file="include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View All Meetings</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>
					Meetings:
				</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${meetings}" var="meeting">
				<tr>
					<td> 
						${meeting.desc}

					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="new.htm">Add a new meeting</a>
	<br> </br>
	<a href="del.htm">Remove a meeting</a>
</body>
</html>