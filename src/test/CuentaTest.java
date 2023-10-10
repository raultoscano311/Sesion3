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
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		aux = new Cuenta("Raul", "12345", (double) 0);
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
	

}
