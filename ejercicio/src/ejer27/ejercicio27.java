package ejer27;
import java.util.Scanner;
public class ejercicio27 {
	

	public static void main(String[] args) {
	Scanner datos = new Scanner(System.in);	
	
	int contraseña, intentos=0;
	boolean ingrese_contr=false;
	
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
		ingrese_contr=true;
	}
		if(intentos==3) {
			System.out.println("usuario bloqueado");
			ingrese_contr=true;
		}
    
	}while (contraseña!=2007 && intentos <3 && ingrese_contr==false);
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
