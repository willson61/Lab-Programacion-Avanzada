package parcial1;
/**
 * 
 * @author Will
 * @version 1.0
 */
public class ImpReportero implements Reportero{
	public String calcularGanador(int a, int b) {
		int c = 0;
		if((a>5)&&(b>5)) {
			if(b==(a-1) && (a<=7)) {
				return "El jugador A fue el ganador";
			}
			else if(a==(b-1) && (b<=7)) {
				return "EL jugador B fue el ganador";
			}
			else if(b==(a-2) && (a<=7)) {
				return "El jugador A fue el ganador";
			}
			else if(a==(b-2) && (b<=7)) {
				return "EL jugador B fue el ganador";
			}
		}
		else if(((a>6) && (b>6))){
			if(b==(a-1) && (a<=7)) {
				return "El jugador A fue el ganador";
			}
			else if(a==(b-1) && (b<=7)) {
				return "EL jugador B fue el ganador";
			}
		}
		else {
			if((a==6) && (b<a)) {
				return "El jugador A fue el ganador";
			}
			else if((b==6) && (a<b)) {
				return "El jugador B fue el ganador";
			}
		}
		if(((a<6) && (b<6))&&((a!=b))) {
			return "El set todavia no termina";
		}
		else if((a>7) || (b>7)) {
			return "Ingreso invalido";
		}
		else if(((a>6)&&(b<6))||((b>6)&&(a<6))) {
			return "Ingreso invalido";
		}
		else {
			return "Ingreso invalido";
		}
	}
	public String calcularCampeon() {
		return " ";
	}
	public String recordarGanador(int juego) {
		return "";
	}
}
