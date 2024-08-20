package cl.praxis.modelo.service;

import java.util.List;

import cl.praxis.modelo.dao.DireccionDAO;
import cl.praxis.modelo.dao.DireccionDAOImpl;
import cl.praxis.modelo.dao.UsuariosDAO;
import cl.praxis.modelo.dao.UsuariosDAOImpl;
import cl.praxis.modelo.dto.*;

public class UsuarioServicios {
	
	private UsuariosDAO usuariosDAO = new UsuariosDAOImpl();
	private DireccionDAO direccionDAO = new DireccionDAOImpl();
	
	
	public void guarda(Usuarios u) {
		usuariosDAO.crear(u);
	}
	
	public void validaracceso(String correo, String pass) {
		usuariosDAO.validadorLogeo(correo, pass);
	}
	
	public void validaCorreo(String correo) {
		usuariosDAO.validaCorreo(correo);
	}
	

	public void leerRolAdmin(int id) {
		usuariosDAO.leerRolAdmin(id);
	}
	
	
	public void LeerDirecciones1() {
		direccionDAO.LeerDireccion1();
	}
	
	
}
