package sieteymedia;

import java.util.Random;

public class Mazo {
	private static Random alea = new Random();
	private Carta[] mazo;
	private int numCartas;

	public Mazo() {
		mazo = new Carta[52]; // Creo el array de cartas.
		for (int n = 1; n < 13; n++) {
			for (Carta.Palo p : Carta.Palo.values()) {
				mazo[numCartas] = new Carta(n, p);
				numCartas++;
			}
		}
	}

	public void baraja() {
		for (int i = 0; i < numCartas; i++) {
			int r = alea.nextInt(numCartas);
			Carta c = mazo[i];
			mazo[i] = mazo[r];
			mazo[r] = c;
		}
	}

	public int numeroDeCartas() {
		return numCartas;
	}

	public Carta daCarta() {
		if (this.numeroDeCartas() == 0)
			throw new RuntimeException("No quedan cartas.");
		numCartas--;
		return mazo[this.numeroDeCartas()];
	}
}