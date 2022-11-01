package Logica;
import Dominio.*;


public class ListaArma {
	
	private int max;
	private int cant;
	private Arma [] lista;
	
	public ListaArma(int max) {
		this.max=max;
		cant=0;
		lista= new Arma[max];
	}
	
	public boolean ingresarArma(Arma arma) {
		if(cant<max) {
			lista[cant]=arma;
			cant++;
			return true;
		}
		return false;
	}
	
	public Arma buscarArma(int codigo) {
		for(int i=0;i<cant;i++) {
			if(lista[i].getCodigoArma()==codigo) {
				return lista[i];
			}
		}
		return null;
	}
	
	public String buscarArmaRobot(String nombre) {
		for(int i=0;i<cant;i++) {
			if(lista[i].getNombreArma().equalsIgnoreCase(nombre)) {
				return lista[i].getNombreArma();
			}
		}
		return null;
	}
	
	public int getCant(){
        return cant;
    }
	
	
	public Arma getArmaI(int i) {
		if(i>=0 && i<cant) {
			return lista[i];
		}
		return null;
	}
	
	public String DesplegarArma() {
		String text="";
		for(int i=0;i<cant;i++) {
			text+=lista[i].getNombreArma();			
		}
		return text;
	}
	
	public void eliminar() {
        for(int i=0; i<cant; i++){     
            if(i==cant){
            }     
            else {       	
                for(int j = i;j<cant-1;j++){      	
            	    lista[j] = lista[j+1];
                }
                cant--;         
            }
	     }		
	}
	
	public String obtenerDatosArma() {
		return lista.toString();
	}

}
