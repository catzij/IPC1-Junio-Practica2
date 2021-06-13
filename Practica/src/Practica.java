package src;
import java.util.*;
public class Practica{

	Scanner read = new Scanner(System.in);

	String[] nombreClientes = new String[100];
	int[] idClientes = new int[100];
	int[] telefonoClientes = new int[100];
	int[] peliculaCliente = new int[100];	

	public static void main(String args[]){

		Practica nuevo = new Practica();
	}

	public Practica(){

		int idCliente = 0;
		int seleeccionMenu;	

		do {
				asterisco(40);
				Bienvenido();
                menu();
                System.out.print("Elija una opcion: ");
                seleeccionMenu = read.nextInt();
                seleccionMenu(seleeccionMenu,idCliente);
                if (seleeccionMenu==6) {
                	idCliente++;
                }                
            } while (seleeccionMenu != 9);
        System.out.println("ADIOS");
	}

	public void Bienvenido(){

		System.out.println("    *** BIENVENIDO A MEMORABILIA *** ");
	}

	public void menu(){
		asterisco(40);
		System.out.println("      *** Menu *** ");
		System.out.println("1. Prestamo de peliculas");
		System.out.println("2. Devolucion de peliculas");
		System.out.println("3. Mostrar peliculas");
		System.out.println("4. Ingreso de peliculas");
		System.out.println("5. Ordenar peliculas");
		System.out.println("6. Ingresar clientes nuevos");
		System.out.println("7. Mostrar Clientes");
		System.out.println("8. Reportes");
		System.out.println("9. SALIR");
	}

	public void asterisco(int limite){

		for (int i = 0;  i<limite;i++ ) {
			System.out.print("*");	
		}
		System.out.println("");
	}

	public int contar(int variable){

		int numero = 0;
		for (int i = 0; i < (variable+1); i++ ) {
			numero++;
		}
		return numero;
	}

	public void seleccionMenu(int seleccion, int id){			

		switch(seleccion){
            case 1:{
                borrar_pantalla();
                System.out.println("Ingreso a la opcion 1. Prestamo de peliculas");
                pausa();
                borrar_pantalla();
                break;
            }case 2:{
                borrar_pantalla();
                System.out.println("Ingreso a la opcion 2. Devolucion de peliculas");
                pausa();
                borrar_pantalla();
                break;
            }case 3:{
            	borrar_pantalla();
            	System.out.println("Ingreso a la opcion 3. Mostrar las peliculas");
            	pausa();
            	borrar_pantalla();
                break;
            }case 4:{
            	borrar_pantalla();
            	System.out.println("Ingreso a la opcion 4. Ingreso peliculas");
            	pausa();
            	borrar_pantalla();
                break;
            }case 5:{
            	borrar_pantalla();
            	System.out.println("Ingreso a la opcion 5. Ordenar Peliculas");
            	pausa();
            	borrar_pantalla();
                break;
            }case 6:{            	
            	borrar_pantalla();
            	System.out.println("Ingreso a la opcion 6. Ingresar Nuevos Clientes");
            	llenarCLiente(nombreClientes, idClientes, telefonoClientes, id);                        
            	pausa();
            	borrar_pantalla();
            	break;
            }case 7:{

            	borrar_pantalla();
           	 	System.out.println("Ingreso a la opcion 7. Mostrar Clientes");            	
            	mostrarClientes(nombreClientes, idClientes, telefonoClientes, id);
            	pausa();
            	borrar_pantalla();
            	break;
            }case 8:{
            	borrar_pantalla();
            	System.out.println("Ingreso a la opcion 8. Reportes");
            	pausa();
            	borrar_pantalla();
            	break;
            }

        }
		
		
    }

	public void llenarCLiente(String[] nombres, int[] idCLiente, int[] telefono,int contador){
		
		idCLiente[contador] = contador;
		System.out.println("Ingrese nombre : ");
		nombres[contador] = read.next();
		System.out.println("Ingrese numero de telefono:");
		telefono[contador] = read.nextInt();					
	}

	public void mostrarClientes(String[] nombres, int[] idCLiente, int[] telefono, int cliente){
		
		if (cliente==0) {
			System.out.println("no hay clientes ");
		}else{
			for (int i=0 ;i < cliente ;i++ ) {
				System.out.println("ID Cliente "+idCLiente[i]+" Nombre "+nombres[i]+" Telefono " +telefono[i]);
			}
		}
	}

    public static void pausa(){
        //Interrupcion para hacer pausa en la pantalla
        new java.util.Scanner(System.in).nextLine();
    }

    public static void borrar_pantalla() {
    	//limpia pantalla
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}


