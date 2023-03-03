/**
 * 
 */
package es.rlopezga.mates.matematicas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

/**
 * @author usuario
 *
 */
class CalculadoraTest {

	double Solucion1Prueba1;
	double Solucion1Prueba2;
	double Solucion1Prueba3;
	@BeforeEach
	void setUp() throws Exception {
		Solucion1Prueba1 = new Calculadora().solucion1(1, -5, 6);
		Solucion1Prueba2 = new Calculadora().solucion1(2, -7, 3);
		Solucion1Prueba3 = new Calculadora().solucion1(-1, -7, -10);
	}
	@AfterEach
	void tearDown() throws Exception {
		Solucion1Prueba1 = 0;
		Solucion1Prueba2 = 0;
		Solucion1Prueba3 = 0;
	}
	@Test
	@DisplayName("PrimerTest")
	void testSolucion1Correcta() {
		Assertions.assertEquals(3, Solucion1Prueba1);
		Assertions.assertEquals(3, Solucion1Prueba2);
		Assertions.assertEquals(-5, Solucion1Prueba3);
	}

}
