package ejercio42;

import java.util.Scanner;

public class ejercicio42 {

/*• Creá un número aleatorio (random) entre 0 y 50. Si no te acordás como,
revisá la clase “math” en Java.
• Luego de crear el número aleatorio, pedile a una persona que ingrese
tres números.
• Si alguno de esos números coincide con el número aleatorio, indicale
que ganó. Si no, decile que perdió.*/
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