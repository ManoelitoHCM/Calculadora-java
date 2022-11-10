package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import util.Calculadora;

class CalculadoraTeste {

	Calculadora calculadora;
	
	@BeforeEach
	void setUp() throws Exception {
		calculadora = new Calculadora();
	}
// DIVISAO POR ZERO
	@Test
	void test() {
		assertEquals(8, calculadora.soma(3, 5));
		assertEquals(13, calculadora.soma(8, 5));
		assertEquals(-2, calculadora.subtracao(3, 5));
		assertEquals(32, calculadora.subtracao(82, 50));
		assertEquals(14, calculadora.multiplicacao(2, 7));
		assertEquals(55, calculadora.multiplicacao(5, 11));
		assertEquals(6, calculadora.divisao(36, 6));
		assertEquals(9, calculadora.divisao(72, 8));
		assertEquals(9, calculadora.exponencial(3, 2));
		assertEquals(25, calculadora.exponencial(5, 2));		
		assertEquals(7, calculadora.raizQuadrada(49));
		assertEquals(4, calculadora.raizQuadrada(16));
		assertEquals(78, calculadora.piso(78, 104));
		assertEquals(-194, calculadora.piso(-194, -26));
		assertEquals(68, calculadora.teto(68, -4));
		assertEquals(-12, calculadora.teto(-12, -26));
	}
}