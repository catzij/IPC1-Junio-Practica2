package src;
import java.util.*;
public class Practica{

	Scanner read = new Scanner(System.in);
	float[] nota = new float[6];
	String[] nombre = new String[6];

	public static void main(String args[]){
		Practica nuevo = new Practica();
	}

	public Practica(){

		for (int i = 0 ; i < 6 ;i++ ) {
				
			llenarMatriz2(i);
		
		}
		for (int i = 0 ;i < 6 ;i++ ) {
			llenarMatriz1(i);
			System.out.print("\n  ");

			
		}

		for (int i = 0 ; i < 6 ;i++) {
			mostrarDatos(i);
			System.out.print("   ");
			mostrarNota(i);
			System.out.print("   ");
			criterio(i);
			System.out.print(" \n  ");
		}
		
	}
		
	public void llenarMatriz1(int i){	
		
			System.out.print("ingrese la nota: ");
			nota[i] = read.nextFloat();		
	}

	public void llenarMatriz2(int i){	
		
			System.out.print("ingrese nombre: ");
			nombre[i] = read.nextLine();		
	}

	public void mostrarDatos(int i ){	
		
			System.out.print("nombre: "+nombre[i]);			 				
	}

	public void mostrarNota(int i){
		
			System.out.print("nota: "+nota[i]);			 				
	}	

	public void criterio(int i){

		if (nota[i]<5) {
			System.out.print("Suspenso");
			
		}else if (nota[i]>=5 && nota[i]<7) {
			System.out.print("Bien");
			
		}else if (nota[i]>=7 && nota[i]<9) {
			System.out.print("Notable");
			
		}else if (nota[i]>=9 && nota[i]<=10) {
			System.out.print("Sobresaliente");			
		}
	}
}