package ejer34;

import java.util.Scanner;

public class ejer34 {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		/*
		 * Pedir a un usuario los ingresos del último año, mes por mes (por ende, 12
		 * meses), de su empresa de zapatillas. Si hay algún mes en el cual el ingreso
		 * sea menor a $100000, indicar por pantalla que, por lo menos en un mes, hubo
		 * un ingreso menor a $100000.
		 */

		int enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre;
       
		System.out.println("ingreso mes de enero:");
		enero = entrada.nextInt();
		if (enero < 100000 ) {
			System.out.println("hubo un ingreso menor a $10000");
		}
		System.out.println("ingreso mes de febrero:");
		febrero = entrada.nextInt();
		if (febrero < 100000 ) {
			System.out.println("hubo un ingreso menor a $10000");
		}
		System.out.println("ingreso mes de marzo:");
		marzo = entrada.nextInt();
		if (marzo < 100000 ) {
			System.out.println("hubo un ingreso menor a $10000");
		}
		System.out.println("ingrese mes de abril: ");
		abril= entrada.nextInt();
		if (abril < 100000 ) {
			System.out.println("hubo un ingreso menor a $10000");
		}
		System.out.println("ingreso mes de mayo:");
		mayo = entrada.nextInt();
		if (mayo < 100000 ) {
			System.out.println("hubo un ingreso menor a $10000");
		}
		
		System.out.println("ingreso mes de junio:");
		junio = entrada.nextInt();
		if (junio < 100000 ) {
			System.out.println("hubo un ingreso menor a $10000");
		}
		
		System.out.println("ingreso mes de julio:");
		julio = entrada.nextInt();
		if (julio < 100000 ) {
			System.out.println("hubo un ingreso menor a $10000");
		}
		
		System.out.println("ingreso mes de agosto:");
		agosto = entrada.nextInt();
		if (agosto < 100000 ) {
			System.out.println("hubo un ingreso menor a $10000");
		}
		
		System.out.println("ingreso mes de septiembre:");
		septiembre = entrada.nextInt();
		if (septiembre < 100000 ) {
			System.out.println("hubo un ingreso menor a $10000");
		}
		
		System.out.println("ingreso mes de octubre:");
		octubre = entrada.nextInt();
		if (octubre < 100000 ) {
			System.out.println("hubo un ingreso menor a $10000");
		}
	
		System.out.println("ingreso mes de noviembre:");
		noviembre = entrada.nextInt();
		if (noviembre < 100000 ) {
			System.out.println("hubo un ingreso menor a $10000");
		}
	
		System.out.println("ingreso mes de diciembre:");
		diciembre = entrada.nextInt();

		if (diciembre < 100000 ) {
			System.out.println("hubo un ingreso menor a $10000");
		}
		

	
		}
	}

