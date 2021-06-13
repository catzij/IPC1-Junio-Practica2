package src;
import java.util.*;
public class Practica{

	Scanner read = new Scanner(System.in);

	//para cliente
	String[] nombreClientes = new String[100];
	int[] idClientes = new int[100];
	int[] telefonoClientes = new int[100];
	int[] peliculaCliente = new int[100];

	//para peliculas
	String[] nombrePelicula = new String[100];
	String[] categoriaPelicula = new String[100];
	int[] idPelicula = new int[100];
	int[] estrenoPelicula = new int[100];

	public static void main(String args[]){

		Practica nuevo = new Practica();
	}

	public Practica(){

		int idCliente = 0;
		int seleeccionMenu;
		int cantidadPeliculas=6;

		peliculasIniciales();

		do {
				asterisco(40);
				Bienvenido();
				asterisco(40);
                menu();
                System.out.print("Elija una opcion: ");
                seleeccionMenu = read.nextInt();
                seleccionMenu(seleeccionMenu,idCliente,cantidadPeliculas);
                if (seleeccionMenu==6) {
                	idCliente++;
                }
                if (seleeccionMenu==4) {
                	cantidadPeliculas++;
                }                
            } while (seleeccionMenu != 9);
        System.out.println("ADIOS");
	}

	public void Bienvenido(){

		System.out.println("    *** BIENVENIDO A MEMORABILIA *** ");
	}

	public void peliculasIniciales(){
		nombrePelicula[0] = "THE_DARCK_KNIGHT";
		nombrePelicula[1] = "BUSCANDO_A_NEMO";
		nombrePelicula[2] = "BACK_TO_THE_FUTURE";
		nombrePelicula[3] = "STAR_WARS";
		nombrePelicula[4] = "LOS_TRES_CHIFLADOS";
		nombrePelicula[5] = "FOREST_GUMP";

		for (int i = 0 ;i < 6 ;  i++ ) {		
			idPelicula[i]=i;
		}

		categoriaPelicula[0]= categoriaPelicula(1);	
		categoriaPelicula[1]= categoriaPelicula(2);
		categoriaPelicula[2]= categoriaPelicula(3);
		categoriaPelicula[3]= categoriaPelicula(3);
		categoriaPelicula[4]= categoriaPelicula(4);
		categoriaPelicula[5]= categoriaPelicula(5);		
		
		estrenoPelicula[0]=2008;
		estrenoPelicula[1]=2003;
		estrenoPelicula[2]=1985;
		estrenoPelicula[3]=1977;
		estrenoPelicula[4]=2012;
		estrenoPelicula[5]=1994;		
	}

	public void menu(){
		
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

	public void seleccionMenu(int seleccion, int id,int cantidadPeliculas){			

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
    			mostrarPeliculas(nombrePelicula, categoriaPelicula,idPelicula,estrenoPelicula,cantidadPeliculas);        	
            	pausa();
            	borrar_pantalla();
                break;
            }case 4:{
            	borrar_pantalla();
            	System.out.println("Ingreso a la opcion 4. Ingreso peliculas");
            	llenarPeliculas(nombrePelicula,categoriaPelicula,idPelicula,estrenoPelicula,cantidadPeliculas);
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
				System.out.println("ID Cliente ["+idCLiente[i]+"] Nombre <<"+nombres[i]+">> Telefono ::" +telefono[i]+"::");
			}
		}
	}

	public void llenarPeliculas(String[] nombre, String[] categoria, int[] id, int[] estreno, int cantidadPeliculas){

		id[cantidadPeliculas] = cantidadPeliculas;
		System.out.println("Ingrese Nombre de la pelicula : ");
		System.out.println("*NOTA si tiene mas de dos palabras ingrese guion_bajo  ");
		nombre[cantidadPeliculas]=read.next();
		System.out.println("ingrese año de estreno : ");
		estreno[cantidadPeliculas] = read.nextInt();
		System.out.println("ingrese categoria de la pelicula");
		System.out.println("1. SUPERHEROES");
		System.out.println("2. INFANTIL");
		System.out.println("3. CIENCIA FICCION");
		System.out.println("4. COMEDIA");
		System.out.println("5. DRAMA");
		int opcion = read.nextInt();
		categoria[cantidadPeliculas] = categoriaPelicula(opcion); 
	}

	public void mostrarPeliculas(String[] nombre, String[] categoria, int[] id, int[] estreno, int cantidadPeliculas){

		for (int i=0 ;i < cantidadPeliculas ;i++ ) {
			System.out.println("ID ["+id[i]+"] Nombre ["+nombre[i]+"] año estreno [" +estreno[i]+"] categoria ["+categoria[i]+"]");
		}
	}

	public String categoriaPelicula(int categoria){
			String opcion = "";
		switch(categoria){
			case 1:{
					opcion = "SUPERHEROES";
				break;
			}case 2:{
					opcion = "INFANTIL";
				break;
			}case 3:{
					opcion = "CIENCIA FICCION";					
				break;
			}case 4:{
					opcion = "COMEDIA";
				break;
			}case 5:{
					opcion = "DRAMA";
				break;
			}
		}
			return	opcion;
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