package ejerci45;

import java.util.Scanner;

public class ejercicio45 {

	public static void main (String args []) {
		Scanner datos = new Scanner (System.in);
		
		int encontrarSocio ;
		int[] numeros = {1011, 2367, 8748, 9121, 817 , 6423, 2034};
	
		String[] nombre = {"Enrique" , "Liliana" , "Lucas", "Juan", "Fiorella", "Ariel" , "Daiana"}; 
	
	     System.out.println("Para encontrar a un individuo, ingresar número de socio: ");
	     
	     encontrarSocio = datos.nextInt();
	     
	     for (int i = 0; i<numeros.length; i ++) {
	    
	if( encontrarSocio == numeros[i] ) {
	System.out.println("El numero de socio es: "+numeros[i]);
	System.out.println("Pertenece a : "+nombre[i]);
	}
	
	
	     }
	     }
}

