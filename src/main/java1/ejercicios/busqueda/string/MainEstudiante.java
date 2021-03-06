package ejercicios.busqueda.string;

import java.util.Arrays;
import java.util.Scanner;

public class MainEstudiante extends Estudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectorString = new Scanner(System.in);
		Scanner lectorInt = new Scanner(System.in);
		int n = 0;
		String buscar;
		int posicion = 0;

		Estudiante listadoEstudiantes[] = new Estudiante[5]; // declarar array

		do {
			System.out.println();
			System.out.println("***********************");
			System.out.println("1. Ingresar Estudiante ");
			System.out.println("2. Buscar Estudiante ");
			System.out.println("3. SALIR ");
			System.out.println("***********************");
			n = lectorInt.nextInt();

			if (n == 1) {
				System.out.println("***** Ingresar Estudiante *****");
				System.out.println("Ingrese c?dula del estudiante: ");
				String cedula = lectorString.nextLine();
				Estudiante estudiante1 = new Estudiante();
				estudiante1.setCedula(cedula);
				listadoEstudiantes[posicion] = estudiante1;
				posicion++;
				System.out.println(Arrays.toString(listadoEstudiantes));
			}
			if (n == 2) {
				System.out.println("***** Buscar Estudiante *****");
				System.out.println("Ingrese c?dula del estudiante: ");
				buscar = lectorString.nextLine();
				boolean resultado=false;
				
				for (int i = 0; i < 5; i++) {
					Estudiante estudiante = listadoEstudiantes[i];
					String cedula = estudiante.getCedula();
					boolean resultadoLocal = buscar.equals(cedula);

					if (resultadoLocal == true) {
						resultado=true;
					}
				}
				if(resultado==true) {
					System.out.println("Estudiante encontrado: ");
				}else {
					System.out.println("Estudiante No encontrado");
				}
			}
		} while (n != 3);
		System.out.println("listado final de estudiantes");
		System.out.println(Arrays.toString(listadoEstudiantes));
	}
}
