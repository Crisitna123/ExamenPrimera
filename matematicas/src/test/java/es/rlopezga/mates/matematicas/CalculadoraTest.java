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
	}

}
