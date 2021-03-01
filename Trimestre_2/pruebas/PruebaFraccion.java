import minik.java.Fraccion;

public class PruebaFraccion {
    public static void main(String[] args) {
        Fraccion a, b, c;
        a= new Fraccion(5, 2);
        b= new Fraccion(6, 4);
        
        

        c=b.producto(a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(c.simplificar());
        System.out.println(c);

        System.out.println(a.suma(b));
    }
}
