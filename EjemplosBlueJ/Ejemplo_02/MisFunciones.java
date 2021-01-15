
public class MisFunciones {
    public static void main(String[] arg){
        System.out.println("Hola mundo..!!!");
    }
    public static void funcionSaluda(){
        System.out.println("Hola mundo..soy una función!!!");
    }
    
	public static int numeroAleatorio(int d, int h) {
		double x;
		int valoresRango, resultado;
		x = Math.random();
		valoresRango   = ((h - d) + 1);
		resultado = (int) (x * valoresRango) + d;
		return resultado;
	}
	public static String eligeAlAzar(String[] nombres) {
	    int pos;
	    pos=numeroAleatorio(0,nombres.length-1);
	    return nombres[pos];
	}
}
