package cl.praxis.modelo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {

	// Conexion Singleton

	private static Connection conect = null;

	private String driver = "org.postgresql.Driver";
	private String dataBase = "startup";
	private String url = "jdbc:postgresql://localhost:5432/" + dataBase;
	private String user = "tomas";
	private String pass = "tomas";

	// Constructor

	
	public Conn() {
 			try {
				Class.forName(driver);
				conect = DriverManager.getConnection(url, user, pass);
				boolean isValid = conect.isValid(50000);
				System.out.println(isValid ? "Tests ok BD Postgres":"Test no ok BD Postgre");			
			}catch (ClassNotFoundException | SQLException ex ) {
				System.out.println("Error al Conectar con la BD : " + ex.getMessage());
			}
		}
 

	public static Connection getConn() {
		if (conect == null) {
			new Conn();
		}
		return conect;
	}

}
