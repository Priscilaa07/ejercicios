package ejercio42;

import java.util.Scanner;

public class ejercicio42 {

/*� Cre� un n�mero aleatorio (random) entre 0 y 50. Si no te acord�s como,
revis� la clase �math� en Java.
� Luego de crear el n�mero aleatorio, pedile a una persona que ingrese
tres n�meros.
� Si alguno de esos n�meros coincide con el n�mero aleatorio, indicale
que gan�. Si no, decile que perdi�.*/
	public static void main (String args []) {
		Scanner datos = new Scanner (System.in);
		
	double numeroAleatorio = (Math.random()*50); /*para que tire un numero ramdom*/
	
	int[]numero= new int[3];
	
	for(int i = 0 ; i<3; i++) {
		
		System.out.println("Ingrese numero : ");
		numero[i] = datos.nextInt();
		
		
		if(numero [i] == numeroAleatorio) {
		System.out.println("GANASTE");
		}
		else if(numero[i]!= numeroAleatorio) {
			System.out.println("PERDISTE");
			
	}
		System.out.println(numeroAleatorio); /*para mostrar el numero ramdom*/
}
}
}