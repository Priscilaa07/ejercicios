package ejer48;

import java.util.Scanner;

/*Pedile a un usuario que ingrese cuatro apellidos. Por pantalla, mostr� cu�l es el
primer apellido alfab�ticamente.
Te doy un tip: la idea es parecida a encontrar m�ximos y m�nimos (como en el
ejercicio 35)*/
public class ejr48 {
	public static void main(String args[]) {
		
		String[] apellidos = new String[4];
		
		String[] apellido_max = new String[4] ;
		String[] apellido_min = new String[4] ;
		
		
		for( int i=0; i < 4 ; i++ ) {
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("ingrese apellido: ");
			apellidos = entrada.next();
			
			}

      
	
		
	}
 
}
