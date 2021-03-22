package minik.ejercicios;

import minik.ejercicios.banco.CuentaBancaria;

public class PruebaCuentaBancaria {

	public static void main(String[] args) {
		try {
			CuentaBancaria c = new CuentaBancaria("0239 0806 12 2259016729");
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			CuentaBancaria c = new CuentaBancaria("0239 R806 12 2259016729");
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			CuentaBancaria c = new CuentaBancaria("0239 0806 72 2259016729");
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			CuentaBancaria c = new CuentaBancaria("0239 0806 64 2259016729");
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CuentaBancaria c;
		try {
			c = new CuentaBancaria("0239 0806 74 2259016729");
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
