package ejercicio46;

import java.util.Scanner;

public class ejer46 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		String nombre[] = { "Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana" };
		int num_socios[] = { 1011, 2367, 8748, 9121, 817, 6423, 2034 };

		
		
		for (int i = 0; i < 7; i++) {
     
			if (num_socios[i] %2 == 0 ) {
				continue;
			}
			System.out.println("el socio " + nombre[i] + " es: " + num_socios[i]);
		}

	}
}
