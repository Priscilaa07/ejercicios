package ejer35;

import java.util.Scanner;

public class ejerci35 {
	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);
		/*
		 * Indicar a un profesor que cargue 5 calificaciones de un alumno. Hay que
		 * identificar: la nota mas baja, y la nota mas alta. Mostrar en pantalla ambas
		 * notas. Por último, hay que almacenar las notas cargadas por el profesor.
		 * Finalmente, a esta suma de notas hay que dividirla por 5, para obtener el
		 * promedio del alumno. Mostrar el promedio en pantalla.
		 */

		float nota, notamax = -300, notamin = 300;

		for (int calif = 0; calif <= 5; calif++) {
			System.out.println("Ingrese 5 notas de un alumno: ");
			nota = entrada.nextInt();

			if (nota > notamax) {

				notamax = nota;
			}

			if (nota < notamin) {

				notamin = nota;
			}
			
		}

		System.out.println("	La nota minimo es: " + notamin);
		System.out.println("	La nota maximo es: " + notamax);
	}

}