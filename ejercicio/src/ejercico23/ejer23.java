package ejercico23;



import java.util.Scanner;

/*
 Solicitar al usuario dos números. Luego, sumarlos y mostrar en pantalla la suma.
Indicarle al usuario que debe tocar el cero (0) para salir. Entonces, mientras 0 no
sea ingresado como número, el programa volverá a pedir dos números para
sumar, y mostrar esa suma en pantalla. Esto debe ocurrir al menos una vez.
 */


public class ejer23 {

public static void main(String[] args) {
Scanner datos = new Scanner(System.in);

int numero1,numero2, decision, suma;
boolean opcion = false;

do {
	
	System.out.println("Ingrese un numero: ");
	numero1= datos.nextInt();
	System.out.println("Ingrese otro numero: ");
	numero2= datos.nextInt();
	
	suma= numero1 + numero2;
	System.out.println("la suma es: "+suma);
	
	System.out.println("toque 0 para salir ");
	decision = datos.nextInt();
	
	if(decision==0) {
		opcion = true;
	}
}while(opcion == false);
   
 
 



 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
