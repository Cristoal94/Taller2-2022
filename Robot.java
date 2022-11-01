package Dominio;
import Logica.*;
public class Robot {
	
	private String nombreRobot;
	private String nombreBrazo;
	private String nombrePierna;
	private String nombreTorax;
	private String nombreCabeza;
	private String nombreCualidad;
	private String nombreArma;
	private String equipo;
	private String codigoPiloto;
	private ListaPersona listaPersona;
	
	public Robot(String nombreRobot, String nombreBrazo, String nombrePierna, String nombreTorax, String nombreCabeza,
			String nombreCualidad, String nombreArma, String equipo, String codigoPiloto) {
		this.nombreRobot=nombreRobot;
		this.nombreBrazo=nombreBrazo;
		this.nombrePierna=nombrePierna;
		this.nombreTorax=nombreTorax;
		this.nombreCabeza=nombreCabeza;
		this.nombreCualidad=nombreCualidad;
		this.nombreArma=nombreArma;
		this.equipo=equipo;
		this.codigoPiloto=codigoPiloto;
		listaPersona = new ListaPersona(10000); 
	}

	public String getNombreRobot() {
		return nombreRobot;
	}

	public void setNombreRobot(String nombreRobot) {
		this.nombreRobot = nombreRobot;
	}

	public String getNombreBrazo() {
		return nombreBrazo;
	}

	public void setNombreBrazo(String nombreBrazo) {
		this.nombreBrazo = nombreBrazo;
	}

	public String getNombrePierna() {
		return nombrePierna;
	}

	public void setNombrePierna(String nombrePierna) {
		this.nombrePierna = nombrePierna;
	}

	public String getNombreTorax() {
		return nombreTorax;
	}

	public void setNombreTorax(String nombreTorax) {
		this.nombreTorax = nombreTorax;
	}

	public String getNombreCabeza() {
		return nombreCabeza;
	}

	public void setNombreCabeza(String nombreCabeza) {
		this.nombreCabeza = nombreCabeza;
	}

	public String getNombreCualidad() {
		return nombreCualidad;
	}

	public void setNombreCualidad(String nombreCualidad) {
		this.nombreCualidad = nombreCualidad;
	}

	public String getNombreArma() {
		return nombreArma;
	}

	public void setNombreArma(String nombreArma) {
		this.nombreArma = nombreArma;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String getCodigoPiloto() {
		return codigoPiloto;
	}

	public void setCodigoPiloto(String codigoPiloto) {
		this.codigoPiloto = codigoPiloto;
	}
	
	

	public ListaPersona getListaPersona() {
		return listaPersona;
	}

	public void setListaPersona(ListaPersona listaPersona) {
		this.listaPersona = listaPersona;
	}

	@Override
	public String toString() {
		return "Robot [nombreRobot=" + nombreRobot + ", nombreBrazo=" + nombreBrazo + ", nombrePierna=" + nombrePierna
				+ ", nombreTorax=" + nombreTorax + ", nombreCabeza=" + nombreCabeza + ", nombreCualidad="
				+ nombreCualidad + ", nombreArma=" + nombreArma + ", equipo=" + equipo + ", codigoPiloto="
				+ codigoPiloto + ", listaRobot=" + listaPersona + "]";
	}
	
	
	

}
