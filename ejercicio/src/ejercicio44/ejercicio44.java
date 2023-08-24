/*Hay que armar un programa que guarde cuatro números DNI. Luego de
guardar esos DNI, hay que mostrar en pantalla únicamente los números pares.*/

package ejercicio44;

import java.util.Scanner;

public class ejercicio44 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		int numero[] = new int[4];

		for (int i = 0; i < 4; i++) {
			System.out.println("Ingrese el DNI: ");
			numero[i] = datos.nextInt();

			if (numero[i] % 2 == 0) {
				System.out.println("El DNI " + numero[i] + " es par");
			}
		}
	}

}
