package ejercicios.nonacces.finall;

public final class EstudianteCiencias extends Estudiante {
	private String velocidadInternet;

	// atributo, variable final no puede ser reasignado
	public final String horarioEntrada = "08:00";
	public String ciudadNacimiento = "Quito";

	// constructor siempre public, sin retorno
	public EstudianteCiencias() {
		// no se puede reasignar un valor a un atributo final
		horarioEntrada = "08:30";
		ciudadNacimiento = "Guayaquil";
	}
}
