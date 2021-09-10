package ejercicios.ordenamiento.vectores;

import java.util.Arrays;
import java.util.Scanner;

public class MainConsultorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectorString = new Scanner(System.in);
		Scanner lectorInt = new Scanner(System.in);
		int opcion;
		int posicion = 0;

		Paciente listadoPacientes[] = new Paciente[0];
		do {
			System.out.println();
			System.out.println("***********************");
			System.out.println("1. Registrar Paciente ");
			System.out.println("2. Imprimir reporte ");
			System.out.println("3. SALIR ");
			System.out.println("***********************");
			opcion = lectorInt.nextInt();

			if (opcion == 1) {
				// se crea array/vector temporal, con tamano +1 del original
				Paciente listadoTemporal[] = new Paciente[listadoPacientes.length + 1];
				// se establece el mismo tamano del temporal con el original
				for (int i = 0; i < listadoPacientes.length; i++) {
					listadoTemporal[i] = listadoPacientes[i];
				}
				System.out.println("***** Registro del paciente *****");
				System.out.print("Ingrese nombre del paciente: ");
				String nombre = lectorString.nextLine();
				System.out.print("Ingrese apellido del paciente: ");
				String apellido = lectorString.nextLine();
				System.out.print("Ingrese edad del paciente: ");
				int edad = lectorInt.nextInt();
				System.out.print("Ingrese síntoma del paciente: ");
				String sintoma = lectorString.nextLine();

				Paciente pacienteIngreso = new Paciente();
				pacienteIngreso.setNombre(nombre);
				pacienteIngreso.setApellido(apellido);
				pacienteIngreso.setEdad(edad);
				pacienteIngreso.setSintoma(sintoma);
				// rellenado del vector temporal
				listadoTemporal[posicion] = pacienteIngreso;
				// los valores del temporal van al original
				listadoPacientes = listadoTemporal;
				posicion++;

				System.out.println(Arrays.toString(listadoPacientes));
			}
			if (opcion == 2) {
				System.out.println("***** Reporte *****");
				Arrays.sort(listadoPacientes);
				for (int i = 0; i < listadoPacientes.length; i++) {

					System.out.println(listadoPacientes[i]);
				}
			}
		} while (opcion != 3);
		System.out.println("Gracias por usar el sistema");
		// System.out.println("listado final de estudiantes");
		// System.out.println(Arrays.toString(listadoPacientes));
	}
}
