
public class Coordenada {
	public float x,y;
	
	public static Coordenada masCerca(Coordenada[] puntos) {
		int posMin=0;
		int i;
		for (i = 1; i < puntos.length; i++) {
			if(puntos[posMin].distancia() > puntos[i].distancia())
				posMin=i;
		}
		return puntos[posMin];
	}
	
	public Coordenada suma(Coordenada q) {
		Coordenada aux;
		int x=0;
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
