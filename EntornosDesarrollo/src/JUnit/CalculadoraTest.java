package JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	 public void testSuma() {
		Calculadora calcu = new Calculadora (10,20);
		int resultado = calcu.suma();
		assertEquals(30,resultado);
	}

	@Test
	public void testResta() {
		Calculadora calcu = new Calculadora (20,10);
		int resultado = calcu.resta();
		assertEquals(10,resultado);
	}

	@Test
	public void testMultiplica() {
		Calculadora calcu = new Calculadora (20,10);
		int resultado = calcu.multiplica();
		assertEquals("Fallo en la multiplicacion",20,resultado);
	}

	@Test
	public void testDivide() {
		Calculadora calcu = new Calculadora (20,0);
		int resultado = calcu.divide();
		assertEquals (2,resultado);
	}
	
	@Test
	public void testException() {
		try {
			Calculadora calcu = new Calculadora (20,0);
			int resultado = calcu.divide();
			fail("Fallo, debería haber lanzado la excepción");
		}catch (ArithmeticException e) {
			//Prueba satisfactoria
		}
	}

}
