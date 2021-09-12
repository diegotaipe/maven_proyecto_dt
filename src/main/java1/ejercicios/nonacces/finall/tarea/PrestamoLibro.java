package ejercicios.nonacces.finall.tarea;

final public class PrestamoLibro extends CatalogoLibro {
	// atributo final
	private final String periodoDiasMaximoPrestamo = "15";

	public PrestamoLibro() {
		// un atributo final no puede ser reasignado
		System.out.println("aumentar periodo máximo de prestamo");
		periodoDiasMaximoPrestamo = "20";
		System.out.println("Error No es posible");
		//
	}

}
