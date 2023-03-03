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


	//Variables Segundo Test
	double Solucion2Prueba1;
	double Solucion2Prueba2;
	double Solucion2Prueba3;
	@BeforeEach
	void setUp() throws Exception {
		Solucion1Prueba1 = new Calculadora().solucion1(1, -5, 6);
		Solucion1Prueba2 = new Calculadora().solucion1(2, -7, 3);
		Solucion1Prueba3 = new Calculadora().solucion1(-1, -7, -10);

		//Variables Segundo Test
		Solucion2Prueba1 = new Calculadora().solucion2(1, -5, 6);
		Solucion2Prueba2 = new Calculadora().solucion2(2, -7, 3);
		Solucion2Prueba3 = new Calculadora().solucion2(-1, -7, -10);
	}
	@AfterEach
	void tearDown() throws Exception {
		Solucion1Prueba1 = 0;
		Solucion1Prueba2 = 0;
		Solucion1Prueba3 = 0;

		//Variables Segundo Test
		Solucion2Prueba1 = 0;
		Solucion2Prueba2 = 0;
		Solucion2Prueba3 = 0;
	}
	@Test
	@DisplayName("PrimerTest")
	void testSolucion1Correcta() {
		Assertions.assertEquals(3, Solucion1Prueba1);
		Assertions.assertEquals(3, Solucion1Prueba2);
		Assertions.assertEquals(-5, Solucion1Prueba3);
	}

	@Test
	@DisplayName("SegundoTest")
	void testSolucion2Correcta() {
		Assertions.assertEquals(2, Solucion2Prueba1);
		Assertions.assertEquals(0.5, Solucion2Prueba2);
		Assertions.assertEquals(-2, Solucion2Prueba3);
	}
}
