/*Nuevamente, Cloty te pide ayuda. Ella quiere analizar en su horario de trabajo
    (de 8hs a 17hs) cu�nto le ingresa en total por cada hora, y finalmente, quiere
  saber en qu� hora obtuvo mas ingresos, y en qu� hora obtuvo menos ingresos.
   Mostrale en pantalla entonces a qu� hora tuvo la ganancia m�xima, y a qu�
  hora obtuvo la ganancia m�nima.
  Por �ltimo, mostrale en pantalla el ingreso total.*/ 
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
