package pizarra.figuras;


import java.awt.Graphics;
import java.awt.Color;

public class LogoOlimpico extends Figura{
	protected int diametroAros;
	protected int separacionAros;
	AroColor[] aros=new AroColor[5];

	public LogoOlimpico(int a, int b, int d){
		super(a,b);
		separacionAros=-d*1/5;
		diametroAros=d;
		
		aros[0]=new AroColor(0,0,d,Color.blue);
		aros[1]=new AroColor(diametroAros+separacionAros,0,d,Color.black);
		aros[2]=new AroColor(2*diametroAros+2*separacionAros,0,d,Color.red);
		
		aros[3]=new AroColor((diametroAros+separacionAros)/2,  diametroAros+separacionAros,d,Color.yellow);
		aros[4]=new AroColor((diametroAros+separacionAros)*3/2,diametroAros+separacionAros,d,Color.green);
	}
	
  public float area(){
  	return -1;
  }
  
  public float perimetro(){
  	return -1;
  }
  public int alto(){
  	return 2*diametroAros+separacionAros;
  }
  public int ancho(){
  	return 3*diametroAros+2*separacionAros;
  }
  public void dibujar(Graphics g){
		int i;
		int xOrig,yOrig;
		
		for(i=0;i<5;i++) {
			xOrig=aros[i].posicion.x;
			aros[i].posicion.x+=posicion.x;
			yOrig=aros[i].posicion.y;
			aros[i].posicion.y+=posicion.y;
			aros[i].dibujar(g);
			aros[i].posicion.x=xOrig;
			aros[i].posicion.y=yOrig;
		}
  }
};

