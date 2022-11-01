package Logica;
import Dominio.*;
public class ListaPersona {
	
	private int max;
	private int cant;
	private Persona [] lista;

	
	public ListaPersona(int max) {
		this.max=max;
		this.cant=0;
		lista = new Persona[max];
	}
	
	public boolean ingresarPersona(Persona persona) {
		if(cant<max) {
			lista[cant]=persona;
			cant++;
			return true;
		}
		return false;
	}
	
	public boolean ingresarEquipo(Persona equipo) {
		if(cant<max) {
			lista[cant]=equipo;
			cant++;
			return true;
		}
		return false;
	}
	
	public String DesplegarPersona() {
		String text="";
		for(int i=0;i<cant;i++) {
			if(lista[i].getEspecialidad().equalsIgnoreCase("Piloto")) {
				text+="Nombre Persona"+lista[i].getNombre()+"Especialidad"+lista[i].getEspecialidad();				
			}
			else if(lista[i].getEspecialidad().equalsIgnoreCase("Ensamblador")) {
				text+="Nombre Persona"+lista[i].getNombre()+"Especialidad"+lista[i].getEspecialidad();				
			}
			
		}
		return text;

	}
	
	public boolean buscarPersonaValidar(String nombre, String id) {
		for(int i=0;i<cant;i++) {
			if(lista[i].getNombre().equals(nombre) &&lista[i].getId().equals(id) && lista[i].getEquipo().equalsIgnoreCase("ADMINISTRACION")) {
				return true;
			}
		}
		return false;
	}
	
	public Persona buscarEquipo(String nombre) {
		for(int i=0;i<cant;i++) {
			if(lista[i].getEquipo().equals(nombre)) {
				return lista[i];
			}
		}
		return null;
	}
		
	
	
	public int getCant(){
        return cant;
    }
	
	
	public Persona getPersonaI(int i) {
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
	
	public String obtenerDatosPersona() {
		return lista.toString();
	}
	
}
