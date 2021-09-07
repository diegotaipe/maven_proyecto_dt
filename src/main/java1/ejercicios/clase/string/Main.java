package ejercicios.clase.string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in); // teclado
		// 1. contains
		String frase = "Programación de algoritmos módulo II";
		System.out.println("Ingrese el nombre del libro ");
		String libro = lector.nextLine();

		boolean resultado = frase.contains(libro);
		System.out.println(resultado);

		// 2. equals
		System.out.println("*************************************");
		String cadena1 = "diego";
		System.out.println("Ingrese la segunda cadena a comparar ");
		String cadena2 = lector.nextLine();
		boolean resultado2 = cadena1.equals(cadena2);
		System.out.println("¿Las cadenas son iguales?: " + resultado2);
		
		//3. y 4. toUpperCase | toLowerCase
		System.out.println("*************************************");
		String nombre = "Björn";
		String nombreEnMayuscula=nombre.toUpperCase();
		System.out.println("El nombre en mayúscula: "+nombreEnMayuscula);
		
		String nombre2 = "FRACIA";
		String nombreEnMinuscula=nombre2.toLowerCase();
		System.out.println("El nombre en mayúscula: "+nombreEnMinuscula);
		
	}

}
