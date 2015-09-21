<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>SB Admin - Bootstrap Admin Template</title>

<!-- Bootstrap Core CSS -->
<link
	href="${pageContext.servletContext.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link
	href="${pageContext.servletContext.contextPath}/resources/css/sb-admin.css"
	rel="stylesheet">

<!-- Morris Charts CSS -->
<link
	href="${pageContext.servletContext.contextPath}/resources/css/plugins/morris.css"
	rel="stylesheet">

<!-- Custom Fonts -->
<link
	href="${pageContext.servletContext.contextPath}/resources/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link href="${pageContext.servletContext.contextPath}/resources/css/modal.css" rel="stylesheet" type="text/css"/>
<%-- 	<link
	href="${pageContext.servletContext.contextPath}/resources/css/StatsPage.css"
	rel="stylesheet" type="text/css" /> --%>
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css" rel="stylesheet" type="text/css"/> 

</head>

<body>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-ex1-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.html">BillsBillsBills</a>
			</div>
			<!-- Top Menu Items -->
			<ul class="nav navbar-right top-nav">


				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><i class="fa fa-user"></i> ${username} <b
						class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#"><i class="fa fa-fw fa-user"></i> Profile</a>
						</li>

						<li><a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a>
						</li>
						<li class="divider"></li>
						<li><a href="#"><i class="fa fa-fw fa-power-off"></i> Log
								Out</a></li>
					</ul></li>
			</ul>
			<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav navbar-nav side-nav">

					<li><a href="stats.htm"><i class="fa fa-fw fa-bar-chart-o"></i>
							My Stats</a></li>

					<li class="active"><a href="invoices.htm"><i
							class="fa fa-fw fa-edit"></i> Invoices</a></li>
					<li><a href="bills.htm"><i class="fa fa-fw fa-file"></i>
							Bills</a></li>


				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</nav>

		<div id="page-wrapper" style="min-height: 100em">

			<div class="container-fluid">

				<!-- Page Heading -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">
							My Stats Page <small></small>
						</h1>

					</div>
				</div>
				<!-- /.row -->

				<div class="row">
					<div class="col-lg-12">
						<div class="alert alert-info alert-dismissable">
							<button type="button" class="close" data-dismiss="alert"
								aria-hidden="true">&times;</button>
							<i class="fa fa-info-circle"></i> <strong>Alert- dont
								forget to pay your vat</strong> don't <a
								href="http://startbootstrap.com/template-overviews/sb-admin-2"
								class="alert-link">VAT-payments</a>
						</div>
					</div>
				</div>


				<div class="row">

					<div class="col-lg-12">
						<div class="panel panel-default">
							<div class="panel-heading">
								<h3 class="panel-title">
									<i class="fa fa-money fa-fw"></i> Your invoices
								</h3>
							</div>
							<div class="panel-body">
								<div class="table-responsive">

									<button type="button" class="btn btn-warning"
										data-toggle="modal" data-target="#myModal"
										style="margin-top: 1em; margin-bottom: 1em;">Add an
										invoice</button>

									<table class="table table-bordered table-hover table-striped">
										<thead>
											<tr>
												<th>Invoice number</th>
												<th>Date</th>
												<th>Client</th>
												<th>amount</th>
												<th>file</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>3326</td>
												<td>10/21/2013</td>
												<td>3:29 PM</td>
												<td>$321.33</td>
												<td>url</td>
											</tr>

										</tbody>
									</table>
								</div>
								<div class="text-right">
									<a href="#">View All Transactions <i
										class="fa fa-arrow-circle-right"></i></a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- /.row -->
				<!-- Modal -->
				<div id="myModal" class="modal fade" role="dialog">
					<div class="modal-dialog">

						<!-- Modal content-->
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">&times;</button>
								<h4 class="modal-title">Add a new invoice</h4>
							</div>
							<div class="modal-body">
								<form>
								<fieldset>
								<label for="invoice_number">invoice number</label><input id="invoice_number" type="text"/>
								<br> 
								<label for="client">Client:</label><input id="client" type="text"/>
								<br>
								<label for="amount">Amount:</label><input id="amount" type="number" step="0.01"/>
								<br>
								<label for="datepicker">date:</label><input id="datepicker"/>
								<br>
								<br>
								<input type="submit" value="submit" class="btn btn-primary"/>
								
								<button type="button" class="btn btn-default"
									data-dismiss="modal">Cancel</button>
								</fieldset>
								</form>
							</div>
							<div class="modal-footer">
								
							</div>
						</div>

					</div>
				</div>

			</div>
			<!-- /.container-fluid -->

		</div>
		<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script
		src="${pageContext.servletContext.contextPath}/resources/js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script
		src="${pageContext.servletContext.contextPath}/resources/js/bootstrap.min.js"></script>

	<!-- Morris Charts JavaScript -->
	<script
		src="${pageContext.servletContext.contextPath}/resources/js/plugins/morris/raphael.min.js"></script>
	<script
		src="${pageContext.servletContext.contextPath}/resources/js/plugins/morris/morris.min.js"></script>
	<script
		src="${pageContext.servletContext.contextPath}/resources/js/plugins/morris/morris-data.js"></script>
		<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script> 
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"></script> <script> $(document).ready(function() { $("#datepicker").datepicker(); }); </script>

</body>

</html>




</body>
</html>