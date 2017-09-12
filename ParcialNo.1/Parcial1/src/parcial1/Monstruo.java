package parcial1;
/**
 * 
 * @author Will
 * @version 1.0
 */
public class Monstruo {
	private String nombre;
	private String elementoPrimario;
	private int edad;
	private String color;
	/**
	 * Metodo Constructor de Monstruo 
	 * @param nombre nombre del monstruo
	 * @param elementoPrimario elemnto del monstruo
	 * @param edad edad del monstruo
	 * @param color color del monstruo
	 */
	public Monstruo(String nombre, String elementoPrimario, int edad, String color) {
		super();
		this.nombre = nombre;
		this.elementoPrimario = elementoPrimario;
		this.edad = edad;
		this.color = color;
	}
	/**
	 * 
	 * @return nombre del monstruo
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre nombre que se le desea dar al monstruo
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return el elemento del monstruo
	 */
	public String getElementoPrimario() {
		return elementoPrimario;
	}
	/**
	 * 
	 * @param elementoPrimario elemnto que se le desea dar al monstruo
	 */
	public void setElementoPrimario(String elementoPrimario) {
		this.elementoPrimario = elementoPrimario;
	}
	/**
	 * Accion de agitarse del Monstruo
	 */
	public void agigantarse() {
		System.out.println("Soy "+getNombre()+" y me estoy agigantando");
	}
	/**
	 * Accion de caminar lento del Monstruo
	 */
	public void caminarLento() {
		System.out.println("Soy "+getNombre()+" y camino lento");
	}
	/**
	 * Accion de golpear del Monstruo
	 */
	public void golpear() {
		System.out.println("Soy "+getNombre()+" y estoy golpeando");
	}
}
