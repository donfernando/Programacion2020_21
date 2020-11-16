package ejercicios02;

import java.util.Scanner;

public class MCD_v2 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,res;
        int num1, num2;

        System.out.println("Ingrese el primer número");
        num1 = in.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = in.nextInt();

        a = num1;
        b = num2;
        while (b != 0){
            res = b;
            b = a%b;
            a = res;
        }
        System.out.println("El M.C.D. entre " + num1 + " y " + num2 + " es " +  a);
	}

}
