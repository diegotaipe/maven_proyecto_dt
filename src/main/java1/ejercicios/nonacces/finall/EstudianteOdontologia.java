package ejercicios.nonacces.finall;

public class EstudianteOdontologia extends EstudianteMedicina {
//Un est. de odontologia es un estudiante de medicina==SI

	// Sobreescribiendo el metodo del padre

	// NO se puede SOBREESCRIBIR un metodo final del padre
	protected void realizarPracticas() {
		System.out.println("Realiza 100 horas de prácticas");
	}

	// sobreescribiendo un metodo con la misma firma
	protected void realizarPasantias() {
		System.out.println("Realiza 200 horas de pasantías");
	}
}
