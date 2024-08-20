package cl.praxis.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.praxis.modelo.db.Conn;
import cl.praxis.modelo.dto.Direccion;
 
import cl.praxis.modelo.dto.Usuarios;

public class UsuariosDAOImpl implements UsuariosDAO {

	 
	public void crear(Usuarios u) {
		 
			String querySql = "INSERT INTO usuarios (correo, create_at, nick, nombre, password, peso, updated_at) VALUES('"+u.getCorreo()+"', '"+u.getfCreacion()+"', '"+u.getNick()+"', '"+u.getNombre()+"', '"+u.getPassword()+"', '"+u.getPeso()+"', '"+u.getfActualizacion()+"')";
			 
			try {
				
				Connection conex = Conn.getConn();
				Statement st = conex.createStatement();
				st.execute(querySql);
				
			}catch(SQLException e) {
				System.out.println("Error: en el metodo crear()");
				e.printStackTrace();
			}
		}
	
	public Usuarios validadorLogeo(String correo, String clave) {
		
		 Usuarios u =null; 
		try {
			Connection conectar = Conn.getConn();
			Statement s = conectar.createStatement();
			String querySql = "SELECT nick, id FROM usuarios WHERE correo = '"+correo+"' and password = '"+clave+"'";
 			ResultSet rs = s.executeQuery(querySql);
			if (rs.next()) {
				u = new Usuarios();
				u.setNick(rs.getString("nick"));
				u.setId(rs.getInt("id"));
			}else { 
				System.out.println("no existe concordancia ");
			} 
		}catch(SQLException e) {
			System.out.println("Error en el metodo validadorLogeo()");
			e.printStackTrace();		
		}
		
		
		
		return u;   
		
	}
	
	
	public Usuarios validaCorreo (String correo) {
		
		 Usuarios u =null; 
		try {
			Connection conectar = Conn.getConn();
			Statement s = conectar.createStatement();
			String querySql = "SELECT correo FROM usuarios WHERE correo = '"+correo+"'";
			ResultSet rs = s.executeQuery(querySql);
			if (rs.next()) {
				u = new Usuarios();
				u.setCorreo(rs.getString("correo"));
			} 
		}catch(SQLException e) {
			System.out.println("Error en el metodo valida correo()");
			e.printStackTrace();		
		}
		return u; 
	}
	
  
	public String leerRolAdmin(int id) {

		String querySql = "SELECT rol_id FROM roles_usuarios ru WHERE usuario_id = '" + id + "';";
		String tipoDeUsuario = null;

		try {
			Connection conectar = Conn.getConn();
			Statement s = conectar.createStatement();
			ResultSet rs = s.executeQuery(querySql);
			if (rs.next()) {

				String data = rs.getString("rol_id");
				System.out.println("id del rol  "+ data);
				if (data.equals("1")) {
					tipoDeUsuario = "Administrador";
				}else {
					tipoDeUsuario = "Usuario";
				}
			}
		} catch (SQLException e) {
			System.out.println("Error en el metodo valida roles()");
			e.printStackTrace();
		}

		return tipoDeUsuario;

	}
	
	
	
	
	
	
	/*public List<String>leerDirecciones(){
		List<String> l = new ArrayList();
		try {
			Connection conectar = Conn.getConn();
			Statement s = conectar.createStatement();
			//String querySql = "Select id, nombre, rut, direccion, correo, telefono, contacto, telefono_contacto from proveedores";
			String querySql = "select u.id, u.nombre, u.correo, u.nick, d.nombre, d.numeracion, ru.rol_id from direcciones d join usuarios u  on d.usuario_id = u.id join roles_usuarios ru on ru.usuario_id = u.id";
			ResultSet rs = s.executeQuery(querySql);
			while (rs.next()) {				
			
				l.add(0,String.valueOf(rs.getInt("id")));
				l.add(1,rs.getString("nombre"));
				l.add(2,rs.getString("correo"));
				l.add(3,rs.getString("nick"));
				l.add(4,rs.getString("nombre"));
				l.add(5,rs.getString("numeracion"));
				l.add(6,String.valueOf(rs.getInt("rol_id")));

			}					
		}catch(SQLException ex){
			System.out.println("Error en el Metodo read()");
			ex.printStackTrace();
		}	
		
		
		return l;
		
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	}


