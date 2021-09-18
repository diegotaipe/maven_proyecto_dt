package ejercicios.colection.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer numero1 = 1;
		Integer numero2 = 4;
		Integer numero3 = 8;
		Integer numero4 = 20;

		// ctrl + shift + o java.util.list
		List<Integer> listaNueva = new ArrayList<Integer>();
		// lista de Integers
		listaNueva.add(numero1);
		listaNueva.add(numero2);
		listaNueva.add(numero3);
		listaNueva.add(numero4);

		// impresion lista
		System.out.println(listaNueva);

	}

}
