package ejercicios.seleccion.switchs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		// el switch hasta antes de la version 1.7 solo funcionaba para byte, short,
		// char e int
		String opcion;
		do {
			System.out.println("Escoja opción");
			System.out.println("1. Realizar transferencia");
			System.out.println("2. Consultar pagos");
			System.out.println("3. SALIR");
			opcion = lector.nextLine();

			switch (opcion) {
			case "1":
				System.out.println("Ingrese un número de cuenta");
				break;
			case "2":
				System.out.println("No existen pagos");
				break;
			case "3":
				System.out.println("Cerrando el sistema");
				break;

			default:
				System.out.println("No ha elegido ninguna opción válida");
				break;

			}
		} while (!opcion.equals("3"));
		System.out.println("Gracias por preferirnos");
	}
}
