
public class Coordenada {
	private float x,y;

	public Coordenada() {
		x=y=1.0f;
		//this(1.0f,1.0f);
	}

	public Coordenada(float x, float y) {
		this.x=x;
		this.y=y;
	}
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

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
		return new Coordenada(x + q.x , y + q.y);
	}
	
	public Coordenada resta(Coordenada q){
		return new Coordenada(x - q.x , y - q.y);
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
