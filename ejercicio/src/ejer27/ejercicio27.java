package ejer27;
import java.util.Scanner;
public class ejercicio27 {
	

	public static void main(String[] args) {
	Scanner datos = new Scanner(System.in);	
	
	int contraseņa, intentos=0;
	boolean ingrese_contr=false;
	
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
		ingrese_contr=true;
	}
		if(intentos==3) {
			System.out.println("usuario bloqueado");
			ingrese_contr=true;
		}
    
	}while (contraseņa!=2007 && intentos <3 && ingrese_contr==false);
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
