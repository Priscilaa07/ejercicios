package ejercicio25;
/*Vamos a molestar a un pap�. Para ello, vamos a generar un c�digo para un hijo,
el cual le pregunte constantemente ��puedo salir?�. Si la respuesta es NO (as�,
en may�sculas), el hijo le vuelve a realizar la pregunta. Si la respuesta es SI
(tambi�n en may�sculas), entonces el hijo deja de preguntar. Utilizar flags
(variable booleana) para resolver el ejercicio.*/

import java.util.Scanner;
public class ejer25 {
	
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);	
	
		char decision;
		boolean puedo_salir = false; 
	
		
		do {
			System.out.println("Puedo salir pa? (N/S): ");
			decision=datos.next().charAt(0);	
			if (decision=='S') {
				puedo_salir= true ;
			 }
		}
		while(decision=='N'&& puedo_salir == false);
			
		}
	
}