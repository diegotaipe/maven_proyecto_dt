package ejercicios.nonacces.finall.tarea;

public class IngresoLibro extends CatalogoLibro {
	private String numeroEjemplares;

//Error: un m�todo final con la misma firma no puede ser modificado o reasignado
	protected void materialAceptado() {
		System.out.println("Aceptar revistas de farandula");
		System.out.println("Error. no posee autorizaci�n para aceptar este tipo de material");
	}

}
