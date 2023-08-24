package ejer43;

import java.util.Scanner;

public class ejercicio43 {
	
	public static void main (String args []) {
		Scanner datos = new Scanner (System.in);
	/*Generar un programa el cual almacene cinco números enteros. Si alguno de
esos números es negativo, no debe mostrarse en pantalla.*/
		
		int[]numeros = new int[5];
		
        for(int i = 0 ; i<5; i++) {
			
			System.out.println("Ingrese numero: ");
			numeros[i] = datos.nextInt();
	
      if(numeros[i]>0);
}
        
}
}