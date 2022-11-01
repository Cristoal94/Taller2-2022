package Dominio;
import Logica.*;
public class Pais {
	
	private String nombrePais;
	private String pieza;
	private int codigoArma;
	private int cantidad;
	private String material;
	private ListaArma listaArma;
	private ListaPieza listaPieza;
	
	public Pais(String nombrePais, String pieza, int codigoArma, int cantidad, String material) {
		this.nombrePais = nombrePais;
		this.pieza = pieza;
		this.codigoArma = codigoArma;
		this.cantidad = cantidad;
		this.material = material;
		listaArma = new ListaArma(1000);
		listaPieza = new ListaPieza(1000);
	}
	public String getNombrePais() {
		return nombrePais;
	}
	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	public String getPieza() {
		return pieza;
	}
	public void setPieza(String pieza) {
		this.pieza = pieza;
	}
	public int getCodigoArma() {
		return codigoArma;
	}
	public void setCodigoArma(int codigoArma) {
		this.codigoArma = codigoArma;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public ListaArma getListaArma() {
		return listaArma;
	}
	public void setListaArma(ListaArma listaArma) {
		this.listaArma = listaArma;
	}
	public ListaPieza getListaPieza() {
		return listaPieza;
	}
	public void setListaPieza(ListaPieza listaPieza) {
		this.listaPieza = listaPieza;
	}
	@Override
	public String toString() {
		return "Pais [nombrePais=" + nombrePais + ", pieza=" + pieza + ", codigoArma=" + codigoArma + ", cantidad="
				+ cantidad + ", material=" + material + ", listaArma=" + listaArma + ", listaPieza=" + listaPieza + "]";
	}
	
	
	

}
