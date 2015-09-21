<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index jsp</title>
<link
	href="${pageContext.servletContext.contextPath}/resources/css/normalize.css"
	type="text/css" rel="stylesheet" />
<link
	href="${pageContext.servletContext.contextPath}/resources/css/index.css"
	type="text/css" rel="stylesheet" />
<link
	href="${pageContext.servletContext.contextPath}/resources/css/bootstrap.min.css"
	type="text/css" rel="stylesheet" />
</head>
<body>

	<div id="wrapper" class="container-fluid">
		<header>
			<div class="navbar-brand">BillsBillsBills</div>

			<h2>&copy; Seppe en Tom - Eindproject</h2>
			<br> <br>

			<form class="form-horizontal" action="<c:url value='/login' />"
				method="POST">
				<div class="form-group">
					<label for="username" class="col-sm-2 control-label">username</label>
					<div class="col-sm-8">
						<input type="text" id="username" class="form-control"
							placeholder="enter your username" name="username">
					</div>
				</div>
				<br>
				<div class="form-group">
					<label for="password" class="col-sm-2 control-label">password</label>
					<div class="col-sm-8">
						<input type="password" id="password" class="form-control"
							placeholder="enter your password" name="password" />
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-8">
						<div class="checkbox">
							<label> <input type="checkbox"> Remember me
							</label>
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-8">
						<input type="submit" class="btn btn-primary" value="Sign in" /><br />
						<p>
							not a user yet? <span id="create_account"><a
								href="new_user.htm">create an account </a></span>here
						</p>
					</div>
				</div>
			</form>


			<section id="image_part">
				<div id="explanation">
					<p>Handle your business with ease</p>
				</div>
				<img src="resources/images/opening.jpg" />
			</section>
</body>
</html>
