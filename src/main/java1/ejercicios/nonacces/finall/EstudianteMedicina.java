package ejercicios.nonacces.finall;

public class EstudianteMedicina extends Estudiante {
//un estudiante de medicina es un estudiante == SI| correcto
	private String codigoMSP;

	protected final void realizarPracticas() {
		System.out.println("Realiza 50 horas de prácticas");
	}

	protected void realizarPasantias() {
		System.out.println("Realizar 100 horas de pasantías");
	}
}
