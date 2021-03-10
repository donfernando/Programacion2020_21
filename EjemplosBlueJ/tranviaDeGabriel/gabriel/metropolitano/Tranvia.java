package gabriel.metropolitano;

import java.util.ArrayList;

public class Tranvia {

    ArrayList<VagonPasajeros> vagones;

    public Tranvia() {
        this(4);
    }

    public Tranvia(int numVagones) {
        if(numVagones<1)
            throw new RuntimeException("El tranvía necesita al menos un vagón");            
        vagones = new ArrayList<VagonPasajeros>(numVagones);
        for (int i = 0; i < numVagones; i++) {
            vagones.add(new VagonPasajeros(3));
        }
    }

    public Pasajero bajar(String nombre, int vagon) {
        vagon--;
        Pasajero p;
        if (vagones.size() <= vagon || vagon < 0)
            throw new RuntimeException("Ese vagon no existe");
        int i = 0;
        try {
            p = vagones.get(vagon).bajar(nombre);
        } catch (RuntimeException x) {
            p = null;
        }
        return p;
    }

    public int subir(Pasajero p, int vagon) {
        vagon--;
        boolean subido = false;
        int i;
        if (vagones.size() <= vagon || vagon < 0) {
            throw new RuntimeException("Ese vagon no existe");
        }

        for (i = vagon; i < vagones.size() && !subido; i++) {
            try {
                vagones.get(i).subir(p);
                subido = true;
            } catch (RuntimeException e) {
            }
        }
        if (!subido)
            do {
                i=0;
                try {
                    vagones.get(i).subir(p);
                    subido = true;
                } catch (RuntimeException e) {
                }
                i++;
            } while(i < vagon && !subido);
        if (!subido)
            throw new RuntimeException("No hay Asientos Libres");
        return i;
    }
}
