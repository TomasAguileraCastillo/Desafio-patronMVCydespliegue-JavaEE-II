package cl.praxis.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.praxis.modelo.dao.*;
import cl.praxis.modelo.dao.UsuariosDAO;
import cl.praxis.modelo.dao.UsuariosDAOImpl;
import cl.praxis.modelo.dto.Direccion;
import cl.praxis.modelo.dto.Usuarios;
import cl.praxis.modelo.service.UsuarioServicios;

 
@WebServlet("/acceso")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usuarioEmail = request.getParameter("usuarioEmail");
		String clave = request.getParameter("clave");
		Usuarios us = null;
		UsuariosDAO uDAO = new UsuariosDAOImpl();
		DireccionDAO dDAO = new DireccionDAOImpl();
		List<Direccion> l = new ArrayList();
		if (usuarioEmail == null && clave == null) {
			getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
		} else {
			us = uDAO.validadorLogeo(usuarioEmail, clave);
			if (us == null) {
				getServletContext().getRequestDispatcher("/login").forward(request, response);
			} else {
				String nick = us.getNick();
				int id = us.getId();
				String tipoUsuario = uDAO.leerRolAdmin(id);
				System.out.println("Tipo de Usuario " + tipoUsuario);
				if (tipoUsuario == "Administrador") {
					// List<String> l = new ArrayList();
					//DireccionDAO d = new DireccionDAOImpl();
					

					l = dDAO.LeerDireccion1();

					// l.forEach(a -> {System.out.println(a);});

					// l.stream().forEach(System.out::print);

					// System.out.println(l.get(0).toString());
					
					HttpSession session = request.getSession();
					session.setAttribute("isLogged", true);
					session.setAttribute("correo", usuarioEmail);
					session.setAttribute("nick", nick);
					session.setAttribute("tipoU", tipoUsuario);
					session.setAttribute("mensaje", "");
					session.setAttribute("v", "");

				
					//request.setAttribute("ldirecciones", l);
					
					
					request.setAttribute("lista1", l);
					//session.setAttribute("lista1", l);
					
			

					getServletContext().getRequestDispatcher("/inicio").forward(request, response);

				} else if (tipoUsuario == "Usuario") {
					
					HttpSession session = request.getSession();
					session.setAttribute("isLogged", true);
					session.setAttribute("correo", usuarioEmail);
					session.setAttribute("nick", nick);
					session.setAttribute("tipoU", tipoUsuario);
					String mensaje = "Error de permisos, Ud. no es Administrador";
					session.setAttribute("mensaje", mensaje);
					session.setAttribute("v", "d-none");
					

					getServletContext().getRequestDispatcher("/inicio").forward(request, response);

				}

			}
		}

	}

}
