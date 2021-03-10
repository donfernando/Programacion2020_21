package gabriel.metropolitano;

import java.util.ArrayList;

public class VagonPasajeros {

    ArrayList<Pasajero> asientos;
    final int CAPACIDAD;

    public VagonPasajeros(int capacidad) {

        asientos = new ArrayList<Pasajero>(capacidad);
        CAPACIDAD = capacidad;
    }

    public void subir(Pasajero pasajero) throws RuntimeException {
        if (pasajero == null)
            throw new RuntimeException("Falta el pasajero (no se admite null)");
        if(pasajero.subido)
            throw new RuntimeException("El ya está subido...");            
        if (asientos.size() < CAPACIDAD) {
            asientos.add(pasajero);
            pasajero.subido=true;
        } else {
            throw new RuntimeException("No hay asientos libres");
        }
    }

    public Pasajero bajar(String nombre)  {
        // asientos.removeIf(p -> (p.getNombre().equals(nombre)));
        int i = 0;
        while (i < asientos.size() - 1 && !asientos.get(i).getNombre().equals(nombre))
            i++;
        if (!asientos.get(i).getNombre().equals(nombre))
            throw new RuntimeException("Ese pasajero nunca subio o no existe");
        asientos.get(i).subido=false;
        return asientos.remove(i);
    }
}

/*
 * VagonPasajeros que representa un vag�n de pasajeros,tendr� informaci�n sobre
 * los pasajeros que transporta o podr�a transportar. Tiene como atributo, una
 * tabla asientos que representa los asientos del tren, de modo que cada
 * elemento de la tabla puede estar libre u ocupada por un objeto pasajero. Sus
 * m�todos ser�n: VagonPasajeros(int capacidad) es el �nico constructor y recibe
 * el n�mero de asientos para crear la tabla que inicialmente esta vac�a. void
 * subir(Pasajero pasajero) acomoda al pasajero en el vag�n, los asientos se
 * llenan en orden seg�n lleguen pasajeros, si no hay asientos libres debe
 * lanzarse una excepci�n (RuntimeException). Pasajero bajar(String nombre)
 * recibe el nombre del pasajero que debe apearse, lo elimina del vag�n y
 * devuelve el objeto correspondiente.
 */