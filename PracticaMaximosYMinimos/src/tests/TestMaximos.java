package tests;
import clases.Maximos;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import clases.Maximos;
class TestMaximos {

// METODO 1
	
	@Test
	void test1() {
		
		int valoresperado = 2;
		int valorobtenido = Maximos.maximoDe2EnterosPositivos(1,2);
		assertEquals(valoresperado, valorobtenido);
	}
	@Test
	void test2() {
		
		int valoresperado = 2;
		int valorobtenido = Maximos.maximoDe2EnterosPositivos(2,1);
		assertEquals(valoresperado, valorobtenido);
	}
	@Test
	void test3() {
		
		int valoresperado = 1;
		int valorobtenido = Maximos.maximoDe2EnterosPositivos(1,1);
		assertEquals(valoresperado, valorobtenido);
	}
	
	
// METODO 2
	@Test
	void test12() {
		
		int valoresperado = 3;
		int valorobtenido = Maximos.maximoDe3EnterosPositivos(1,2,3);
		assertEquals(valoresperado, valorobtenido);
	}
	@Test
	void test22() {
		
		int valoresperado = 3;
		int valorobtenido = Maximos.maximoDe3EnterosPositivos(1,3,2);
		assertEquals(valoresperado, valorobtenido);
	}
	@Test
	void test32() {
		
		int valoresperado = 3;
		int valorobtenido = Maximos.maximoDe3EnterosPositivos(3,1,2);
		assertEquals(valoresperado, valorobtenido);		
}
	@Test
	void test42() {
		
		int valoresperado = 1;
		int valorobtenido = Maximos.maximoDe3EnterosPositivos(1,1,1);
		assertEquals(valoresperado, valorobtenido);
	}
}