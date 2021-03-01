package minik.metropolitano;

public class VagonPasajeros {

    private Pasajero[] asientos;
    private int asientosOcupados;

    VagonPasajeros(int capacidad) {
        if (capacidad < 1)
            throw new RuntimeException();
        asientos = new Pasajero[capacidad];
    }

    public void subir(Pasajero pasajero) {
        if (pasajero == null)
            throw new RuntimeException("No se acepta pasajero null");
        if (asientosOcupados == asientos.length)
            throw new RuntimeException("Vagón completo");
        asientos[asientosOcupados] = pasajero;
        asientosOcupados++;
    }

    public Pasajero bajar(String nombre) {
        if(nombre==null || nombre.length()==0)
            throw new RuntimeException("El nombre facilitado del pasajero no es válido");
        if (asientosOcupados==0)
            throw new RuntimeException("Nadie se pude bajar por estar el vagón vacío");
        int i = 0;
        Pasajero p = null;
        while (i < asientos.length - 1 && !(asientos[i].getNombre().equals(nombre)))
            i++;
        if (asientos[i].getNombre().equals(nombre)) {
            p = asientos[i];
            asientos[i] = asientos[asientosOcupados - 1];
            asientos[asientosOcupados - 1] = null;
            asientosOcupados--;
        }
        return p;
    }
}