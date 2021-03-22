package pruebas.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import minik.ejercicios.banco.CuentaBancaria;

class PruebaCrearCuentasBancarias {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test_DC_Erroneos() {
		try {
			CuentaBancaria c = new CuentaBancaria("0239 0806 12 2259016729");
			fail("La cuenta no debería poder crearse");
		} catch (Exception e) {	}
	}
	@Test
	void test_FormatoErroneo01() {
		try {
			CuentaBancaria c = new CuentaBancaria("0239 0806 AB 2259016729");
			fail("La cuenta no debería poder crearse");
		} catch (Exception e) {	}
	}
	@Test
	void test_FormatoErroneo02() {
		try {
			CuentaBancaria c = new CuentaBancaria("2259016729");
			fail("La cuenta no debería poder crearse");
		} catch (Exception e) {	}
	}
	@Test
	void test_FormatoErroneo03() {
		try {
			CuentaBancaria c = new CuentaBancaria("");
			fail("La cuenta no debería poder crearse");
		} catch (Exception e) {	}
	}
	@Test
	void test_Null() {
		try {
			CuentaBancaria c = new CuentaBancaria(null);
			fail("La cuenta no debería poder crearse");
		} catch (Exception e) {	}
	}
	@Test
	void test_D_Erroneo() {
		try {
			CuentaBancaria c = new CuentaBancaria("0239 0806 64 2259016729");
			fail("La cuenta no debería poder crearse");
		} catch (Exception e) {	}
	}
	@Test
	void test_C_Erroneo() {
		try {
			CuentaBancaria c = new CuentaBancaria("0239 0806 70 2259016729");
			fail("La cuenta no debería poder crearse");
		} catch (Exception e) {	}
	}
	@Test
	void test_Correcto01() {
		CuentaBancaria c = new CuentaBancaria("0239 0806 74 2259016729");
		System.out.println(c);
}
	@Test
	void test_Correcto02() {
		CuentaBancaria c1 = new CuentaBancaria("0239 0806 74 2259016729");
		CuentaBancaria c2 = new CuentaBancaria("0239 0806 74 2259016729");
		assertEquals(c1, c2);
}

}
