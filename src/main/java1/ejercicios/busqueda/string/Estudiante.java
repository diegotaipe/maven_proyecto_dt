package ejercicios.busqueda.string;

public class Estudiante {
	private String cedula;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "Estudiante [cedula=" + cedula + "]";
	}

}
