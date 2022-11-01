package Dominio;
import Logica.*;
public class Pieza {
	
	private String 	nombrePieza;
	private int codigoPieza;
	private String tipoPieza;
	private String paisOrigen;
	private int cantidadMaterial;
	
	public Pieza(String nombrePieza, int codigoPieza, String tipoPieza, String paisOrigen, int cantidadMaterial) {
		this.nombrePieza = nombrePieza;
		this.codigoPieza = codigoPieza;
		this.tipoPieza = tipoPieza;
		this.paisOrigen = paisOrigen;
		this.cantidadMaterial = cantidadMaterial;
	}

	public String getNombrePieza() {
		return nombrePieza;
	}

	public void setNombrePieza(String nombrePieza) {
		this.nombrePieza = nombrePieza;
	}

	public int getCodigoPieza() {
		return codigoPieza;
	}

	public void setCodigoPieza(int codigoPieza) {
		this.codigoPieza = codigoPieza;
	}

	public String getTipoPieza() {
		return tipoPieza;
	}

	public void setTipoPieza(String tipoPieza) {
		this.tipoPieza = tipoPieza;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public int getCantidadMaterial() {
		return cantidadMaterial;
	}

	public void setCantidadMaterial(int cantidadMaterial) {
		this.cantidadMaterial = cantidadMaterial;
	}

	@Override
	public String toString() {
		return "Pieza [nombrePieza=" + nombrePieza + ", codigoPieza=" + codigoPieza + ", tipoPieza=" + tipoPieza
				+ ", paisOrigen=" + paisOrigen + ", cantidadMaterial=" + cantidadMaterial + "]";
	}

	
	
	

}
