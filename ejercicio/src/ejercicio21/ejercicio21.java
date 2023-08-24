package ejercicio21;

import java.util.Scanner;

public class ejercicio21 {
	public static void main(String args[]) throws InterruptedException{
		
  int temp=35;
		System.out.println("Se registro 35° grados en el microprocesador");
		
  while (temp < 100) {
	  System.out.println("Temperatura: "+ temp);
	  Thread.sleep(500);

	 temp+=2; 
    
	  if (temp==85) {
		  System.out.println("CUIDADO!, TEMPERATURA PELIGROSA");
		  Thread.sleep(1000);
	  }
	  
	  if (temp >100) {
		  System.out.println("VALOR EXTREMO , APAGANDO PC");
	  }
	  

	}
	}
}
