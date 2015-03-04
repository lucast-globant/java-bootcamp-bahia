<%@ include file="include.jsp" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Hello</title>
	</head>
<body>
	<h1> Meetings page </h1>

	<c:if test="${showDate}">
		<fmt:formatDate value="${date}" pattern="yyyy-MM-dd"/>
	</c:if>
	<c:if test="!${showDate}">
		Don't show date
	</c:if>
<br/>
<a href="meeting/viewAll.htm">Meetings</a>
</body>
</html>