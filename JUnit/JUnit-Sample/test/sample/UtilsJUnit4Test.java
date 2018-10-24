/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;

/**
 *
 * @author Robot
 */
public class UtilsJUnit4Test {

 /**
  * Constructor por defecto
  */
 public UtilsJUnit4Test() {
 }

 /**
  * Class Initializer :
  *
  * Anotación marca un método como un método de inicialización de clase de
  * prueba.
  *
  * Un método de inicialización de clase de prueba se ejecuta solo una vez, y
  * antes de cualquiera de los otros métodos en la clase de prueba.
  *
  * Ejemplo, en lugar de crear una conexión de base de datos en un inicializador
  * de prueba y crear una nueva conexión antes de cada método de prueba, es
  * posible que desee utilizar un inicializador de clase de prueba para abrir
  * una conexión antes de ejecutar las pruebas.
  *
  * A continuación, podría cerrar la conexión con el finalizador de clase de
  * prueba.
  */
 @BeforeClass
 public static void setUpClass() {
  System.out.println("*1 UtilsJUnit4Test: @BeforeClass method");
 }

 /**
  * Class Finalizer:
  *
  * Еscuchar La anotación marca un método como un método finalizador de clase de
  * prueba. Un método de finalizador de clase de prueba se ejecuta solo una vez,
  * y después de que todos los otros métodos en la clase de prueba hayan
  * finalizado.
  *
  */
 @AfterClass
 public static void tearDownClass() {
  System.out.println("*4 UtilsJUnit4Test: @AfterClass method");
 }

 /**
  * 1º Metodo en ejecutarse
  */
 @Before
 public void setUp() {
  System.out.println("*2 UtilsJUnit4Test: @Before method");
 }

 /**
  * 2º Metodo en ejecutarse
  *
  */
 @After
 public void tearDown() {
  System.out.println("*5 UtilsJUnit4Test: @After method");
 }

 /**
  *
  */
 @Test
 public void helloWorldCheck() {
  System.out.println("*3 UtilsJUnit4Test: test method 1 - helloWorldCheck()");
  assertEquals("Hello, world!", Utils.concatWords("Hello", ", ", "world", "!"));
 }

 /**
  * Test of concatWords method, of class Utils.
  */
 @Test
 public void testConcatWords() {
  System.out.println("concatWords");
  String[] words = null;
  String expResult = "";
  String result = Utils.concatWords(words);
  assertEquals(expResult, result);
  // TODO review the generated test code and remove the default call to fail.
  fail("The test case is a prototype.");
 }

 /**
  * Test of computeFactorial method, of class Utils.
  *
  * Añadimos Anotación para que se active cuando supere el 1sg
  */
 @Test(timeout = 1000) // Si el metodo tarda en ejecutarse más de 1 sg - GENERA EXCEPCION
 public void testWithTimeout() {
  System.out.println("*6 UtilsJUnit4Test: test method 2 - testWithTimeout()");
  final int factorialOf = (1 + (int) (30000 * Math.random()));
  System.out.println("computing " + factorialOf + '!');
  System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
 }

 /**
  * @Ignore - Test para deshabilitar la prueba.
  *
  * @throws Exception
  */
// @Ignore - CAMBIAR PARA LAS PRUEBAS
 @Test
 public void temporarilyDisabledTest() throws Exception {
  System.out.println("*4 UtilsJUnit4Test: test method 4 - checkExpectedException()");
  assertEquals("Malm\u00f6", Utils.normalizeWord("Malmo\u0308"));
 }

 /**
  * para especificar que se espera que la prueba lance la excepción
  */
 @Test(expected = IllegalArgumentException.class)
 public void checkExpectedException() {
  System.out.println("*5 UtilsJUnit4Test: test method 3 - checkExpectedException()");
  final int factorialOf = -5;
  System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
 }

}
