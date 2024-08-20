package cl.praxis.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.praxis.modelo.db.Conn;
import cl.praxis.modelo.dto.Direccion;

public class DireccionDAOImpl implements DireccionDAO {

	@Override
	public List<Direccion> LeerDireccion1() {
	 
			
			List<Direccion> d = new ArrayList<Direccion>();
			try {
				Connection conectar = Conn.getConn();
				Statement s = conectar.createStatement();
				String querySql =  "Select id, nombre, numeracion, usuario_id from direcciones";
				ResultSet rs = s.executeQuery(querySql);
				while (rs.next()) {				
				d.add(new Direccion( rs.getInt("id"), rs.getString("nombre"), rs.getString("numeracion"),  rs.getInt("usuario_id") ));
				}					
			}catch(SQLException ex){
				System.out.println("Error en el Metodo leerDireccion1()");
				ex.printStackTrace();
			}	
			return d;
			
	 
	}

}
