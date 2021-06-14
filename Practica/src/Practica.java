package src;
import java.util.*;
public class Practica{

	Scanner read = new Scanner(System.in);

	//para cliente
	String[] nombreClientes = new String[30];
	int[] idClientes = new int[30];
	int[] telefonoClientes = new int[30];	

	//para peliculas
	String[] nombrePelicula = new String[30];
	String[] categoriaPelicula = new String[30];
	int[] idPelicula = new int[30];
	int[] estrenoPelicula = new int[30];

	//prestamo de peliculas
	boolean[] estadoPelicula = new boolean[30];
	boolean[] quienRento = new boolean[30];
	int[] diasPrestado = new int[30];
	int[][] posicion = new int[2][30];

	public static void main(String args[]){

		Practica nuevo = new Practica();
	}

	public Practica(){

		int idCliente = 6;
		int seleeccionMenu;
		int cantidadPeliculas=6;
		int inicio1 = 0 ;
		int inicio2 = 0;
		int f1 = 1;
		int f2 = 1;

		datosIniciales();

		do {
				asterisco(40);
				Bienvenido();
				asterisco(40);
                menu();
                System.out.print("Elija una opcion: ");
                seleeccionMenu = read.nextInt();
                int paraPosicion = seleccionMenu(seleeccionMenu,idCliente,cantidadPeliculas,inicio1,inicio2,f1,f2);                
                	if (paraPosicion==1) {
                		inicio1++;
                		inicio2++;
                		f1++;                		
                	}
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

		System.out.println("    <<< BIENVENIDO A MEMORABILIA >>> ");
	}

	public void datosIniciales(){

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

		for (int i = 0 ;i < 6 ;  i++ ) {		
			idClientes[i] = i;
			diasPrestado[i] = 0;
			quienRento[i] = false;
			Random r = new Random();        
        	telefonoClientes[i] = (int) (r.nextInt() * 100);        	
			 
		}			
		nombreClientes[0] = "Mario";
		nombreClientes[1] = "Maria";
		nombreClientes[2] = "Eduardo";
		nombreClientes[3] = "Sara";
		nombreClientes[4] = "Oscar";
		nombreClientes[5] = "Isabel";	
	}

	public void menu(){
		
		System.out.println("      <<< Menu >>> ");
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

	public int seleccionMenu(int seleccion, int id,int cantidadPeliculas,int inicio1, int inicio2,int f1,int f2){			

		int paraPosicion=0;
		switch(seleccion){
            case 1:{
                borrar_pantalla();
                System.out.println("Ingreso a la opcion 1. Prestamo de peliculas");
                paraPosicion = rentarPelicula(cantidadPeliculas, id, inicio1,inicio2,f1,f2);                
                pausa();
                borrar_pantalla();
                break;
            }case 2:{
                borrar_pantalla();
                System.out.println("Ingreso a la opcion 2. Devolucion de peliculas");
                devolucion(f1,id,quienRento);
                pausa();
                borrar_pantalla();
                break;
            }case 3:{
            	borrar_pantalla();
            	System.out.println("Ingreso a la opcion 3. Mostrar las peliculas");
    			mostrarPeliculas(nombrePelicula, categoriaPelicula,idPelicula,estrenoPelicula,cantidadPeliculas,estadoPelicula);        	
            	pausa();
            	borrar_pantalla();
                break;
            }case 4:{
            	borrar_pantalla();
            	System.out.println("Ingreso a la opcion 4. Ingreso peliculas");
            	llenarPeliculas(nombrePelicula,categoriaPelicula,idPelicula,estrenoPelicula,cantidadPeliculas,estadoPelicula);
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
            	llenarCLiente(nombreClientes, idClientes, telefonoClientes, id, quienRento,diasPrestado);
            	pausa();
            	borrar_pantalla();
            	break;
            }case 7:{
            	borrar_pantalla();
           	 	System.out.println("Ingreso a la opcion 7. Mostrar Clientes");            	
            	mostrarClientes(nombreClientes, idClientes, telefonoClientes, id, quienRento,diasPrestado);
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
        return paraPosicion;	
    }

    public int rentarPelicula(int cantidadPeliculas,int id,int inicio1,int inicio2,int f1,int f2){
    	int paraPosicion=0;
    	asterisco(40);
    	System.out.println("               CLIENTES");
    	asterisco(40);
    	mostrarClientes(nombreClientes, idClientes, telefonoClientes, id, quienRento,diasPrestado);
    	System.out.println("");

    		if (id !=0) {
    			 
    			System.out.println("Que cliente quiere rentar, ingrese el ID del cliente ");
    			int cliente = read.nextInt();
    			int valor = verificacionCliente(cliente);    	 
    				if (valor !=1) {

	    				asterisco(40);
    					System.out.println("               PELICULAS");
    					asterisco(40);    	
    					mostrarPeliculas(nombrePelicula, categoriaPelicula, idPelicula, estrenoPelicula, cantidadPeliculas, estadoPelicula);
    					System.out.println("");
    					System.out.println("Que pelicula se va ha rentar, ingrese el ID de la pelicula ");
    					int numero = read.nextInt();    					

    					if (estadoPelicula[numero]==true) {
    							System.out.println("la pelicula se ha rentado, NO esta disponible");
    					}else if (estadoPelicula[numero]==false) {
    						System.out.println("la pelicula se puede rentar, rentar 1. si 2. no");
    						int opcion = read.nextInt();    		
    						boolean estadoRenta = false;    		
    							if (opcion == 1) {
    								estadoRenta = true;
    								System.out.println("cuantos dias quiere rentar la pelicula");
    								diasPrestado[cliente] = read.nextInt();
    								//llevar contror de quien y que pelicula rento
    									for (int i = inicio1; i < f1 ; i++) {
    										for ( int j = inicio2; j < 1 ; j++ ) {
    											int aLaPar =(j+1);
	    										posicion[i][j]= cliente ; 
	    										posicion[i][(aLaPar)]= numero ;
    										}
    									}
    									paraPosicion=1;
    								System.out.println("la pelicula se ha rentado");
    								System.out.println("PELICULA : "+nombrePelicula[numero]);
    								System.out.println("RENTADO POR : "+nombreClientes[cliente]);
    								System.out.println("durante: "+diasPrestado[cliente]);

    							}else{
    								System.out.println("la pelicula NO se ha rentado");
    							}
    								estadoPelicula[numero] = estadoRenta;    									
    					}    							    			
	    			}	    			    		
    		}
    		return paraPosicion;    		
    }    

    public int verificacionCliente(int id){
    	int numero=0;
    	if (quienRento[id]==true) {
    		System.out.println("Tiene rentada una pelicula, NO puede rentar otra");
    		numero = 1;
    	}else if (quienRento[id]==false) {
    		System.out.println("Puede rentar, rentar 1. si 2. no");
    		int opcion = read.nextInt();    		
    		boolean estadoRenta = false;    		
    		if (opcion == 1) {
    			estadoRenta = true;    			
    		}
    		quienRento[id] = estadoRenta;
    	} 
    	return numero;
    }

	public void llenarCLiente(String[] nombres, int[] idCLiente, int[] telefono,int contador, boolean[] estado,int[] dias){
		
		idCLiente[contador] = contador;
		diasPrestado[contador] = 0;

		estado[contador] = false;
		System.out.println("Ingrese nombre : ");
		nombres[contador] = read.next();
		System.out.println("Ingrese numero de telefono:");
		telefono[contador] = read.nextInt();
	}

	public void mostrarClientes(String[] nombres, int[] idCLiente, int[] telefono, int cliente, boolean[] estado,int[] dias){
		
		if (cliente==0) {
			System.out.println("no hay clientes, ingrese algun cliente");
		}else{
			for (int i=0 ;i < cliente ;i++ ) {
				String renta = "PRESTO PELICULA";
					if (estado[i] == false) {
						renta = "NO PRESTO";
					}
				System.out.println("ID Cliente ["+idCLiente[i]+"] Nombre ["+nombres[i]+"]");
				System.out.println("Telefono [" +telefono[i]+"] Prestamo ["+renta+"] durante ["+dias[i]+"] dias");
				System.out.println("");
			}
		}
	}

	public void llenarPeliculas(String[] nombre, String[] categoria, int[] id, int[] estreno, int cantidadPeliculas, boolean[] estado){

		id[cantidadPeliculas] = cantidadPeliculas;
		estado[cantidadPeliculas] = false;
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

	public void mostrarPeliculas(String[] nombre, String[] categoria, int[] id, int[] estreno, int cantidadPeliculas,boolean[] estado){

		for (int i=0 ;i < cantidadPeliculas ;i++ ) {
			String renta = "Rentado";
			if (estado[i] == false) {
				renta = "No Rentado";
			}
			System.out.println("ID ["+id[i]+"] Nombre ["+nombre[i]+"] ESTADO ["+renta+"]");
			System.out.println(" Año Estreno ["+estreno[i]+"] Categoria ["+categoria[i]+"]");
			System.out.println(" ");
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

	public void devolucion(int f1, int cliente,boolean[] estado ){		
		
		int contador=0;
		for (int i = 0; i < cliente;i++ ) {			
			if (estado[i] == true) {
				contador = 1;				
			}			
		}
		if (contador == 1) {
			for (int i=0 ; i < f1 ; i++) {
    			for ( int j=0 ; j < 1 ; j++ ) {
    				int aLaPar =(j+1);

   					int posicion1 = posicion[i][j];
   					int posicion2 = posicion[i][(aLaPar)];

   					if (estadoPelicula[posicion2] == true && quienRento[posicion1] == true ) {
   						System.out.println("ID ["+posicion1+"] nombre ["+nombreClientes[posicion1]+"] rento  ID ["+posicion2+"] nombre ["+nombrePelicula[posicion2]+"] ");  						
   					}	   				
    			}
			}
			System.out.println("Quien va a devolver, ingrese ID del cliente ");
			int id = read.nextInt();
			System.out.println(" ingrese ID de la pelicula ");
			int id2 = read.nextInt();
			estadoPelicula[id2]=false;
			quienRento[id]=false;
			System.out.println("ID ["+idClientes[id]+"] nombre : ["+nombreClientes[id]+"] devolvio :["+nombrePelicula[id2]+"]");
		}else{
			System.out.println("nadie ha rentado");			
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
    public void ordenamientoAlfabetico(){

    }		
		
}