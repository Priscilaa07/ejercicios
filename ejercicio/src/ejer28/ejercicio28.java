package ejer28;

import java.util.Scanner;

public class ejercicio28 {
	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		int bateria = 100;
		/*
		 * Elaborar un programa, el cu�l indicar� cu�ndo la bater�a de un celular se
		 * est� agotando (en %). Para ello: � Recordar que la bater�a de un celular se
		 * mide en porcentaje (por ejemplo: 70% de bater�a). � Ingresar en el programa,
		 * NO por consola, que la bater�a comienza teniendo 100% (�no colocar el s�mbolo
		 * de �%� dentro de un int! Coloc� �nicamente el n�mero entero). � Mientras la
		 * bater�a sea tenga mas del 0%, y menos del 100%, el celular podr� funcionar. �
		 * Hac� que la bater�a disminuya de a 1%. Para esto, us� un contador. Recordar:
		 * para achicar de a 1 -> �variable � �� en vez de �variable + +�. � Mostrar en
		 * pantalla el valor de la bater�a, con una espera de 20ms (mili segundos) cada
		 * vez que disminuya 1%. � Al llegar al 20%, indicar por pantalla �Bater�a
		 * baja�. Esperar 1 segundo (1000 mili segundos) para indicar este mensaje. � Al
		 * acabarse la bater�a, indicar por pantalla �Bater�a agotada�.
		 */
		System.out.println("Carga Completa 100%");

		while (bateria > 0 && bateria <= 100) {
			System.out.println("Nivel de bateria: " + bateria);
			Thread.sleep(2000);
			if (bateria == 20) {
				Thread.sleep(1000);
				System.out.println("Bateria baja");

			}
			bateria--;
			if (bateria == 0) {
				System.out.println("Bateria agotada");

			}
		}
	}
}
