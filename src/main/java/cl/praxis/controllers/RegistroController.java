package cl.praxis.controllers;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.modelo.dao.UsuariosDAO;
import cl.praxis.modelo.dao.UsuariosDAOImpl;
import cl.praxis.modelo.dto.Usuarios;


@WebServlet("/registro")
public class RegistroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegistroController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		getServletContext().getRequestDispatcher("/views/registro.jsp").forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre");
		String correo = request.getParameter("correo");
		String nick = request.getParameter("nick");
		String peso =  request.getParameter("peso") ;
		String pass = request.getParameter("password");
		
		
		
		
		Usuarios us;
			
		
		UsuariosDAO uDAO = new UsuariosDAOImpl();

		
		if(	(nombre.isEmpty() || nombre==null  	) || (correo.isEmpty() || correo == null	) ||
			(nick.isEmpty()   || nick==null    	) || (pass.isEmpty()	  || pass==null		)){
			System.out.println("Error viene Vacio");
		}else {
				us = uDAO.validaCorreo(correo);
		
				
				if(us != null) {
					System.out.println("correo ya existe");
					
					
					
				}else {
					us = new Usuarios();		
					us.setCorreo(correo);
					us.setfCreacion(LocalDate.now());
					us.setNick(nick);
					us.setNombre(nombre);
					us.setPassword(pass);
					us.setPeso( Integer.parseInt(peso));
					us.setfActualizacion(LocalDate.now());
					uDAO.crear(us);
					
				}
				
		
		doGet(request, response);
	}

	}
}
