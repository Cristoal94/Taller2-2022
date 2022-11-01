package Dominio;
import Logica.*;
public class Persona {
	
	private String nombre;
	private String id;
	private String especialidad;
	private String equipo;

	
	public Persona(String nombre, String id, String especialidad, String equipo) {
		this.nombre = nombre;
		this.id = id;
		this.especialidad = especialidad;
		this.equipo = equipo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", id=" + id + ", especialidad=" + especialidad + ", equipo=" + equipo
				+ "]";
	}
	
	

}
