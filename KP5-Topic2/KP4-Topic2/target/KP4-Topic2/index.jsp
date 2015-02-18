<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>
			A simple web application
		</title>
		
		<script language="javascript" type="text/javascript">
            function formulario(f){ 
                if(f.name.value==''){
                    alert('Please enter your name.');  
                    f.name.focus();
                    return false;}
                return true;} 
        </script>
	</head>
	<body>
		<h2>
			Hello!
		</h2>
		<form action="welcome.jsp" method="get" onsubmit="return formulario(this)">
  			Please enter your name: 
  			<input type="text" name="name" value="" />
 			<input type="submit" value="Send" />
		</form>
		
	</body>
</html>