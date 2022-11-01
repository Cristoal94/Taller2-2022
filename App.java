package Logica;
import Dominio.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;



//18.593.099-8 Cristobal Alvarez
//20.383.989-8 Giannluca Bruzzone

public class App {

	public static void main(String[] args) throws ParseException, IOException {		
		ListaPieza listaPieza = new ListaPieza(1000);
		ListaRobot listaRobot = new ListaRobot(1000);
		ListaPersona listaPersona = new ListaPersona(1000);
		ListaArma listaArma = new ListaArma(1000);
		ListaMaterial listaMaterial = new ListaMaterial(1000);
		ListaPais listaPais = new ListaPais(1000);
									
		lecturaPersonas(listaPersona);
		lecturaPais(listaPais);
		lecturaRobot(listaRobot);
		lecturaArma(listaArma);
		lecturaPieza(listaPieza);
		lecturaMaterial(listaMaterial);
		Menu(listaArma, listaMaterial, listaPais, listaPersona, listaPieza, listaRobot);
		cierreSistema(listaArma, listaMaterial, listaPais, listaPersona, listaPieza, listaRobot);

	}
	
	
	/** reading from the Robots.txt file
	 * 
	 * @param listaRobot container for the Robot class
	 * @throws FileNotFoundException
	 */
	public static void lecturaRobot(ListaRobot listaRobot) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("Robots.txt"));
		while(scan.hasNextLine()) {
			String linea = scan.nextLine();
			String [] partes = linea.split(",");
			String nombreRobot= partes[0];
			String nombreBrazo=partes[1];
			String nombrePierna=partes[2];
		    String nombreTorax=partes[3];
			String nombreCabeza=partes[4];
			String nombreCualidad=partes[5];
			String nombreArma=partes[6];
			String equipo=partes[7];
			String codigoPiloto= partes[8];
			Robot r = new Robot(nombreRobot, nombreBrazo, nombrePierna, nombreTorax, nombreCabeza, nombreCualidad, nombreArma, equipo, codigoPiloto);
			listaRobot.ingresarRobot(r);
			
		}
		
	}
	
	
	/** reading from the Paises.txt file
	 * 
	 * @param listaPais container for the Pais class
	 * @throws FileNotFoundException
	 */
	public static void lecturaPais(ListaPais listaPais) throws FileNotFoundException{
			Scanner scan = new Scanner(new File("Paises.txt"));
			while(scan.hasNextLine()) {
				String linea = scan.nextLine();
				String [] partes = linea.split(",");
				String nombrePais = partes[0];
				String pieza = partes[1];
				int codigoArma = Integer.parseInt(partes[2]);
				int cantidad = Integer.parseInt(partes[3]);
				String material = partes[4];
				Pais p = new Pais(nombrePais, pieza, codigoArma, cantidad, material);
				listaPais.ingresarPais(p);			
	   }
	}
	
	
	/** reading from the Armas.txt file
	 * 
	 * @param listaArma container for the Arma class
	 * @throws FileNotFoundException
	 */
	public static void lecturaArma(ListaArma listaArma) throws FileNotFoundException {
			Scanner scan = new Scanner(new File("Armas.txt"));
			while(scan.hasNextLine()) {
				String linea = scan.nextLine();
				String [] partes = linea.split(",");
				String nombreArma = partes[0];
				int codigoArma = Integer.parseInt(partes[1]);
				double municion = Double.parseDouble(partes[2]);
				String nombrePais = partes[3];
				int cantidad = Integer.parseInt(partes[4]);
				Arma a = new Arma(nombreArma, codigoArma, municion, nombrePais, cantidad);
				listaArma.ingresarArma(a);
		}
	}
	
	
	/** reading from the Piezas.txt file
	 * 
	 * @param listaPieza container for the Pieza class
	 * @throws FileNotFoundException
	 */
	public static void lecturaPieza(ListaPieza listaPieza) throws FileNotFoundException{
			Scanner scan = new Scanner(new File("Piezas.txt"));
			while(scan.hasNextLine()) {
				String linea = scan.nextLine();
				String [] partes = linea.split(",");
				String nombrePieza = partes[0];
				int codigoPieza = Integer.parseInt(partes[1]);
				String tipoPieza = partes[2];
				String paisOrigen = partes[3]; 
				int cantidadMaterial = Integer.parseInt(partes[4]);
				Pieza p = new Pieza(nombrePieza, codigoPieza, tipoPieza, paisOrigen, cantidadMaterial);
				listaPieza.ingresarPieza(p);
				

				
			}
	}
	
	
	/** reading from the Materiales.txt file
	 * 
	 * @param listaMaterial container for the Material class
	 * @throws FileNotFoundException
	 */
	public static void lecturaMaterial(ListaMaterial listaMaterial) throws FileNotFoundException{
			Scanner scan = new Scanner(new File("Materiales.txt"));
			while(scan.hasNextLine()) {
				String linea = scan.nextLine();
				String [] partes= linea.split(",");
				String nombreMaterial = partes[0];
				int stock = Integer.parseInt(partes[1]);
				String paisOrigen = partes[2];			
				Material m = new Material(nombreMaterial, stock, paisOrigen);
				listaMaterial.ingresarMaterial(m);
			}						
	}
	
	
	/** reading from the Personas.txt file
	 * 
	 * @param listaPersona container for the Persona class
	 * @throws FileNotFoundException
	 */
	public static void lecturaPersonas(ListaPersona listaPersona) throws FileNotFoundException{
			Scanner scan = new Scanner(new File("Personas.txt"));
			while(scan.hasNextLine()) {
				String linea = scan.nextLine();
				String [] partes = linea.split(",");
				String nombre = partes[0];
				String id = partes[1];
				String especialidad = partes[2];
				String equipo = partes[3];
				Persona p = new Persona(nombre, id, especialidad, equipo);
				listaPersona.ingresarPersona(p);
			}
	}
	
	
	/** Menu that will be called from the main, where the name and id of the person will be entered
	 * 
	 * @param listaArma container for the Arma class
	 * @param listaMaterial container for the Material class
	 * @param listaPais container for the Pais class
	 * @param listaPersona container for the Persona class
	 * @param listaPieza container for the Pieza class
	 * @param listaRobot container for the Robot class
	 * @throws ParseException
	 * @throws IOException
	 */
	public static void Menu(ListaArma listaArma, ListaMaterial listaMaterial, ListaPais listaPais, ListaPersona listaPersona, ListaPieza listaPieza, ListaRobot listaRobot) throws ParseException, IOException{
		Scanner scan = new Scanner(System.in);
		//boolean admin=false;
		System.out.println("\n------------------------");
		System.out.println("Bienvenido al Menu.");
		System.out.println("Tiene que ingresar su nombre  y su id para ingresar.");
		String opc = scan.nextLine();
            while(!opc.equals("f")) {
				System.out.println("Si es admin ingrese nombre cuenta : empanada y contraseña	: porotosconriendas");
				System.out.println("Ingrese nombre :");
				String nombre = scan.nextLine();
				System.out.println("Ingrese id :");
				String id = scan.nextLine();
				boolean usuario = listaPersona.buscarPersonaValidar(nombre, id);
				if(nombre.equals("empanada") && id.equals("porotosconriendas")) {
					MenuSecreto(listaArma, listaMaterial, listaPais, listaPersona, listaPieza, listaRobot);
					//admin=true;
					continue;
				}
				
				else if(usuario== true) {					
				    System.out.println("Bienvenido, "+nombre);
					MenuUsuario(listaArma, listaMaterial, listaPais, listaPersona, listaPieza, listaRobot);															
				}
				else {
					System.out.println("incorrecta.");
					System.out.println("Ingrese nuevamente sus datos [f] para salir, ingrese enter para ingresar sus datos :");
					opc = scan.nextLine();
				}
				

				
			  }
            
	}
	
	
	/** User menu, which will have different options to interact
	 * 
	 * @param listaArma container for the Arma class
	 * @param listaMaterial container for the Material class
	 * @param listaPais container for the Pais class
	 * @param listaPersona container for the Persona class
	 * @param listaPieza container for the Pieza class
	 * @param listaRobot container for the Robot class
	 */		
	public static void MenuUsuario(ListaArma listaArma, ListaMaterial listaMaterial, ListaPais listaPais, ListaPersona listaPersona, ListaPieza listaPieza, ListaRobot listaRobot) {
        Scanner scan = new Scanner(System.in);
        System.out.println("seleccione alguna de las siguientes opciones: "+"\n1) Ingresar pieza o arma"+"\n2) Ensamblar robot:"+
        "\n3) Crear equipo:"+"\n4) Buscar por tipos de piezas:"+"\n5) Buscar por material: "+"\n6) Crear modelo:"+"\n7) Revisar piezas:"+
        		"\n8) Mostrar todas las personas:"+"\n9) Mostrar todos los grupos:"+"\n10) Mostrar todos los robots:"+"\n11) Revisar munición:"+
        "\n12) Mostrar todos los Países:"+"\n13) Añadir stock piezas:"+"\n14) Añadir stock Materiales: Se elige un material para agregar el stock:"+
        		"\n15) Mostrar todas las Piezas y armas:"+"\n16) Cambiar piezas:");
        String opc = scan.nextLine();
        while(!opc.equals("f")) {
            if(opc.equals("1")) {
                System.out.println("ingrese un objeto: (Pieza o Arma)");
                String obj = scan.nextLine();
                if(obj.equalsIgnoreCase("Pieza")) {
                    System.out.println("ingrese el nombre de la pieza: ");
                    String pieza = scan.nextLine();
                    System.out.println("ingrese el codigo de la pieza: ");
                    int codigo = Integer.parseInt(scan.nextLine());
                    System.out.println("ingrese el tipo de pieza: ");
                    String tipo = scan.nextLine();
                    System.out.println("ingrese el nombre del pais de origen");
                    String pais = scan.nextLine();
                    System.out.println("ingrese la cantidad de material: ");
                    int cantidad = Integer.parseInt(scan.nextLine());
                    Pieza p1 = new Pieza(pieza, codigo, pieza, pais, cantidad);
                    listaPieza.ingresarPieza(p1);
                    System.out.println("Pieza agregada");

                }
                else if(obj.equalsIgnoreCase("Arma")) {
                    System.out.println("ingrese el nombre de la arma: ");
                    String arma = scan.nextLine();
                    System.out.println("ingrese el codigo del arma: ");
                    int codigo = Integer.parseInt(scan.nextLine());
                    System.out.println("ingrese municion arma: ");
                    double municion = Double.parseDouble(scan.nextLine());
                    System.out.println("ingrese el nombre del pais de origen");
                    String pais = scan.nextLine();
                    System.out.println("ingrese la cantidad : ");
                    int cantidad = Integer.parseInt(scan.nextLine());
                    Arma a1 = new Arma(arma, codigo, municion, pais, cantidad);
                    listaArma.ingresarArma(a1);
                    System.out.println("Arma agregada");
                }
                else {
                	System.out.println("No ingreso arma ni pieza");
                }
            }
            else if(opc.equals("2")) {
            	System.out.println("ingrese el nombre del robot: ");
                String nombre = scan.nextLine();
                Robot robot = listaRobot.buscarRobot(nombre);
            	System.out.println(robot.getNombreArma());
            	System.out.println(robot.getNombreBrazo());
            	System.out.println(robot.getNombreCabeza());
            	System.out.println(robot.getNombreCualidad());
            	System.out.println(robot.getNombrePierna());
            	System.out.println(robot.getNombreTorax());
            	if(robot!=null) {
            		System.out.println("ingrese el nombre del equipo: ");
                    String equipo= scan.nextLine();
                    Persona p = listaPersona.buscarEquipo(equipo);
                    p.setEquipo(robot.getEquipo());
                    System.out.println("Se asocio el robot al equipo y a la persona :"+p.getNombre()+"Equipo :"+p.getEquipo());       		
            	}
            	else {
            		System.out.println("El robot no existe");          		
            	}         	
            }
            else if(opc.equals("3")) {
            	
            	
            	       	             	
            }
            else if(opc.equals("4")) {
            	System.out.println("Ingrese la pieza a buscar :");
            	String nombre = scan.nextLine();
            	System.out.println(listaPais.BuscarPaisPieza(nombre));
	             	
            }
            else if(opc.equals("5")) {
            	System.out.println("Ingrese el material :");
            	String nombre = scan.nextLine();
            	System.out.println(listaMaterial.BuscarPaisMaterial(nombre));	           	
            }
            else if(opc.equals("6")) {
 
            	
            }
            
            else if(opc.equals("7")) {
            	System.out.println("Ingrese el nombre del robot :");
            	String nombre = scan.nextLine();
            	Robot robot = listaRobot.buscarRobot(nombre);
            	robot.getNombreArma();
            	robot.getNombreBrazo();
            	robot.getNombreCabeza();
            	robot.getNombreCualidad();
            	robot.getNombrePierna();
            	robot.getNombreTorax();
            	////
            	System.out.println("Ingrese la pieza que quiere cambiar [1] Arma, [2] brazo,"
            			+ "[3] Cabeza, [4] Cualidad, [5] Pierna,[6] Torax:");
            	String pieza = scan.nextLine();
            	if(pieza=="Arma") {
            		System.out.println("Ingrese el arma :");
            		String armanew = scan.nextLine();
            		robot.setNombreArma(armanew);
            	}
            	else if(pieza=="Brazo") {
            		System.out.println("Ingrese el brazo :");
            		String brazonew = scan.nextLine();
            		robot.setNombreBrazo(brazonew);
            	}
            	else if(pieza=="Cabeza") {
            		System.out.println("Ingrese la cabeza :");
            		String cabezanew = scan.nextLine();
            		robot.setNombreCabeza(cabezanew);
            	}
            	else if(pieza=="Cualidad") {
            		System.out.println("Ingrese la cualidad :");
            		String cualidadanew = scan.nextLine();
            		robot.setNombreCualidad(cualidadanew);
            	}
            	else if(pieza=="Pierna") {
            		System.out.println("Ingrese la Pierna:");
            		String piernanew= scan.nextLine();
            		robot.setNombrePierna(piernanew);
            	}
                else if(pieza=="Torax") {
        		    System.out.println("Ingrese el Torax :");
        		    String toraxnew = scan.nextLine();
        		    robot.setNombreTorax(toraxnew);
        	}
            	       	
           }
           else if(opc.equals("8")) {
        	   System.out.println(listaPersona.DesplegarPersona());    	               	
            }
           else if(opc.equals("9")) {
        	      	               	
            }
           else if(opc.equals("10")) {
        	   System.out.println(listaRobot.DesplegarRobot());      	        	       	               	
            }
           else if(opc.equals("11")) {
        	   listaRobot.DesplegarRobot();
        	   System.out.println("Ingrese nombre de robot :");
        	   String nombre = scan.nextLine();
        	   Robot robot = listaRobot.buscarRobot(nombre);
        	   robot.getNombreArma();
        	   String arma = listaArma.buscarArmaRobot(robot.getNombreArma());
        	   for(int i=0;i<listaRobot.getCant();i++) {
        		   if(arma==listaRobot.getRobotI(i).getNombreArma()) {
        			   System.out.println("Ingrese la municion que quiere de la arma"+listaArma.getArmaI(i).getNombreArma());
        			   double municionnew = Double.parseDouble(scan.nextLine());
        			   listaArma.getArmaI(i).setMunicion(listaArma.getArmaI(i).getMunicion()+municionnew);
        		   }
        		   else {
        			   System.out.println("La arma no se encuentra ");
        		   }
        	   }
            }
           else if(opc.equals("12")) {
        	   System.out.println(listaPais.desplegarPais());
        	   break;
            }
           else if(opc.equals("13")) {
        	   System.out.println("ingrese el pais para reponer stock: ");
        	   String paisSoli = scan.nextLine();
        	   Pais pais = listaPais.BuscarPaisNombre(paisSoli);
        	   
        	   System.out.println("Ingrese el nombre de la pieza :");
        	   String piezaSoli = scan.nextLine();
        	   Pieza pieza = listaPieza.buscarPiezaNombre(piezaSoli);
        	   
        	   if(pais.getPieza()==pieza.getNombrePieza()) {
            	   System.out.println("ingrese la cantidad de stock a reponer: ");
            	   int cant = Integer.parseInt(scan.nextLine());
            	   pais.setCantidad(pais.getCantidad()+cant);
        	   }
        	   else {
        		   System.out.println("El nombre de la pieza no coincide");
        	   }
        	        	        	       	               	
            }
           else if(opc.equals("14")) {
        	   System.out.println("ingrese el material que desee reponer: ");
       	       String materialSoli = scan.nextLine();
       	       Material m = listaMaterial.buscarMaterialNombre(materialSoli);
       	       System.out.println("ingrese la cantidad de material a reponer: ");
       	       int cant = Integer.parseInt(scan.nextLine());
       	       m.setStock(m.getStock()+cant);
        	         	        	       	               	
            }
           else if(opc.equals("15")) {
        	   System.out.println(listaPieza.DesplegarPieza());
        	   System.out.println(listaArma.DesplegarArma());
        	         	        	       	               	
            }
           else if(opc.equals("16")) {
        	   System.out.println(listaArma.DesplegarArma());
        	   System.out.println(listaPieza.DesplegarPieza());       	 
            }                                                       
        }
        
        
	}
	
	
	/** Secret menu, which can be entered only with a specific user and id, with options that are not in the user menu
	 * 
	 * @param listaArma container for the Arma class
	 * @param listaMaterial container for the Material class
	 * @param listaPais container for the Pais class
	 * @param listaPersona container for the Persona class
	 * @param listaPieza container for the Pieza class
	 * @param listaRobot container for the Robot class
	 */
	public static void MenuSecreto(ListaArma listaArma, ListaMaterial listaMaterial, ListaPais listaPais, ListaPersona listaPersona, ListaPieza listaPieza, ListaRobot listaRobot) {
		System.out.println("Bienvenido al Menu secreto");
		System.out.println("Tiene 2 opciones [a]Activacion de recursos nucleares, [b]Destruccion de los archivos ");
		System.out.println("Ingrese su opcion: ");
		Scanner scan = new Scanner(System.in);
		String opcion = scan.nextLine();
		if(opcion=="a") {
			System.out.println("Se creara un nuevo material de nombre:Area51, con stock:100000, y de pais de origen: Uranio");
			Material material = new Material("Area51",1000000,"Uranio");
			listaMaterial.ingresarMaterial(material);
			System.out.println("Se creo el material de forma exitosa");
		}
		else if(opcion=="b") {
			System.out.println("Se eliminara todo y se destruiara todo");
			listaArma.eliminar();
			listaMaterial.eliminar();
			listaPais.eliminar();
			listaPersona.eliminar();
			listaRobot.eliminar();
			System.out.println("Se lanzo una bomba y se elimino todo");
			
		}
	}
		
	
	/** system shutdown, which will be responsible for adding the things we want to add previously to the specified txt, once we stop occupying the program
	 * 
	 * @param listaArma container for the Arma class
	 * @param listaMaterial container for the Material class
	 * @param listaPais container for the Pais class
	 * @param listaPersona container for the Persona class
	 * @param listaPieza container for the pieza class
	 * @param listaRobot container for the Robot class
	 */
	public static void cierreSistema(ListaArma listaArma, ListaMaterial listaMaterial, ListaPais listaPais, ListaPersona listaPersona, ListaPieza listaPieza, ListaRobot listaRobot) {
		try {
			BufferedWriter escritura = new BufferedWriter(new FileWriter("Armas.txt"));
			escritura.write(listaArma.obtenerDatosArma());
			escritura.close();
			} catch (Exception e) {
			System.out.println("No se pudo sobreescribir el archivo Armas.txt");
			}
			try {
			BufferedWriter escritura = new BufferedWriter(new FileWriter("Materiales.txt"));
			escritura.write(listaMaterial.obtenerDatosMaterial());
			escritura.close();
			} catch (Exception e) {
			System.out.println("No se pudo crear el archivo Materiales.txt");
			}
			
			try {
				BufferedWriter escritura = new BufferedWriter(new FileWriter("Paises.txt"));
				escritura.write(listaPais.obtenerDatosPais());
				escritura.close();
			} catch (Exception e) {
				System.out.println("No se pudo crear el archivo Paises.txt");
			}
			
			try {
				BufferedWriter escritura = new BufferedWriter(new FileWriter("Personas.txt"));
				escritura.write(listaPersona.obtenerDatosPersona());
				escritura.close();
			} catch (Exception e) {
				System.out.println("No se pudo crear el archivo Personas.txt");
			}
			
			try {
				BufferedWriter escritura = new BufferedWriter(new FileWriter("Piezas.txt"));
				escritura.write(listaPieza.obtenerDatosPieza());
				escritura.close();
			} catch (Exception e) {
				System.out.println("No se pudo crear el archivo Piezas.txt");
			}
			
			try {
				BufferedWriter escritura = new BufferedWriter(new FileWriter("Robots.txt"));
				escritura.write(listaRobot.obtenerDatosRobot());
				escritura.close();
			} catch (Exception e) {
				System.out.println("No se pudo crear el archivo Robots.txt");
			}
			
			
    }
										
}
