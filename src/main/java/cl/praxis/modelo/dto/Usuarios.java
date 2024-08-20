package cl.praxis.modelo.dto;

import java.time.LocalDate;

public class Usuarios {
	
	//Atributos
	private int id;
	private String correo;
	private LocalDate fCreacion;
	private String nick;
	private String nombre;
	private String password;
	private int peso;
	private LocalDate fActualizacion;
	
	//Constructor vacio
	public Usuarios() {
		super();
	}
	
	//Constructor completo
	public Usuarios(int id, String correo, LocalDate fCreacion, String nick, String nombre, String password, int peso,
			LocalDate fActualizacion) {
		super();
		this.id = id;
		this.correo = correo;
		this.fCreacion = fCreacion;
		this.nick = nick;
		this.nombre = nombre;
		this.password = password;
		this.peso = peso;
		this.fActualizacion = fActualizacion;
	}
	
	//Metodos
	
	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", correo=" + correo + ", fCreacion=" + fCreacion + ", nick=" + nick + ", nombre="
				+ nombre + ", password=" + password + ", peso=" + peso + ", fActualizacion=" + fActualizacion + "]";
	}
	
	//Getters y Setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public LocalDate getfCreacion() {
		return fCreacion;
	}
	public void setfCreacion(LocalDate fCreacion) {
		this.fCreacion = fCreacion;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public LocalDate getfActualizacion() {
		return fActualizacion;
	}
	public void setfActualizacion(LocalDate fActualizacion) {
		this.fActualizacion = fActualizacion;
	}

	
	
	
	
	

}
