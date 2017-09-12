package parcial1;
/**
 * 
 * @author Will
 * @version 1.0
 */
public class ImpChudnovsky implements Chudnovsky {
	double numerador = 0;
	double denominador = 0;
	double Pi = 0;
	int k = 0;
	long a =-262537412640768000L;
	/**
	 * @param cantNum limite de numeros decimales de pi
	 * @return Un integer con el valor de Pi
	 */
	public double calcularPi(int cantNum) {
		double operacion;
		if(k<cantNum) {
			numerador = (calcularFactorial(6*k)*((545140134*k)+(13591409)));
			denominador=calcularFactorial(3*k)*Math.pow((calcularFactorial(k)), 3)*Math.pow(a, k);
			k = k + 1;
			operacion = numerador/denominador;
			Pi = Pi + operacion;
			calcularPi(cantNum);
		}
		return Pi;
	}
	/**
	 * 
	 * @param num valor numerico del que se desea el factorial
	 * @return El factorial de num
	 */
	public int calcularFactorial(int num) {
		int a = 0;
		if(num == 0) {
			a = 1;
		}
		else if(num > 0) {
			a = num * calcularFactorial(num - 1);
		}
		return a;
	}
	
}
