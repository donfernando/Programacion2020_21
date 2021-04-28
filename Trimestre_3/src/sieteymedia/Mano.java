package sieteymedia;

public abstract class Mano{
	 protected Carta[] cartas;
	 protected int numCartas;
	 static final int TOPE = 20;
	 public Mano() {
	  numCartas = 0;
	  cartas = new Carta[TOPE];
	 }
	 
	 public Mano(int num) {
	  cartas = new Carta[num];
	  numCartas = 0;
	 }
	 
	 public void descartaTodas() {
	  numCartas = 0;
	 }
	 
	 public void agnadeCarta(Carta c) {
	  if(numCartas >= TOPE) 
	               throw new RuntimeException("No puedes añadir mas cartas");
	  cartas[numCartas] = c;
	  numCartas ++;
	 }
	 
	 public int numeroDeCartas() { 
	  return numCartas;
	 }
	 
	 public abstract double cuentaPuntos();
	 
	 public String toString() {
	  String std = "";
	  for(int i = 0; i < numCartas; i++) {
	   std = std + " "+ cartas[i];
	  }
	  return std;
	 }
	}