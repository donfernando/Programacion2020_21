package minik.herencia;

public class Botella1L extends Botella {

    public Botella1L() {
    }

    public Botella1L(float liq) {
        super(1,liq);
    }

    @Override
    public String toString() {
        return String.format("Botella1L[%.2f %s, %s]", contenido, unidades, (cerrada ? "cerrada" : "abierta"));

    }
}
