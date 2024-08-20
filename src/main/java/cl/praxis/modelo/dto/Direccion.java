package cl.praxis.modelo.dto;

public class Direccion {
	// Atributos
	private int id;
	private String nombre;
	private String numeracion;
	private int usuarioId;

	// constructor Vacio
	public Direccion() {
		super();
	}

	// constructor Completo

	public Direccion(int id, String nombre, String numeracion, int usuarioId) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numeracion = numeracion;
		this.usuarioId = usuarioId;
	}
		
	// Metodos

	

	@Override
	public String toString() {
		return "Direccion [id=" + id + ", nombre=" + nombre + ", numeracion=" + numeracion + ", usuarioId=" + usuarioId
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeracion() {
		return numeracion;
	}

	public void setNumeracion(String numeracion) {
		this.numeracion = numeracion;
	}

	public int getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	

	// getters and setters
	
}
