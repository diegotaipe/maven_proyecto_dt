package ejercicios.nonacces.finall.tarea;

public class CatalogoLibro {
	private String autor;
	private String ISBN;
	private String editorial;
	private String paginas;

	// metodo final No puede ser cambiado/reasignado posteriormente
	protected final void materialAceptado() {
		System.out.println("Se acepta material bibliográfico científico");
	}

}
