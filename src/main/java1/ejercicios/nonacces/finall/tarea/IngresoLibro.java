package ejercicios.nonacces.finall.tarea;

public class IngresoLibro extends CatalogoLibro {
	private String numeroEjemplares;

//Error: un método final con la misma firma no puede ser modificado o reasignado
	protected void materialAceptado() {
		System.out.println("Aceptar revistas de farandula");
		System.out.println("Error. no posee autorización para aceptar este tipo de material");
	}

}
