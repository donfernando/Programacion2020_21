package figuras;

import 
java.awt.Graphics
;

public class Casita extends Figura {
    
    TrianguloEquilatero tejado;
    Cuadrado muros;

    public Casita(int a, int b, int d) {
        super(a, b);

        tejado = new TrianguloEquilatero(a, b, d);
        muros = new Cuadrado(a, b+tejado.alto(), d);
    }

    @Override
    public float area() {
        // TODO Auto-generated method stub
        return tejado.area()+muros.area();
    }

    @Override
    public float perimetro() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int alto() {
        // TODO Auto-generated method stub
        return muros.alto()+tejado.alto();
    }

    @Override
    public int ancho() {
        // TODO Auto-generated method stub
        return muros.ancho();
    }

    @Override
    public void dibujar(Graphics g) {
        muros.dibujar(g);
        tejado.dibujar(g);
    }

}