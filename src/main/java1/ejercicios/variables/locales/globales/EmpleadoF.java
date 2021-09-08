package ejercicios.variables.locales.globales;

public class EmpleadoF {
	// Variables Globales
	public String nombre;
	public String apellido;
	public String diagnostico;
	private String cedula;
	private String medicacion;
	public static String PAIS="Ecuador";
	public static String PROVINCIA="Pichincha";

	public void comer() {
		// Variables Locales
		// solo existen dentro del método
		String desayuno;
		String almuerzo;
		this.apellido = "Frias";
		this.cedula = "0635263541";
		this.diagnostico = "Saludable";

	}

	public void descansar() {
		// Variables Locales
		// solo existen dentro del método
		String hora = "primera";
		this.apellido = "Frias";
		this.cedula = "0635263541";

	}
}
