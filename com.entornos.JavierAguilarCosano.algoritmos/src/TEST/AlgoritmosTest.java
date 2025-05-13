package TEST;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import CLASES.Algoritmos;

class testAlgoritmo {

	Algoritmos nuevo = new Algoritmos() {};
	
	@Test
	void testFibonacci() {
		int valorEsperado = 13;
		int valorObtenido = nuevo.fibonacci(7);
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	void testFactorial() {
		int valorEsperado = 5040;
		int valorObtenido = nuevo.factorial(7);
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	void testPrimo() {
		boolean valorEsperado = true;
		boolean valorObtenido = nuevo.primo(7);
		assertEquals(valorEsperado, valorObtenido);
	}

}