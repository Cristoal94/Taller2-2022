package Dominio;
import Logica.*;
public class Material {
	
	private String nombreMaterial;
	private int stock;
	private String nombrePais;
	
	public Material(String nombreMaterial, int stock, String nombrePais) {

		this.nombreMaterial = nombreMaterial;
		this.stock = stock;
		this.nombrePais = nombrePais;
	}

	public String getNombreMaterial() {
		return nombreMaterial;
	}

	public void setNombreMaterial(String nombreMaterial) {
		this.nombreMaterial = nombreMaterial;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	@Override
	public String toString() {
		return "Material [nombreMaterial=" + nombreMaterial + ", stock=" + stock + ", nombrePais=" + nombrePais + "]";
	}
	
	
	

}
