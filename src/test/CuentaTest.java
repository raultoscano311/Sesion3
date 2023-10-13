package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	static Cuenta aux;
	static Cuenta cuenta12345;
	static Cuenta cuenta67890;

	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		aux = new Cuenta("prueba", "11111", (double) 0);
		cuenta12345 = new Cuenta("Raul", "12345", (double) 50);
		cuenta67890 = new Cuenta("Juan", "67890", (double) 0);

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {

	}

	@BeforeEach
	void setUp() throws Exception {
		aux.setSaldo((double) 0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		aux.ingresar(1000);
		assertEquals(aux.getSaldo(), 1000);
	}
	
	@Test
	void testRetirar() {
		aux.retirar(200);
		assertEquals(aux.getSaldo(), -200);
	}
	
	@Test
	void test0014() {
		cuenta12345.retirar(200);
		cuenta67890.retirar(350);
		cuenta12345.ingresar(100);
		cuenta67890.retirar(200);
		cuenta67890.retirar(150);
		cuenta12345.retirar(200);
		cuenta67890.ingresar(50);
		cuenta67890.retirar(100);		
		assertEquals(cuenta12345.getSaldo(), -250);
		assertEquals(cuenta67890.getSaldo(), -450);
		System.out.println("Saldo final cuenta "+ cuenta12345.getCuenta() + ": " + cuenta12345.getSaldo());
		System.out.println("Saldo final cuenta "+ cuenta67890.getCuenta() + ": " + cuenta67890.getSaldo());

	}
	

}
