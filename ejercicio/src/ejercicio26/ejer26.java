package ejercicio26;

import java.util.Scanner;


public class ejer26 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);	
		
		int contraseņa=2007 , intentos=0;
		
		
		do {
			System.out.println("Ingrese una contraseņa: ");
		contraseņa= datos.nextInt();
		
		if(contraseņa != 2007) {
		intentos++;
		System.out.println("Contraseņa no permitida, vuelve a intentarlo");
		System.out.println("cantidad de intentos: "+intentos);
		}
		
		if (contraseņa==2007) {
			System.out.println("contraseņa correcta");
		}
			if(intentos==3) {
				System.out.println("usuario bloqueado");
			}
	
		
		
		}while (contraseņa != 2007 && intentos<3);
			
			
		
	
	}	
}
