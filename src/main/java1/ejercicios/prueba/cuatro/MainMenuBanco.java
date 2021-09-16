package ejercicios.prueba.cuatro;

import java.util.Scanner;

public class MainMenuBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String claveIngresada;
		String opcionMenu;
		int saldoInicial = 2500;
		do {
			Scanner lectorString = new Scanner(System.in);
			Scanner lectorInt = new Scanner(System.in);
			System.out.println("Ingrese clave");
			claveIngresada = lectorString.nextLine();

			if (claveIngresada.equalsIgnoreCase("85DB")) {
				// Si
				do {
					System.out.println();
					System.out.println("*########################");
					System.out.println("BANCO PICHINCHA, elija una opción:");
					System.out.println("1. Consultar pagos ");
					System.out.println("2. Realizar transferencia ");
					System.out.println("3. SALIR ");
					System.out.println("#########################");
					opcionMenu = lectorString.nextLine();
					// } while (opcionMenu.equals("1") || opcionMenu.equals("2")); // Hacer mientras
					if (opcionMenu.equals("1")) {
						System.out.println("No tiene ningún pago pendiente");
					} else if (opcionMenu.equals("2")) {
						System.out.println("Ingrese cuenta de destino: ");
						String cuentaDestino = lectorString.nextLine();
						System.out.println("Ingrese el monto a transferir: ");
						int montoTransferir = lectorInt.nextInt();
						saldoInicial = saldoInicial - montoTransferir;
						System.out.println("Su nuevo saldo es: " + saldoInicial);
					}
				} while (!opcionMenu.equals("3")); // Hacer mientras
				// para salir del programa despues del menu claveIngresada="-1";
				// verificar claveIngresada no sea -1. Se recomienda reasignar variable
				claveIngresada = "0";
			} else {
				System.out.println("La clave no es correcta");
			}

			// clave ingresada
			// } while (claveIngresada != "-1");
			// No lee String correctamente
		} while (!claveIngresada.equals("-1"));
		System.out.println("Gracias por preferirnos");
	}
}
