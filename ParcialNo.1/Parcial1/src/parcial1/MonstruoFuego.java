package parcial1;
/**
 * 
 * @author Will
 * @version 1.0
 */
public class MonstruoFuego extends Monstruo{
	/**
	 * Metodo Constructor del Monstruo de Fuego
	 * @param nombre
	 * @param elementoPrimario
	 * @param edad
	 * @param color
	 */
	public MonstruoFuego(String nombre, String elementoPrimario, int edad, String color) {
		super(nombre, elementoPrimario, edad, color);
		setElementoPrimario("Fuego");
	}
	/**
	 * Accion de quemar del monstruo de fuego
	 */
	public void quemar() {
		System.out.println("Soy "+getNombre()+" y estoy quemado");
	}
	
}
