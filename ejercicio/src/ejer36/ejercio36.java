/*Nuevamente, Cloty te pide ayuda. Ella quiere analizar en su horario de trabajo
    (de 8hs a 17hs) cuánto le ingresa en total por cada hora, y finalmente, quiere
  saber en qué hora obtuvo mas ingresos, y en qué hora obtuvo menos ingresos.
   Mostrale en pantalla entonces a qué hora tuvo la ganancia máxima, y a qué
  hora obtuvo la ganancia mínima.
  Por último, mostrale en pantalla el ingreso total.*/ 
     package ejer36;
 
    import java.util.Scanner;

    public class ejercio36 {
	
	public static void main(String args[]){
		
		Scanner entrada = new Scanner(System.in);
		
		float mont, montmax = -300, montmin = 300;
		
	    for (int hora = 8; hora <= 17 ; hora++) {
			
		System.out.println("Ingrese el monto recaudado: ");
		mont = entrada.nextInt();
		
		if (mont > montmax) {
			
			montmax = mont;
		}
			

		if (mont < montmin) {

			montmin = mont;
		}


			
		}
	    System.out.println("El monto minimo es: " + montmin);
		System.out.println("El monto maximo es: " + montmax);
		
	}
	
}
