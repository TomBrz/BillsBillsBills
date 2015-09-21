<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>404 - Page Not Found</title>

<!-- Bootstrap Core CSS -->
<link
	href="${pageContext.servletContext.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link
	href="${pageContext.servletContext.contextPath}/resources/css/pageNotFound.css"
	rel="stylesheet">

</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="error-template">
					<h1>Oops!</h1>
					<h2>404 Not Found</h2>
					<div class="error-details">Sorry, an error has occured,
						Requested page not found!</div>
					<div class="error-actions">
						<a href="login.htm"
							class="btn btn-primary btn-lg"><span
							class="glyphicon glyphicon-home"></span> Take Me Home </a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>