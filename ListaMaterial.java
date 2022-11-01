package Logica;
import Dominio.*;


class ListaMaterial {
	
	private int max;
	private int cant;
	private Material [] lista;
	
	public ListaMaterial(int max) {
		this.max=max;
		cant=0;
		lista= new Material[max];
	}
	
	public boolean ingresarMaterial(Material material) {
		if(cant<max) {
			lista[cant]=material;
			cant++;
			return true;
		}
		return false;
	}
	
	public void buscarMaterial(String nombre) {
		for(int i=0;i<cant;i++) {
			if(lista[i].getNombreMaterial().equals(nombre)) {
				System.out.println("Nombre Pais :"+lista[i].getNombrePais()+"Stock"+lista[i].getStock());
			}
		}

	}
	
	public Material buscarMaterialNombre(String nombre) {
		for(int i=0;i<cant;i++) {
			if(lista[i].getNombreMaterial().equals(nombre)) {
				return lista[i];
			}
		}
		return null;
	}
	
	public String BuscarPaisMaterial(String nombre) {
		String text ="";
		for(int i=0;i<cant;i++) {
			if(lista[i].getNombreMaterial().equals(nombre)){
				text+="Nombre pais :"+lista[i].getNombrePais()+",Stock :"+lista[i].getStock();								
			}
		}
		return text;
	}
			
	
	
	public int getCant(){
        return cant;
    }
	
	
	public Material getMaterialI(int i) {
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
	
	public String obtenerDatosMaterial() {
		return lista.toString();
	}

}