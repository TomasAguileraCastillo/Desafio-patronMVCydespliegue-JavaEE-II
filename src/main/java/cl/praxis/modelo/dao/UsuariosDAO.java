package cl.praxis.modelo.dao;

import java.util.List;

import cl.praxis.modelo.dto.Direccion;
 
import cl.praxis.modelo.dto.Usuarios;

public interface UsuariosDAO {
	
	void crear(Usuarios u); // crea Usuarios
 	Usuarios validadorLogeo(String correo, String clave); // valida si fue logeado el usuario
 	Usuarios validaCorreo (String correo);
 	
 	String leerRolAdmin(int id);
 	
 
 	
 }
