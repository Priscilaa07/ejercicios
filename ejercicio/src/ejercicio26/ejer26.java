package ejercicio26;

import java.util.Scanner;


public class ejer26 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);	
		
		int contraseña=2007 , intentos=0;
		
		
		do {
			System.out.println("Ingrese una contraseña: ");
		contraseña= datos.nextInt();
		
		if(contraseña != 2007) {
		intentos++;
		System.out.println("Contraseña no permitida, vuelve a intentarlo");
		System.out.println("cantidad de intentos: "+intentos);
		}
		
		if (contraseña==2007) {
			System.out.println("contraseña correcta");
		}
			if(intentos==3) {
				System.out.println("usuario bloqueado");
			}
	
		
		
		}while (contraseña != 2007 && intentos<3);
			
			
		
	
	}	
}
