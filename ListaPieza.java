package Logica;
import Dominio.*;

public class ListaPieza {
	private int cant;
	private int max;
	private Pieza [] lista;
	
	public ListaPieza(int max) {
		this.max=max;
		this.cant=0;
		lista = new Pieza[max];
	}
	
	public boolean ingresarPieza(Pieza pieza) {
		if(cant<max) {
			lista[cant]=pieza;
			cant++;
			return true;
		}
		return false;
	}
	
	public void buscarPieza(String nombre) {
		for(int i=0;i<cant;i++) {
			if(lista[i].getNombrePieza().equals(nombre)) {
				System.out.println("Nombre pieza :"+lista[i].getNombrePieza()+"Nombre pais"+lista[i].getPaisOrigen());
			}
		}

	}
	
	public Pieza buscarPiezaNombre(String nombre) {
		for(int i=0;i<cant;i++) {
			if(lista[i].getNombrePieza().equals(nombre)) {
				return lista[i];
			}
		}
		return null;

	}
	
	
	
	public int getCant(){
        return cant;
    }
	
	
	public Pieza getPiezaI(int i) {
		if(i>=0 && i<cant) {
			return lista[i];
		}
		return null;
	}
	
	public String DesplegarPieza() {
		String text="";
		for(int i=0;i<cant;i++) {
			text+=lista[i].getNombrePieza()+"\n";			
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
	
	
	public String obtenerDatosPieza() {
		return lista.toString();
	}
	
	
	

}
