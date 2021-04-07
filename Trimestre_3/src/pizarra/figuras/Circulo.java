package pizarra.figuras;

public class Circulo extends Elipse {
	public Circulo(int a, int b, int d) {
	  super(a,b,d,d); }	  
	public int compareTo(Circulo otro) {
		if(area()<otro.area())
			return -1;
		else if(area()>otro.area())
			return 1;
		else
			return 0;
	}
};

