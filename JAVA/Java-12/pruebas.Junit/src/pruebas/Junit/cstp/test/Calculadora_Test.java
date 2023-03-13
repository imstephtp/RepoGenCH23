
package pruebas.Junit.cstp.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import pruebas.Junit.cstp.app.Calculadora;

class Calculadora_Test {
	private Calculadora ct;
	private Calculadora ct1 = null;
	

	@BeforeEach
	public void configurandoBefore () {
		ct = new Calculadora();
		System.out.println("Ejecutando Before ---> configurandoBefore");
	}
	
	@AfterEach
	public void configurandoAfter () {
		ct = null;
		System.out.println("Ejecutando After ---> configurandoBefore");
		System.out.println(" --------------********************-------------------");
	}
	
	//2. Se crea la clase test, junto con su metodo
	@Test
	public void calculadoraNull() {
		//3. Se crea el assertNull que verifica si el objeto es nulo
		assertNull(ct1, "La clase es una sintancia no nula");
		System.out.println("Ejecuntando primer test ---> calculadora");
		
        //4. Se ejecuta la prueba JUnit que chechara si ct es nulo
	}

	//5. Se crea un metodo con "assertNotNull" que verifica si el objeto es definido.
    @Test
    public void calculadoraDefinida() {
        // TODO Auto-generated method stub
        
        assertNotNull(ct, "La clase es una instancia definida");
        System.out.println("Ejecutando segundo test ---> Calculadora (Test objeto definido)");
        
        //6. Con "ct = null", el primer test pasara, sin embargo el segundo test fallara
    }
    
    //7. Si un hay un metodo de prueba despues de un metodo que retorna un test fallido, este se omitira.
    
    //8. Creamos un "BeforeEach" en la lina 16 que ejecutara cierto codigo antes de cada @Test
    
    //9. Creamos un "AfterEach" en la linea 25 que ejecutara cierto codigo despues de cada @Test
    
	
    
	/**************Primeras Pruebas***************/
	
	@Test
	public void primerosAssert() {
		//
		int resultadoEsperado = 10;
		int resultadoActual;
		resultadoActual = ct.sumar(6, 4);
		assertEquals(resultadoEsperado, resultadoActual);
		System.out.println("Ejecutando tercer tst ---> primerosAssert()");
		
	}
	
	@Test
	
	public void sumaTest() {
		// TODO Auto-generated method stub
		assertEquals(20,ct.sumar(10, 10));
		System.out.println("Ejecutando tercer tst ---> primerosAssert()");
	}
	
	/************************TIPOS DE TEST*******************************/
	
	@Test
	public void tiposAsserts() {
		// TODO Auto-generated method stub
		assertTrue(1 == 1);
		assertEquals("Generation", "Generation");
		assertNull(ct1);
		
		Calculadora c1 = new Calculadora();
		Calculadora c2 = new Calculadora();
		Calculadora c3 = c1;
		
		assertSame(c2, c3);
		assertNotSame(c2, c3);
		assertEquals(1,1.5,.5);
	}

		@Test
	public void validandoSuma() {
		assertEquals(11, ct.sumar(5, 6));

	}
	
		@Test
	public void validandoResta() {
		assertEquals(50, ct.restar(56, 6));

	}
	
		@Test
	public void validandoRestaNegativa() {
		assertEquals(-10, ct.restar(10, 20));

	}
		@Test
		public void validandoDivision() {
			assertEquals(2, ct.dividir(10, 5));

		}
		/*
		@Test
		public void validandoByZero() {
			assertThrows(ArithmeticException.class, ()->ct.divisionbyZero(10, 0), "No se puede dividir por cero");

		}*/
		
		@Disabled("En espera")
		@Test
		public void validandoByZero() {
			assertThrows(ArithmeticException.class, ()->ct.divisionbyZero(10, 0), "No se puede dividir por cero");

		}
}

	

	
