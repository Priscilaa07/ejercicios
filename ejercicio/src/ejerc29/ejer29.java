package ejerc29;

public class ejer29 {

	public static void main(String args[]) throws InterruptedException {

		for (int bateria = 100; bateria <= 100 && bateria > 0; bateria--) {
			System.out.println("Nivel de bateria: " + bateria);
			Thread.sleep(50);

			if (bateria == 20) {
				System.out.println("BATERIA BAJA");
				Thread.sleep(2000);
			}

		}

		System.out.println("BATERIA AGOTADA");
	
	}

}
/* El programa que tiene menos lineas es el de for*/