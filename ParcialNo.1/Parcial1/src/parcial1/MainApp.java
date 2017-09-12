package parcial1;

public class MainApp {

	public static void main(String[] args) {
		int cantDecimal = 4;
		Chudnovsky numPi = new ImpChudnovsky();
		System.out.println("El numero pi con "+cantDecimal+" decimales es "+numPi.calcularPi(cantDecimal));

	}

}
