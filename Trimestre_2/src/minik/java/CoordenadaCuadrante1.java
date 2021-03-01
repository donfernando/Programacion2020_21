package minik.java;

public class CoordenadaCuadrante1 {
	private float x,y;
	

	public float getX() {
		return x;
	}

	public void setX(float x) {
		if(x>=0)
			this.x = x;
	}

	public float getY() {
		return y;
	}
	public void setY(float y1) {
		if(y1>=0)
			y = y1;
	}

	public static CoordenadaCuadrante1 masCerca(CoordenadaCuadrante1[] puntos) {
		int posMin=0;
		int i;
		for (i = 1; i < puntos.length; i++) {
			if(puntos[posMin].distancia() > puntos[i].distancia())
				posMin=i;
		}
		return puntos[posMin];
	}
	
	public CoordenadaCuadrante1 suma(CoordenadaCuadrante1 q) {
		CoordenadaCuadrante1 aux;
		aux = new CoordenadaCuadrante1();
		aux.x = x + q.x;
		aux.y = y + q.y;
		return aux;
	}
	public CoordenadaCuadrante1 resta(CoordenadaCuadrante1 q){
		CoordenadaCuadrante1 aux;
		if(x<q.x || y<q.y)
			throw new RuntimeException();
		aux = new CoordenadaCuadrante1();
		aux.x = x -q.x;
		aux.y = y -q.y;	
		return aux;
	}
	public float distancia(){	
		return (float) Math.sqrt((x*x)+(y*y));
	}
	public float distancia(CoordenadaCuadrante1 o){	
		float c1,c2;
		c1=x-o.x;
		c2=y-o.y;
		return (float) Math.sqrt((c1*c1)+(c2*c2));
	}
	public String toString(){
		return "("+x+','+y+')';
	}
	
}
