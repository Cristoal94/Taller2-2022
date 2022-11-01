	package Logica;
import org.w3c.dom.Text;

import Dominio.*;


class ListaPais {
	
	private int max;
	private int cant;
	private Pais [] lista;
	
	public ListaPais(int max) {
		this.max=max;
		cant=0;
		lista= new Pais[max];
	}
	
	public boolean ingresarPais(Pais pais) {
		if(cant<max) {
			lista[cant]=pais;
			cant++;
			return true;
		}
		return false;
	}
	
	public String desplegarPais() {
		String text="";
		for(int i=0;i<cant;i++) {
			text+="Nombre Pais: "+lista[i].getNombrePais()+"\n";
		}
		return text;
	}
	
	public Pais BuscarPaisNombre(String nombre) {
		for(int i=0;i<cant;i++) {
			if(lista[i].getNombrePais().equals(nombre)) {
				return lista[i];
			}
		}
		return null;
	}
	
	public String BuscarPaisPieza(String nombre) {
		String text ="";
		for(int i=0;i<cant;i++) {
			if(lista[i].getListaPieza().getPiezaI(i).getNombrePieza().equals(nombre)){
				text+="Nombre pais :"+lista[i].getNombrePais()+"\n";								
			}
		}
		return text;
	}
	
	
	
	public int getCant(){
        return cant;
    }
	
	
	public Pais getPaisI(int i) {
		if(i>=0 && i<cant) {
			return lista[i];
		}
		return null;
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
	
	public String obtenerDatosPais() {
		return lista.toString();
	}

}
