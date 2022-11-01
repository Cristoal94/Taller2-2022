package Logica;
import Dominio.*;

public class ListaRobot {
	
	private int cant;
	private int max;
	private Robot [] lista;
	
	public ListaRobot(int max) {
		this.max=max;
		this.cant=0;
		lista = new Robot[max];
	}
	public boolean ingresarRobot(Robot robot) {
		if(cant<max) {
			lista[cant]=robot;
			cant++;
			return true;
		}
		return false;
	}
	
	public Robot buscarRobot(String nombre) {
		for(int i=0;i<cant;i++) {
			if(lista[i].getNombreRobot().equals(nombre)) {
				return lista[i];
			}
		}
		return null;
	}
	
	public void buscarRobotPiezas(String nombre) {
		for(int i=0;i<cant;i++) {
			if(lista[i].getNombreRobot().equals(nombre)) {
				System.out.println("");

			}
		}

	}
	
	public String DesplegarRobot() {
		String text="";
		for(int i=0;i<cant;i++) {
			text+="Nombre Robot :"+lista[i].getNombreRobot()+"\n";
		}
		return text;
	}
	
	
	public int getCant(){
        return cant;
    }
	
	
	public Robot getRobotI(int i) {
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
	
	public String obtenerDatosRobot() {
		return lista.toString();
	}
	

}
