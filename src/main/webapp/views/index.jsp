<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/assets/html/header.jsp"></jsp:include>
<div class="container mt-5">
	<div class="bg-dark text-light rounded">
		<h1 class="p-3">Bienvenido al Sistema</h1>
		<div class="row justify-content-around  ">
			<div class="col-sm-5 mb-3 mb-sm-5">
				<div class="card text-center  ">
					<div class="card-body rounded">
						<a href="${pageContext.request.contextPath}/registro" class="btn btn-outline-danger">
							<h1 class="card-title">
								Registro <i class="bi bi-person-vcard-fill"></i>
							</h1>
							<p class="card-text">Registrio de datos en el Sistema.</p>
						</a>
					</div>
				</div>
			</div>
			<div class="col-sm-5 mb-3 mb-sm-5">
				<div class="card text-center">
					<div class="card-body">
						<a href="${pageContext.request.contextPath}/acceso" class="btn btn-outline-dark">
							<h1 class="card-title">	Login <i class="bi bi-door-open-fill"></i>
							</h1>
							<p class="card-text">Acceso al Sistema.</p>
						</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<jsp:include page="/assets/html/footer.jsp"></jsp:include>