package sieteymedia;

public class ManoSieteyMedia extends Mano{
	 public double cuentaPuntos() {
	  double puntos = 0;
	  for(int i = 0; i<numCartas; i++) {
	   puntos += cartas[i].valor();
	  }
	  return puntos;
	 }
	}
