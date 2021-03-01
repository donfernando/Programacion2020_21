package minik.java;
public class Fraccion {
    private int num;
    private int den;

    public Fraccion() {   	
    	den=1;  
    }
    public Fraccion(int n) {
    	this();
    	num=n;
    	//den=1;
    }
    public Fraccion(int n, int d) {
    	if(d==0)
    		throw new RuntimeException("No se admite cero en el denominador.");
    	num=n;
    	den=d;
    }
    
    public void setNumerador(int num) {
        this.num = num;
    }
    public void setDenominador(int den) {
    	if(den==0)
    		throw new RuntimeException("No se admite cero en el denominador.");
        this.den = den;
    }
    public int getNumerador() {
        return num;
    }
    public int getDenominador() {
        return den;
    }

    public static Fraccion producto(Fraccion a, Fraccion b) {
        return new Fraccion(a.num * b.num, a.den * b.den);
    }

    public Fraccion producto(Fraccion a) {
        Fraccion c = new Fraccion();
        c.num = a.num * num;
        c.den = a.den * den;
        return c;
        // return new Fraccion(a.num * num , a.den * den);
    }

    public Fraccion suma(Fraccion f) {
		return new Fraccion(f.den*num+f.num*den,den*f.den).simplificar();
    }
    public Fraccion inversa() {
		/*
		 * if(num==0) throw new
		 * RuntimeException("No se admite que el denominador acabe siendo cero.");
		 */
    	return new Fraccion(den, num);
    }
    public Fraccion opuesta() {
        return new Fraccion(-num, den);
    }
    
    
    
    public String toString() {
        return "(" + num + '/' + den + ')';
    }

	private static int mcm(int a, int b) {
		return (a*b)/mcd(a,b);
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
    	int mcd = mcd(num,den);
    	return new Fraccion(num/mcd,den/mcd);    	
    }
}
