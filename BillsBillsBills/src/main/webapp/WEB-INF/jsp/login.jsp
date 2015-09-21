<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign in</title>
</head>
<body>

<!-- 	<form method="POST" > -->
<!-- 		<input type="text" name="j_username" placeholder="Name" /><br />  -->
<!-- 		<input type="password" name="j_password" placeholder="Password" /><br /> -->
<!-- 		<input type="submit" value="Sign In" /> -->
<!-- 	</form> -->
	
	
	<form method="POST" action="<c:url value='/login' />">
		<input type="text" name="username" placeholder="Name"/><br/>
    	<input type="password" name="password" placeholder="Password"/><br/>
     	<input type="submit" value="Sign In"/>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
 	 </form>

</body>
</html>