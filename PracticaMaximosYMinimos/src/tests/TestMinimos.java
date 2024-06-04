package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Minimos;

class TestMinimos {
//METODO 1
	@Test
	void test1() {
		
		int valoresperado = 2;
		int valorobtenido = Minimos.minimoDe2EnterosPositivos(1,2);
		assertEquals(valoresperado, valorobtenido);
	}
	@Test
	void test2() {
		
		int valoresperado = 2;
		int valorobtenido = Minimos.minimoDe2EnterosPositivos(2,1);
		assertEquals(valoresperado, valorobtenido);
	}
	@Test
	void test3() {
		
		int valoresperado = 2;
		int valorobtenido = Minimos.minimoDe2EnterosPositivos(1,1);
		assertEquals(valoresperado, valorobtenido);
	}
	
//METODO 2
	@Test
	void test12() {
		
		int valoresperado = 3;
		int valorobtenido = Minimos.minimoDe3EnterosPositivos(1,2,3);
		assertEquals(valoresperado, valorobtenido);
	}
	@Test
	void test22() {
		
		int valoresperado = 2;
		int valorobtenido = Minimos.minimoDe3EnterosPositivos(1,3,2);
		assertEquals(valoresperado, valorobtenido);
	}
	@Test
	void test32() {
		
		int valoresperado = 1;
		int valorobtenido = Minimos.minimoDe3EnterosPositivos(3,2,1);
		assertEquals(valoresperado, valorobtenido);
	}
	@Test
	void test42() {
		
		int valoresperado = 1;
		int valorobtenido = Minimos.minimoDe3EnterosPositivos(1,1,1);
		assertEquals(valoresperado, valorobtenido);
	}
}
