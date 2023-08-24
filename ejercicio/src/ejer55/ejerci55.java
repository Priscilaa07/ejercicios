package ejer55;

import java.util.Scanner;

public class ejerci55 {
	
	/*Escriba una función llamada alCuadrado() que calcule el cuadrado
     del valor que se le transmite y despliegue el resultado. La función deberá
     ser capaz de elevar al cuadrado números flotantes.*/ 
	
	static int n1;

	public static void ingresarNumeros() {
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Ingresa el numero a elevar : ");
	    n1 = entrada.nextInt();
	}
	
	public static float cuadrado(float a) { 
	  float cuadrado1 = a * a;
	    return cuadrado1 ;
	}
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
	    ingresarNumeros();
	    cuadrado(n1); //n1 : argumentos
	    System.out.println("El resultado de la elevacion es: " + cuadrado(n1));
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
