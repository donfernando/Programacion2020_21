package sieteymedia;

public class Carta {
	//public static enum Palo { PICA, TREBOL, DIAMANTE, CORAZON};
	
	public static class Palo {
		private int ordinal;
		
		protected Palo(int ordinal) {
			this.ordinal=ordinal;
		}
		public static Palo  PICA=  new Palo(0),
							TREBOL=new Palo(1),
							DIAMANTE= new Palo(2),
							CORAZON=  new Palo(3); 
		@Override
		public String toString() {
			String[] valores= {"PICA", "TREBOL", "DIAMANTE", "CORAZON"};
			return valores[ordinal];
		}
		public int ordinal() {
			return ordinal;
		}
		public static Palo[] values() {
			return new Palo[] {PICA,TREBOL,DIAMANTE,CORAZON};
		}
		
	}
	
	
	 private static String[] nombreCarta = {"AS", "2", "3", "4",
	                                               "5", "6", "7", "8",
	                                               "9", "10", "J", "Q",
	                                               "K"};
	 
	 private int valor;
	 private Palo palo;
	 
	 public Carta(int v, Palo p){
	  valor = v;
	  palo = p;
	 }
	 public int valor() {return valor;}
	 public Palo palo() {return palo;}
	 public String toString() {
	  return nombreCarta[valor-1] + " de " + palo;
	 }
	 
	}