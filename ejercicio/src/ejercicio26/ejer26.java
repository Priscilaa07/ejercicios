package ejercicio26;

import java.util.Scanner;


public class ejer26 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);	
		
		int contrase�a=2007 , intentos=0;
		
		
		do {
			System.out.println("Ingrese una contrase�a: ");
		contrase�a= datos.nextInt();
		
		if(contrase�a != 2007) {
		intentos++;
		System.out.println("Contrase�a no permitida, vuelve a intentarlo");
		System.out.println("cantidad de intentos: "+intentos);
		}
		
		if (contrase�a==2007) {
			System.out.println("contrase�a correcta");
		}
			if(intentos==3) {
				System.out.println("usuario bloqueado");
			}
	
		
		
		}while (contrase�a != 2007 && intentos<3);
			
			
		
	
	}	
}
