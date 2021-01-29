public class Fraccion {
    private int num;
    private int den;

    public Fraccion() {   	
    }
    public Fraccion(int n) {
    	num=n;
    	den=1;
    }
    public Fraccion(int n, int d) {
    	num=n;
    	den=d;
    }
    
    public void setNumerador(int num) {
        this.num = num;
    }
    public void setDenominador(int den) {
        this.den = den;
    }
    public int getNumerador() {
        return num;
    }
    public int getDenominador() {
        return den;
    }

    public static Fraccion producto(Fraccion a, Fraccion b) {
        Fraccion c = new Fraccion();
        c.num = a.num * b.num;
        c.den = a.den * b.den;
        return c;
    }

    public Fraccion producto(Fraccion a) {
        Fraccion c = new Fraccion();
        c.num = a.num * num;
        c.den = a.den * den;
        return c;
        // return new Fraccion(a.num * num , a.den * den);
    }

    public Fraccion suma(Fraccion f) {
    	
    }
    public Fraccion inversa() {
    	
    }
    public Fraccion opuesta() {
    	
    }
    
    
    
    public String toString() {
        return "( " + num + "/" + den + " )";
    }

    private static int mcm(int a, int b){{
    	
    }

    private static int mcd(int a, int b){
        if(b==0){
            return a;
        }
        int r;
        while(b!=0){
            r=a%b;
            a=b;
            b=r;
        }
        return a;
    }

    public Fraccion simplificar(){
        Fraccion c = new Fraccion();    	

        c.num = num/mcd(num,den);
        c.den = den/mcd(num,den);
        return c;
    }
}
