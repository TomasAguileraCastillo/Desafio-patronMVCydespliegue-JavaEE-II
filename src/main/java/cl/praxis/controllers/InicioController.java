package cl.praxis.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.praxis.modelo.dto.Direccion;

 
@WebServlet("/inicio")
public class InicioController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public InicioController() {
		super();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession s = request.getSession();
		if (s.getAttribute("isLogged") == null) {
			getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
			return;
		}
		String correo = request.getParameter("correo");
		String nick = request.getParameter("nick");
		boolean isLogged = (boolean) s.getAttribute("isLogged");
		if (isLogged == false) {
			getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
			return;
		}
		if (isLogged = true) {
			getServletContext().getRequestDispatcher("/views/inicio.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);

		
	}

}
