
public class Coordenada {
	public float x,y;

	public static Coordenada[] generaPuntos(){
	    Coordenada[] aux = new Coordenada[2];
	    aux[0]=new Coordenada();
	    aux[1]=new Coordenada();
	    aux[0].x=8;
	    aux[0].y=5;
	    aux[1].x=10;
	    aux[1].y=10;
	    return aux;
	}
	
	public Coordenada suma(Coordenada q) {
		Coordenada aux;
		aux = new Coordenada();
		aux.x = x + q.x;
		aux.y = y + q.y;
		return aux;
	}
	public Coordenada resta(Coordenada q){
		Coordenada aux;
		aux = new Coordenada();
		aux.x = x -q.x;
		aux.y = y -q.y;	
		return aux;
	}
	public float distancia(){	
		return (float) Math.sqrt((x*x)+(y*y));
	}
	public float distancia(Coordenada o){	
		float c1,c2;
		c1=x-o.x;
		c2=y-o.y;
		return (float) Math.sqrt((c1*c1)+(c2*c2));
	}
	public String toString(){
		return "("+x+','+y+')';
	}
	
}
