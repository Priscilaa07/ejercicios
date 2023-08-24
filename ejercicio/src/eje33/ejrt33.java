package eje33;

import java.util.Scanner;

public class ejrt33 {
	
	public static void main(String args[]) {
	
		Scanner entrada = new Scanner(System.in);
		/*Vamos a armar un equipo de once jugadores de fútbol.
      Para eso, vamos a armar repetitivamente un programa que nos índice “¿Cuál
       es el nombre del jugador?” Se ingresa el nombre. Luego, solicitar su edad, e
       ingresarla.
       Cada vez que aumente en 1 la cantidad de jugadores, hay que volver a pedir el
    ingreso de los datos anteriores (nombre y edad).
     Al finalizar, hay que mostrar dichos datos... Pero ¿se pueden mostrar todos los
      datos de cada jugador? Comentame en el programa si es que se puede, y por
      qué.*/
		int edad ;
		String jugador;  
		 
		for (int i = 0; i < 11 ; i++) {
		System.out.println("Cual es el nombre del jugador: ");
		jugador=entrada.next();
		
		System.out.println("Ingresar la edad: ");
         edad=entrada.nextInt();
         
        
        	 System.out.println("El nombre es : "+jugador );
        	 System.out.println("Su edad es: "+edad);
         }
    	 
        /*no se puede porque te muestra el ultimo dato guardado*/
	}
}
