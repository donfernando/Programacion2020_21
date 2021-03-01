package minik;

public class TablaDeStrings {
    private String[] datos;
    private int size;
    private int modCount;
    public final static int TAM_INI=10;
    public final static int TAM_CREC=10;

    public TablaDeStrings() {
        this(TAM_INI);
        // datos= new String[10];
    }

    public TablaDeStrings(int tam) {
        datos = new String[tam];
        // size=0;
        // modCount=0;
    }

    public int size() {
        return size;
    }

    public boolean add(String s) {
        if (size == datos.length)
            crecer();
        datos[size] = s;
        size++;
        modCount++;
        return true;
    }

    private void crecer() {
        String[] nueva;
        int  i;
        nueva = new String[datos.length+TAM_CREC];
        for (i = 0; i < datos.length; i++) {
            nueva[i]=datos[i];
        }
        datos=nueva;
    }

    public boolean add(int pos, String s) {
        int i;
        if (pos < 0 || pos > size)
            throw new RuntimeException();
        if (size == datos.length)
            crecer();
        for (i = size; i > pos; i--) {
            datos[i] = datos[i - 1];
        }
        datos[pos] = s;
        size++;
        modCount++;
        return true;
    }

    public String remove(int pos) {
        String aux;
        int i;
        if (pos < 0 || pos >= size)
            throw new RuntimeException();
        aux=datos[pos];
        for (i = pos; i < size-1; i++) {
            datos[i]=datos[i+1];
        }
        datos[i]=null;
        size--;
        modCount++;
        return aux;
    }

    public String get(int pos) {
        if (pos < 0 || pos >= size)
            throw new RuntimeException();
        return datos[pos];
    }

    public void set(int pos, String dato) {
        if (pos < 0 || pos >= size)
            throw new RuntimeException();
        datos[pos] = dato;
    }

    @Override
    public String toString() {
        int i;
        String aux = "[";
        for (i = 0; i < size - 1; i++) {
            aux += datos[i] + " , ";
        }
        if (size != 0)
            aux += datos[i];
        aux += "]";
        return aux;
    }

}
