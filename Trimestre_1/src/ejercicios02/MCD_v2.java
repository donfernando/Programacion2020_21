package ejercicios02;

import java.util.Scanner;

public class MCD_v2 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dividendo,divisor,aux;


        System.out.println("Ingrese el primer número");
        dividendo = in.nextInt();
        System.out.println("Ingrese el segundo número");
        divisor = in.nextInt();


        
        System.out.print("El M.C.D. entre " + dividendo + " y " + divisor + " es ");
        while (divisor != 0){
            aux = divisor;
            divisor = dividendo%divisor;
            dividendo = aux;
        }
        System.out.println(dividendo);
	}

}
