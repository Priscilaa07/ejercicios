package ejercicio45;

import java.util.Scanner;

public class ejercicio45 {

public static void main(String[] args) {
Scanner datos = new Scanner(System.in);
String nombre[] = {"Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana"};
int num_socios[]= {1011, 2367, 8748, 9121, 817, 6423, 2034};

int busqueda;{
System.out.println("Para encontrar un individuo, ingrese el numero de socio: ");
busqueda= datos.nextInt();
}
for (int i = 0; i<7; i++) {


if (busqueda== num_socios[i]) {
	System.out.println("el socio "+nombre[i]+ " es: "+num_socios[i]);
}

}
	
	
	
}
}
