package _03_estructuras;

public class SumaCompaImpar {
    public static void main(String[] args) {    	
        //int[] numeros = {2, 5, 4, 9, 3, 1, 8, 4, 3, 1};
        int[] numeros = {5, 5, 3};
        int i, posIzq = 0, posDer = numeros.length - 1;
        int res = 0;

        for (i = 0; i < numeros.length; i++) {
            System.out.print("[" + numeros[i] + "]\t");
        }
        System.out.println();

        while (posIzq < posDer) {
            if (numeros[posDer] % 2 != 0) {
                res += numeros[posIzq];
            }
            if (numeros[posIzq] % 2 != 0) {
                res += numeros[posDer];
            }
            posIzq++;
            posDer--;
        }
        if (posIzq == posDer  & numeros[posDer] % 2 != 0) {
            res += numeros[posIzq];
        }
        System.out.println("Total: "+res);
    }
}
