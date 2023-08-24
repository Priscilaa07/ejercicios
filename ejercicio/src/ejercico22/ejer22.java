package ejercico22;

import java.util.Scanner;

public class ejer22 {
	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);
		int Numero;

		System.out.println("Ingrese un numero: ");
		Numero = entrada.nextInt();
		
		double numero = (Math.random() * 99);
		int resultado = (int) numero;

		if (Numero == resultado) {
			System.out.println("Ganaste");
		} 
		else {
			System.out.println("Perdiste");
			System.out.println("Ingrese un numero: ");
			Numero = entrada.nextInt();
		}
		
		System.out.println("El numero ganador es: "+resultado);

	}

}
