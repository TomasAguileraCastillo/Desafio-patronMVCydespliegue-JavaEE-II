<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <jsp:include page="/assets/html/header.jsp"></jsp:include>
<div class="container-sm">
	<div class="row">
		<div class="col-lg-10 col-xl-9 mx-auto">
			<div
				class="card flex-row my-5 border-0 shadow rounded-3 overflow-hidden">
				<div class="card-body p-4 p-sm-5">	
					<h1 class="text-center mb-5 fw-light fs-5">
						<b>
							  Login de Acceso
						</b>
					</h1>
					<hr>
					<form class="row g-3" method="post" action="${pageContext.request.contextPath}/acceso" >
						<div class="col-md-12">
							<div class="form-floating input-group">
								<input type="email" class="form-control" id="usuarioEmail" name="usuarioEmail" placeholder="nambre@ejemplo.com" required >
								<label for="floatingInputGrid">Direccion de Correo : </label>
								<span class="input-group-text" id="basic-addon1"><i class="bi bi-envelope"></i></span>
							</div>
						</div>
						<div class="col-12">
							<div class="form-floating input-group">
								<input type="password" class="form-control" id="clave" name="clave" placeholder="" required>
								<label for="floatingInputGrid">Contraseña: </label>
								<span class="input-group-text" id="basic-addon2"><i class="bi bi-key"></i></span>
								
							</div>
						</div>
						
						<hr>
						<div class="d-grid mb-2">
							<button class="btn btn-lg btn-danger  text-uppercase" type="submit">Acceder 
							<i class="bi bi-door-open-fill"></i></button>
						</div>
 					</form>
				</div>
				<br/><br/><br/>
			</div>
		</div>
	</div>
</div>


<jsp:include page="/assets/html/footer.jsp"></jsp:include>
