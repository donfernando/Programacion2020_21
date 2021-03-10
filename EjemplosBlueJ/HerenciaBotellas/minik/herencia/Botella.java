package minik.herencia;

public class Botella {
    protected float capacidad;
    protected float contenido;
    protected boolean cerrada;
    protected static String unidades="litros";
    
    public Botella() {
        this(1,0);
    }
    
    public Botella(float capacidad) {
        this(capacidad,0);
    }

    public Botella(float capacidad, float liq) {
        if(capacidad<0.1f)
            throw new RuntimeException("Capacidad mínima debe ser 0.1 "+unidades);
        if(liq<0.0f || liq>capacidad)
            throw new RuntimeException("Esta botella solo acepta un contenido de entre 0 y "+capacidad);
        this.capacidad=capacidad;
        contenido=liq;
        cerrada=true;
    }
    
    public float getCapacidad() {
        return capacidad;
    }

    public float getContenido() {
        return contenido;
    }

    public void cerrar() {
        cerrada = true;
    }

    public void abrir() {
        cerrada = false;
    }

    public boolean estaCerrada() {
        return cerrada;
    }

    public boolean estaAbierta() {
        return !cerrada;
    }

    public boolean estaLlena() {
        return contenido == capacidad;
    }

    public boolean estaVacia() {
        return contenido == 0.0f;
    }

    public float meter(float liq) {
        float sobra = liq;
        if (!cerrada)
            if (contenido + liq <= capacidad) {
                sobra = 0;
                contenido += liq;
            } 
            else {
                sobra = contenido + liq - capacidad;
                contenido = capacidad;
            }
        return sobra;
    }

    public float extraer(float liq) {
        float saca = 0.0f;
        if (!cerrada) {
            if (liq <= contenido) {
                saca = liq;
                contenido -= liq;
            } else {
                saca = contenido;
                contenido = 0.0f;
            }
        }
        return saca;
    }

    public String toString() {
        // return "Botella["+contenido+" "+unidades+" , "+(cerrada?"cerrada":"abierta")+"]";
        return String.format("Botella %.1f %s[%.2f %s, %s]", capacidad, unidades, contenido, unidades, (cerrada ? "cerrada" : "abierta"));
    }
    
    
    @Override
    public boolean equals(Object obj) {
         if (this == obj) {
                return true;
         }
         if (obj instanceof Botella) {
             Botella laOtra = (Botella)obj;
            return capacidad==laOtra.capacidad && contenido==laOtra.contenido && cerrada==laOtra.cerrada;
         }
         return false;    
    }
}








