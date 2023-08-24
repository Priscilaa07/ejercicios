package ejerc32;

import java.util.Scanner;

public class ej32 {

	public static void main(String args[]) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);

		int limite = 20 , num , result;
		
		System.out.println("Indique el numero a multiplicar: ");
		num = entrada.nextInt();
		
		for ( int i = 1; i <= 20; i++) { 
			System.out.println("el resultado sera: ");
			result = num * i;
			System.out.println(num + " * " + i + " = " + result);
			Thread.sleep(1000);
		}
	
}
}
