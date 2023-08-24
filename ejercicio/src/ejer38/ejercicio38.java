package ejer38;

import java.util.Scanner;

public class ejercicio38 {

	public static void main(String[] args) {
		
		/*Se desea codear un programa que registre cada 2hs la cantidad máxima y
mínima de clientes de un local de ropa. El horario de trabajo es de 9hs a 19hs.*/ 
		
		Scanner entrada = new Scanner(System.in);
		
		float client, clientmax = -300, clientmin = 300;

		for (int registro = 0; registro <= 19; registro+=2) {
			System.out.println("Ingrese el numero de clientes entrantes al local:  ");
			client = entrada.nextInt();

			if (client > clientmax) {

				clientmax = client;
			}

			if (client < clientmin) {

				clientmin = client;
			}
			
		}

		System.out.println("	cliente minimo : " + clientmin);
		System.out.println("	cliente maximo : " + clientmax);
	}

}
		
		
		
		
		
		
		
		
	