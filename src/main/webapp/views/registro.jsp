<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="/assets/html/header.jsp"></jsp:include>

<div class="container-sm">
	<div class="row">
		<div class="col-lg-10 col-xl-9 mx-auto">
			<div
				class="card flex-row my-5 border-0 shadow rounded-3 overflow-hidden">
				<div class="card-body p-4 p-sm-5">
					<h2 class="text-center mb-5 fw-light fs-5">Registro de Usuario</h2>
					<hr>



					<form class="row g-3" method="post" id="formulario " autocomplete="off"
						 
						action="${pageContext.request.contextPath}/registro">
						<div class="col-md-12">
							<div class="form-floating">
								<input type="text" class="form-control" id="nombre"
									name="nombre" placeholder="Nombre completo" required autocomplete="off"  > <label
									for="floatingInputGrid">Nombre : </label>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-floating">
								<input type="email" class="form-control" id="correo"
									name="correo"  required autocomplete="off" >
								<label for="floatingInputGrid">Direccion de Correo:</label>
							</div>
						</div>
						<div class="col-8">
							<div class="form-floating">
								<input type="text" class="form-control" id="nick" name="nick"
									placeholder="" required autocomplete="off"> <label for="floatingInputGrid">Nombre
									de Usuario o Nick : </label>
							</div>
						</div>
						<div class="col-4">
							<div class="form-floating">
								<input type="number" class="form-control" id="peso" name="peso"
									placeholder="peso en Kg" required autocomplete="off"> <label
									for="floatingInputGrid">Peso : </label>
							</div>
						</div>
						<hr>
						<div class="col-md-12">
							<div class="form-floating">
								<input type="password" class="form-control" id="password"
									name="password" required autocomplete="off">
								<label for="floatingInputGrid">Contraseña:</label>
							</div>
						</div>
						
						
						<hr>
						<div class="col-md-6">
							<div class="d-grid gap-2">
								<button type="submit"
									class="btn btn-lg btn-danger  text-uppercase">
									Registrar Usuario <i class="bi bi-person-vcard-fill"></i>
								</button>
							</div>
						</div>
						<div class="col-md-6">
							<div class="d-grid gap-2">
							
								<a class="btn btn-lg btn-secondary  text-uppercase" href="${pageContext.request.contextPath}/">Cancelar 
									<i class="bi bi-x-square-fill"></i>
								</a>
							</div>
						</div>
					</form>
				</div>
				<br /> <br /> <br />
			</div>
		</div>
	</div>
</div>







<jsp:include page="/assets/html/footer.jsp"></jsp:include>


<script>
	function verificarPasswords() {

		// Ontenemos los valores de los campos de contraseñas 
		pass1 = document.getElementById('password');
		pass2 = document.getElementById('password1');

		// Verificamos si las constraseñas no coinciden 
		if (pass1.value != pass2.value) {

			// Si las constraseñas no coinciden mostramos un mensaje 
			document.getElementById("error").classList.add("mostrar");

			return false;
		} else {

			// Si las contraseñas coinciden ocultamos el mensaje de error
			document.getElementById("error").classList.remove("mostrar");

			// Mostramos un mensaje mencionando que las Contraseñas coinciden 
			document.getElementById("ok").classList.remove("ocultar");

			// Desabilitamos el botón de login 
			document.getElementById("login").disabled = true;

			// Refrescamos la página (Simulación de envío del formulario) 
			setTimeout(function() {
				location.reload();
			}, 17000);

			return true;
		}

	}
	
	 
	
	
</script>

<style>
.ocultar {
	display: none;
}

.mostrar {
	display: block;
}
 
</style>