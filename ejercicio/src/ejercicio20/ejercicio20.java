package ejercicio20;

import java.util.Scanner;

public class ejercicio20 {

	public static void main(String args[]) throws InterruptedException {

		int numero_seguidor = 1;

		while (numero_seguidor <= 100) {
			System.out.println("Seguidor numero: " + numero_seguidor);
			Thread.sleep(200);

			numero_seguidor++;
		}

		System.out.println("Lista completa.");
	}
}
