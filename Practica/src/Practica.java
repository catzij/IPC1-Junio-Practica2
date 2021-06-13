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
		int opcion;
		

		Bienvenido(idCliente);

		do {
                menu();
                System.out.print("Elija una opcion: ");
                opcion = read.nextInt();
                opcionMenu(opcion);
            } while (opcion != 9);		
	}

	public void Bienvenido(int i){

		System.out.println(" *** BIENVENIDO A MEMORABILIA *** ");
		System.out.println(" Que encuentres la pelicual que buscas "+nombreClientes[i]);
	}

	public void menu(){

		System.out.println("      *** Menu *** ");
		System.out.println("1. Prestamo de peliculas");
		System.out.println("2. Devolucion de peliculas");
		System.out.println("3. Mostrar peliculas");
		System.out.println("4. Ingreso de peliculas");
		System.out.println("5. Ordenar peliculas");
		System.out.println("6. Ingresar clientes nuevos");
		System.out.println("7. Mostrar Clietes");
		System.out.println("8. Reportes");		
		System.out.println("9. SALIR");
	}

	public void opcionMenu(int opcion){

        switch(opcion){
            case 1:{           
                borrar_pantalla();
                System.out.println("Ingreso a la opcion 1");
                break;
            }
            case 2:{
                borrar_pantalla();                
                System.out.println("Ingreso a la opcion 2");
                break;
            }
            case 3:{
            	borrar_pantalla();
            	System.out.println("Ingreso a la opcion 3");
                break;
            }
            case 4:{
            	borrar_pantalla();
            	System.out.println("Ingreso a la opcion 4");                            
                break;
            }
            case 5:{
            	borrar_pantalla();
            	System.out.println("Ingreso a la opcion 5");
                break;
            }
            case 6:{
            	borrar_pantalla();
            	System.out.println("Ingreso a la opcion 6");
            	llenarCLiente(nombreClientes, idClientes, telefonoClientes);
            	break;
            }
            case 7:{
            	borrar_pantalla();
            	System.out.println("Ingreso a la opcion 7");
            	break;
            }
            case 8:{
            	borrar_pantalla();
            	System.out.println("Ingreso a la opcion 8");
            	break;
            }
        }
    }

	public void clienteInicial(String[] nombres, int[] idCLiente, int[] telefono){

		int clientecero =0;
		nombres[clientecero] = "Eduardo";
		idCLiente[clientecero] = clientecero;		
		telefono[clientecero] = 12345678;		
	}

	public void llenarCLiente(String[] nombres, int[] idCLiente, int[] telefono){

		int contador=1;
		
		System.out.println("Ingrese nombre : ");
		nombres[contador] = read.nextLine();
		idCLiente[contador] = contador;		
		System.out.println("Ingrese numero de telefono:");
		telefono[contador] = read.nextInt();				
		
		contador++;
		
		System.out.println("\n\n");
		//return contador;
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