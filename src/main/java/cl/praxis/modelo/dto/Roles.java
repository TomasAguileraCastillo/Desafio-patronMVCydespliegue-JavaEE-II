package cl.praxis.modelo.dto;

public class Roles {
	//Atributos
	private int rolId;
	private int usuarioId;
	
	
	//Constructor
	public Roles() {
		
	}


	//Constructor Completo
	public Roles(int rolId, int usuarioId) {
		super();
		this.rolId = rolId;
		this.usuarioId = usuarioId;
	}
	
	//Metodos
	@Override
	public String toString() {
		return "Roles [rolId=" + rolId + ", usuarioId=" + usuarioId + "]";
	}


	//Getters and Setters
	public int getRolId() {
		return rolId;
	}


	


	public void setRolId(int rolId) {
		this.rolId = rolId;
	}


	public int getUsuarioId() {
		return usuarioId;
	}


	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}
	
	
	
	
	
	

}
