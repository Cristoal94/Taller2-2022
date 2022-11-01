package Dominio;
import Logica.*;

public class Arma {
	
	private String nombreArma;
	private int codigoArma;
	private double municion;
	private String nombrePais; //
	private int cantidad;
	
	public Arma(String nombreArma, int codigoArma, double municion, String nombrePais, int cantidad) {
		this.nombreArma = nombreArma;
		this.codigoArma = codigoArma;
		this.municion = municion;
		this.nombrePais = nombrePais;
		this.cantidad= cantidad;
		}
	
	public String getNombreArma() {
		return nombreArma;
	}
	public void setNombreArma(String nombreArma) {
		this.nombreArma = nombreArma;
	}
	public int getCodigoArma() {
		return codigoArma;
	}
	public void setCodigoArma(int codigoArma) {
		this.codigoArma = codigoArma;
	}
	public double getMunicion() {
		return municion;
	}
	public void setMunicion(double municion) {
		this.municion = municion;
	}
	public String getNombrePais() {
		return nombrePais;
	}
	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Arma [nombreArma=" + nombreArma + ", codigoArma=" + codigoArma + ", municion=" + municion
				+ ", nombrePais=" + nombrePais + ", cantidad=" + cantidad + "]";
	}
	
	
	
	

}
