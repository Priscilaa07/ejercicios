package ejer47;

import java.util.Arrays;
import java.util.Scanner;

public class ejer47 {
	/*
	 * Pedile a un usuario que ingrese las notas de un alumno, junto con su
	 * apellido. Utilizando el método array.lenght, limitá en el ‘for’ para ingresar
	 * esa cantidad deseada. Luego, copia el array creado para cargar las notas.
	 * Después, ordená la copia del array (con el método sort). Finalmente, mostrá
	 * en pantalla el array desordenado, y el array ordenado.
	 */

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		int[] notas = new int[4];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Ingrese sus notas: ");
			notas[i] = datos.nextInt();
		}
		int[] Copia_notas = notas.clone();
		
		Arrays.sort(notas);

		System.out.println("");
		
		System.out.println("Array de palabras ordenado:");
		for (int palabra : notas) {
			System.out.println(palabra);
		}

		System.out.println("");

	}
}