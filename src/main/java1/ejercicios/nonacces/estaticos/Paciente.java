package ejercicios.nonacces.estaticos;

public class Paciente {
	// variables estaticas
	private static String nacionalidad = "Ecuatoriano";
	private static int edadLimite = 65;
	// variable de instancia
	private String nombre;
	private int edad;

	public void registrar(String nombre) {
		System.out.println("Se registra el paciente: " + nombre);
	}

	private static void consultarNacionalidad() {
		System.out.println("");
	}

	public static void consultarNacionalidadStatica() {
		System.out.println("La nacionalidad es: " + nacionalidad);
	}

	// Metodos set y get
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
