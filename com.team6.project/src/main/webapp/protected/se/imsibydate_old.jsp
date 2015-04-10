<!DOCTYPE html>
<html lang="en" ng-app>

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Red Hot Chilli Beans</title>

<!-- Adding CSS -->
<link href="${pageContext.request.contextPath}/css/sb-admin-2.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/bootstrap-combined.min.cristiana.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/dataTables.bootstrap.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/dataTables.responsive.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/se.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" media="screen"
href="${pageContext.request.contextPath}/css/bootstrap-datetimepicker.min.css">

<!-- Adding functions -->
<script src="${pageContext.request.contextPath}/js/basedata.js"></script>
<script src="${pageContext.request.contextPath}/js/common.js"></script>
<script src="${pageContext.request.contextPath}/js/angular.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<!-- jQuery -->
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript"
src="${pageContext.request.contextPath}/js/bootstrap-datetimepicker.min.js">
</script>



<script type="text/javascript">
	function startup() {
		loadbar('../sidebar.jsp');

	}
</script>
</head>

<body onload="startup()">

	<div id="wrapper" ng-app="App" ng-controller="readDates">

		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0" id="navigation"></nav>

		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">Search IMSI failures by date</h1>



					<div id="pickerarea">
						<div id="datetimepickerbox" class="input-append date">
							<input type="text" ng-model="firstDate"></input>
						</div>

						<div id="datetimepickerbox" class="input-append date">
							<input type="text" ng-model="secondDate"></input>
						</div>

						<button ng-click='sayHello(firstDate,secondDate)'>search</button>
												<p id="errormess"></p>

					</div>
					<!--  <h1>IMSIs</h1>-->
					<h3>IMSIs</h3>
					<div class="panel-body">
						<div class="dataTable_wrapper scrollableContainer">

							<div class="scrollingArea">

								<table class="table table-striped table-bordered table-hover"
									id="dataTables-example">
									<thead>
										<tr>
											<th></th>
										</tr>
									</thead>
									<tbody>
										<tr class="odd gradeA" ng-repeat="x in baseDataDate">
											<td><div class="imsi">{{x}}</div></td>

										</tr>
									</tbody>
								</table>

							</div>
							<div id="errorDiv">
								<table class="table table-striped table-bordered table-hover"
									id="failureDurationTable">
								</table>
							</div>
							<!-- /.table-responsive -->
						</div>
					</div>
					<!-- /.panel-body -->
				</div>




			</div>

		</div>


	</div>
	<!-- /#wrapper -->




	</script>

</body>

</html>