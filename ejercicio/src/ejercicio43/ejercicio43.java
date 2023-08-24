/*Generar un programa el cual almacene cinco números enteros. Si alguno de
	esos números es negativo, no debe mostrarse en pantalla.*/

package ejercicio43;

import java.util.Scanner;

public class ejercicio43 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		int[] numeros = new int[5];

		for (int i = 0; i <= 4; i++) {
			System.out.println("Ingrese un numero: ");
			numeros[i] = datos.nextInt();

			if (numeros[i] >= 0) {
				System.out.println("El numero es: " + numeros[i]);
			}
			if (numeros[i] < 0) {
				continue;
			}
		}

	}

}
