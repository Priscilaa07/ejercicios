package ejerci;
import java.util.Scanner; 
public class ejercicio40 {

	/*ingresen cinco temperaturas. Cada una,
debe ser almacenada. La idea es mostrar en pantalla el promedio de estas
cinco temperaturas.*/
	
	public static void main (String args []) {
		Scanner datos = new Scanner (System.in);

		int[] temperaturas = new int[5];
		float promedio=0;
		
		
		for(int i = 0 ; i<5; i++) {
			
			System.out.println("Ingrese una temperatura: ");
			temperaturas[i] = datos.nextInt();
		
			promedio+=temperaturas[i]; /*promedio es igual a la suma de cada temp ingresada*/
		}
		promedio=promedio/5;
		
		System.out.println("\n ");
		
         for (int i = 0; i<3; i++) {
			
			System.out.println("Temperatura numero "+i +": ");
			System.out.println(temperaturas[i]);
		
	}
	
    System.out.println("el promedio de las temperaturas es : "+promedio);     
}
}