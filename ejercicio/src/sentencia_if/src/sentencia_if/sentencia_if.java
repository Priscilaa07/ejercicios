package sentencia_if;

import java.util.Scanner;

public class sentencia_if {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);
		int Numero;
		String Nombre, Apellido;

		System.out.println("Ingrese su nombre: ");
		Nombre = entrada.next();
		System.out.println("Ingrese su apellido: ");
		Apellido = entrada.next();
		System.out.println("Ingrese un numero cualquiera del 0 al 99: ");
		Numero = entrada.nextInt();

		double numero = (Math.random() * 99);
		int resultado = (int) numero;

		if (Numero == resultado) {
			System.out.println("Ganaste");
		} 
		else {
			System.out.println("Perdiste");
		}
		
		System.out.println("El numero ganador es: "+resultado);

	}
}
