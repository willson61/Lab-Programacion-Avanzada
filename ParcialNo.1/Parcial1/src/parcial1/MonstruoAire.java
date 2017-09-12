package parcial1;
/**
 * 
 * @author Will
 * @version 1.0
 */
public class MonstruoAire extends Monstruo {
	/**
	 * Metodo constructor del Monstruo de Aire
	 * @param nombre
	 * @param elementoPrimario
	 * @param edad
	 * @param color
	 */
	public MonstruoAire(String nombre, String elementoPrimario, int edad, String color) {
		super(nombre, elementoPrimario, edad, color);
		setElementoPrimario("Aire");
	}
	/**
	 * Accion de volar del Monstruo de Aire
	 */
	public void volar() {
		System.out.println("Soy "+getNombre()+" y estoy volando");
	}
	
}
