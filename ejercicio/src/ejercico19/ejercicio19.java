package ejercico19;

import java.util.Scanner;

public class ejercicio19 {

	public static void main (String[] args) {
		Scanner datos = new Scanner (System.in);
	
	int numero;
	
	System.out.println("Que desea ordenar?");
	numero = datos.nextInt();
	
	switch(numero) {
	
	case 1:
		System.out.println("Cafe cortado");
		break;
		
	case 2:
		System.out.println("Cafe Latte");
		break;
		
	case 3:
		System.out.println("Cafe solo");
	    break;
	
	case 4:
		System.out.println("Cafe lagrima");
	   break;
	   
	   default:
		   System.out.println("A finalizado el programa");
	break;
	
	}
	
	System.out.println("Hasta la proxima :)");
	
	
	
}
}