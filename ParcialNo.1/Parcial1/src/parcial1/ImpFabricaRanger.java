package parcial1;
import java.util.Scanner;
/**
 * 
 * @author Will
 * @version 1.0
 */
public class ImpFabricaRanger implements FabricaRanger {
	public static final int CAPACITY = 10;
	//Estructura de cola para Monstruo
	private Monstruo[] monstruosCola;
	private int sizeCola = 0;
	private int f = 0;
	//Estructura de Pila para Monstruo
	private Monstruo[] monstruosPila;
	private int t = -1;
	/**
	 * 
	 * @param capacity Cpacidad de la pila y cola de monstruos
	 */
	public ImpFabricaRanger(int capacity) {
		monstruosCola = (Monstruo[]) new Object[capacity];
		monstruosPila = (Monstruo[]) new Object[capacity];
	}
	public void hacerAlgo(){
		
	}
	/**
	 * 
	 * @return un booleano que determina si la pila esta vacia o no
	 */
	public boolean pilaIsEmpty() {
		return (t == -1);
	}
	/**
	 * @param Monstruo que se desea guardar en la pila
	 * @return booleano que determina si se guardo o no el monstruo en la pila
	 */
	public boolean apilar(Monstruo monstruo) {
		if(t == monstruosPila.length) {
			return false;
		}
		else {
			monstruosPila[++t]=monstruo;
			return true;
		}
	}
	/**
	 * @param Monstruo que se desea sacar de la pila
	 * @return booleano que determina si se saco o no el monstruo en la pila
	 */
	public boolean desapilar(Monstruo monstruo) {
		if(pilaIsEmpty()) {
			return false;
		}
		for(int i = 0; i<= monstruosPila.length; i++) {
			if(monstruosPila[i].equals(monstruo)) {
				monstruosPila[t] = null;
				return true;
			}
		}
		return true;
	}
	/**
	 * @param Monstruo que se desea guardar en la cola
	 * @return booleano que determina si se guardo o no el monstruo en la cola
	 */
	public boolean encolar(Monstruo monstruo) {
		if(sizeCola != monstruosCola.length) {
			int available = (f + sizeCola) % monstruosCola.length;
			monstruosCola[available] = monstruo;
			sizeCola++;
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * @param Monstruo que se desea sacar de la cola
	 * @return booleano que determina si se saco o no el monstruo en la cola
	 */
	public boolean desencolar(Monstruo monstruo) {
		if(sizeCola == 0) {
			return false;
		}
		else {
			Monstruo monstruoFuera = monstruosCola[f];
			monstruosCola[f] = null;
			f = (f + 1) % monstruosCola.length;
			sizeCola--;
			return true;
		}
	}
	/**
	 * @param String del elemento del monstruo que se desea crear
	 * @return Monstruo creado
	 */
	public Monstruo fabricar(String elemento) {
		String nombre, elementoprimario, color;
		int edad;
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese le nombre del monstruo");
		nombre=ingreso.next();
		System.out.println("Ingrese el color del monstruo");
		color = ingreso.next();
		System.out.println("Ingrese la edad del monstruo");
		edad = ingreso.nextInt();
		if(elemento.equals("Aire")) {
			Monstruo m1 = new MonstruoAire(nombre, elemento, edad, color);
			return m1;
		}
		else if(elemento.equals("Fuego")) {
			Monstruo m1 = new MonstruoFuego(nombre, elemento, edad, color);
			return m1;
		}
		else {
			Monstruo m1 = new Monstruo(nombre, elemento, edad, color);
			return m1;
		}
	}
}
