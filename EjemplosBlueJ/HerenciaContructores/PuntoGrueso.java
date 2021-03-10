public class PuntoGrueso extends PuntoAcotado {

    static int diametro = 5;


    public PuntoGrueso() {
	System.out.println(x);
    }    
    
    public void izq() {
        if (esvalido(x - diametro, y))
            x -= diametro;
    }

    public void der() {
        if (esvalido(x + diametro, y))
            x += diametro;
    }

    public void arr() {
        if (esvalido(x, y - diametro))
            y -= diametro;
    }

    public void abj() {
        if (esvalido(x, y + diametro))
            y += diametro;
    }

    public static int getDiametro() {
        return diametro;
    }

    public static void setDiametro(int d) {
        if (1 <= d && d <= 30)
            diametro = d;
    }
};