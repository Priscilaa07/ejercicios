package ordenamiento_burbuja;

public class ordenamiento_burbuja_strings {
	public static void main(String[] args) {
		String[] palabras = { "zorro", "perro", "gato", "elefante" };

		// Mostrar la lista desordenada
		System.out.println("Lista desordenada:");
		for (String palabra : palabras) {
			System.out.print(palabra + " ");
		}

		// Aplicar el algoritmo de ordenamiento burbuja
		
		for (int i = 0; i < palabras.length - 1; i++) {
			for (int j = 0; j < palabras.length - i - 1; j++) {
				if (palabras[j].compareTo(palabras[j + 1]) > 0) {
					// Intercambiar las palabras
					String temp = palabras[j];
					palabras[j] = palabras[j + 1];
					palabras[j + 1] = temp;
				}
			}
		}

		// Mostrar la lista ordenada
		System.out.println("\nLista ordenada:");
		for (String palabra : palabras) {
			System.out.print(palabra + " ");
		}
	}
}

package ejercicio46;

import java.util.Scanner;

public class ejercicio46 {
	
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		int nombre, apellido;
		int []notas = new int [0];
		
		
		System.out.println("Ingrese su nombre: ");
		nombre=datos.nextInt();
		System.out.println("Ingrese su apellido: ");
		apellido=datos.nextInt();
		
	for(int i = 0; i < notas.length -1; i++ ) {
       for(int j = 0; j < notas.length - i - 1; j++){
    	   
			
		}
	}
		
		
	}

}

