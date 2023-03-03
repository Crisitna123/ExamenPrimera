package es.rlopezga.mates.matematicas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	void testSolucion1Correcta() {
		Assertions.assertEquals(3,Calculadora.solucion1(1, -5, 6));
		Assertions.assertEquals(3,Calculadora.solucion1(2, -7, 3));
		Assertions.assertEquals(-5,Calculadora.solucion1(-1, -7, -10));
	}
	
	@Test
	void testSolucion2Correcta() {
		Assertions.assertEquals(2,Calculadora.solucion2(1, -5, 6));
		Assertions.assertEquals(0.5,Calculadora.solucion2(2, -7, 3));
		Assertions.assertEquals(-2,Calculadora.solucion2(-1, -7, -10));
	}

	@Test
	void testSolucion1Incorrecta() {
		//Assertions.assertThrows(IllegalException.class, Calculadora.solucion1(1, 1, 1));
	}
	
	@Test
	void testPrimo() {
		Assertions.assertTrue(Calculadora.esPrimo(2));
		Assertions.assertTrue(Calculadora.esPrimo(7));
		Assertions.assertTrue(Calculadora.esPrimo(19));
	}
	
	@Test
	void testNoPrimo() {
		Assertions.assertFalse(Calculadora.esPrimo(15));
		Assertions.assertFalse(Calculadora.esPrimo(16));
		Assertions.assertFalse(Calculadora.esPrimo(20));
	}
	
}
