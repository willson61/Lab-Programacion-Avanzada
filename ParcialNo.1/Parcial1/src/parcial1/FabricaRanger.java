package parcial1;
/**
 * 
 * @author Will
 *
 */
public interface FabricaRanger {
	public void hacerAlgo();
	public boolean apilar(Monstruo monstruo);
	public boolean desapilar(Monstruo monstruo);
	public boolean encolar(Monstruo monstruo);
	public boolean desencolar(Monstruo monstruo);
	public Monstruo fabricar(String elemento);
}
