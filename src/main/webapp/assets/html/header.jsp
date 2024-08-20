<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<jsp:include page="head.jsp"></jsp:include>
<body>
	<header>
		<nav class="navbar   border-bottom border-body navbar-expand-lg"
			data-bs-theme="dark" style="background-color:#000000;">
			<div class="container-fluid">
				<a class="navbar-brand" href="./">StartUp</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarNav"
					aria-controls="navbarNav" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarNav">
					<ul class="navbar-nav ms-auto">
						<li class="nav-item   "><a class="nav-link active"
							aria-current="page" href="./">Inicio</a></li>
						<li class="nav-item">
							<a class="nav-link btn " href="${pageContext.request.contextPath}/registro">Registro</a>
						</li>
						<li class="nav-item ">
							<a class="nav-link btn btn-danger" href="${pageContext.request.contextPath}/acceso">Acceso</a>
						</li>
						 
					</ul>
					<ul class="d-flex" role="search">

 					</ul>
				</div>
			</div>
		</nav>
	</header>