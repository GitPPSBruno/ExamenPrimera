/**
 * 
 */
package es.rlopezga.mates.matematicas;

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

	boolean Primo1;
	boolean Primo2;
	boolean Primo3;
	@BeforeEach
	void setUp() throws Exception {
		//Test 5
		Primo1 = new Calculadora().esPrimo(2);
		Primo2 = new Calculadora().esPrimo(2);
		Primo3 = new Calculadora().esPrimo(2);
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
		// Test 5
		Primo1 = false;
		Primo2 = false;
		Primo3 = false;

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
	@Test
	@DisplayName("TecerTest")
	void testSolucion1Incorrecta() {
		Exception exception = Assertions.assertThrows(ArithmeticException.class,() -> new Calculadora().solucion1(1, 1, 1));

		//Assertions.assertEquals("class java.lang.ArithmeticException", exception.getClass().toString());
	}

	@Test
	@DisplayName("CuartoTest")
	void testSolucion2Incorrecta() {
		Exception exception = Assertions.assertThrows(ArithmeticException.class,() -> new Calculadora().solucion2(1, 1, 1));

		//Assertions.assertEquals("class java.lang.ArithmeticException", exception.getClass().toString());
	}
	@Test
	@DisplayName("QuintoTest")
	void testPrimo() {
		Assertions.assertTrue(Primo1);
		Assertions.assertTrue(Primo2);
		Assertions.assertTrue(Primo3);
	}

}


