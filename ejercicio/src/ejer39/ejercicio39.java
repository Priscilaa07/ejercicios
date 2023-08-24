package ejer39;

import java.util.Scanner; 

public class ejercicio39 {
	
	public static void main (String args []) {
		Scanner datos = new Scanner (System.in);

/*Ahora sí vas a poder completar el ejercicio 33 (el de los jugadores de fútbol).
Para eso, arma un array del 1 al 11 para que almacene los nombres de los
jugadores, y otro array del 1 al 11 para almacenar la edad de cada uno.
Finalmente, hay que mostrar en pantalla los datos de cada jugador.*/
	
		String[] nombre = new String[11];
		int[] edad = new int[11];
		
		for(int i = 0; i<11; i++) {
			
			System.out.println("Ingrese nombre del jugador: ");
			nombre[i] = datos.next();
			
			System.out.println("Ingresa la edad correspondiente: ");
			edad[i] = datos.nextInt();
			
		}
	
		System.out.println("\n ");
		
		for (int i = 0; i<11; i++) {
			
			System.out.println("Nombre del jugador "+i +": ");
			System.out.println(nombre[i]);
			
			System.out.println("Edad del jugador "+i +": ");
			System.out.println(edad[i]);
			
			System.out.println("\n "); 
		}
	
	
	
	
	
	
	
	
	
	}
}
