package ejercicios.busqueda.string;

import java.util.Arrays;
import java.util.Scanner;

public class MainEstudiante extends Estudiante{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectorString = new Scanner(System.in);
		Scanner lectorInt = new Scanner(System.in);
		int n = 0;
		String buscar;

		String listadoEstudiantes[] = new String[5]; // declarar array

		do {
			int contador = 1;
			System.out.println();
			System.out.println("***********************");
			System.out.println("1. Ingresar Estudiante ");
			System.out.println("2. Buscar Estudiante ");
			System.out.println("3. SALIR ");
			System.out.println("***********************");
			
			n = lectorInt.nextInt();

			if (n == 1) {
				System.out.println("***** Ingresar Estudiante *****");
				System.out.println("Ingrese cédula del estudiante: ");
				for (int i = 0; i < 5; i++) {
					System.out.print("estudiante " + contador + " : ");
					contador++;
					listadoEstudiantes[i] = lectorString.nextLine();
				}
				System.out.println(Arrays.toString(listadoEstudiantes));
			}
			if (n == 2) {
				System.out.println("***** Buscar Estudiante *****");
				System.out.println("Ingrese cédula del estudiante: ");
				buscar = lectorString.nextLine();

				for (int i = 0; i < 5; i++) {
					boolean resultado = buscar.equals(listadoEstudiantes[i]);

					if (resultado == true) {
						System.out.println("SI CONTIENE al estudiante: " + buscar);
					} else {
						//System.out.println("NO CONTIENE al estudiante: " + buscar);
					}
				}
			}
		} while (n != 3);
		System.out.println("listado final de estudiantes");
		System.out.println(Arrays.toString(listadoEstudiantes));
	}

}
