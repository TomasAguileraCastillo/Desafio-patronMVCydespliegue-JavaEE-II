<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <style>
  text.us {
  text-transform: capitalize;
  }
 </style>   
<jsp:include page="/assets/html/head.jsp"></jsp:include>


	<header>
		<nav class="navbar border-bottom navbar-expand-lg"
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
							aria-current="page" href="./"> </a></li>
						<li class="nav-item">
							<a class="nav-link btn " href=" "> </a>
						</li>
						<li class="nav-item ">
							<a class="text-white link-offset-2 
							link-underline link-underline-opacity-0" href=" "><small>Conectado como : 
							<%=session.getAttribute("tipoU")%> </small> 
								<i><text class="us"><%=session.getAttribute("nick")%></text></i>
							</a> 
						</li>
						 
					</ul>
					<ul class="d-flex" role="search">

 					</ul>
				</div>
			</div>
		</nav>
	</header>
 

	<div>
		<h1> ${mensaje}</h1>
	</div> 
 
 
 
	<!-- Seccion DataTable -->
	<section id="seccionTabla">
		<div class="container">
			<div class="${v}">
			
			
			
				<br />
				<table id="tbldirecciones"  class=" border-danger 
													table 
													table-hover 
													table-sm 
													caption-top 
													table-responsive" 
													style="width:50%" 
													>
					 <caption>Lista de Direcciones</caption>
					<thead>
						<tr>
							<th>Id</th>
							<th>Direccion</th>
							<th>Numeracion</th>
				
							 
						</tr>
					</thead>
					<tbody class="table-group-divider">
				
					
						<c:forEach var="d" items="${lista1}">
							<tr>
								<td><c:out value="${d.id}"></c:out></td>
								<td><c:out value="${d.nombre}"></c:out></td>
								<td><c:out value="${d.numeracion}"></c:out></td>
	
							</tr>
						</c:forEach>
						
						
					</tbody>
				</table>
			</div>
		</div>
	</section>
	<!-- Fin DataTable -->
	








