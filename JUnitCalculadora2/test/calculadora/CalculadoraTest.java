/**
 * https://www.youtube.com/watch?v=1H3NLEAoiKc&index=3&list=PLTd5ehIj0goML37B7s9I9iN2zhJCfxJBC
 */
package calculadora;

import static org.junit.Assert.*;
import junitcalculadora2.Calculadora;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

/**
 *
 * @author MyDevelop
 */
public class CalculadoraTest {

 // Invocamos el objeto para que este disponible en todas los metodos
 static Calculadora calc;

 public CalculadoraTest() {
 }

 /**
  * Vamos a iniciar la clase antes de que se ejecute las pruebas JUNIT
  */
 @BeforeClass
 public static void beforeClass() {
  System.out.println("BeforeClass()");
  calc = new Calculadora();

 }

 /**
  * Podemos "Ejecutar" el codigo antes de la prueba
  *
  * Por cada metodo lanzado se ejecuta antes el metodo before()
  *
  */
 @Before // Ejecuta el codigo antes de que se ejecute una prueba  
 public void before() {
  System.out.println("before()");
//  calc = new Calculadora(); // Inicializamos objeto de la calculadora 1 vez
  calc.clear(); // Limpia la calculadora : borra de la memoria el objeto 'calc'
 }

 /**
  * Ejecuta codigo despues de la prueba
  *
  */
 @After
 public void after() {
  System.out.println("after()");
  calc.clear();
 }

 @AfterClass
 public static void afterClass() {
  System.out.println("afterClass() - Se ejecuta despues de crear la clase 1 unica vez");
 }

// @Test
// public void testSuma() {
//  int resultado = junitcalculadora2.JUnitCalculadora2.suma(2, 3);
//  int valorEsperado = 5; // 2 + 3 = 5;
//  // Con el metodo ponemos el valor esperado y el valor devuelto por el metodo
//  assertEquals(valorEsperado, resultado);
// }
// 
// 
// @Test
// public void testResta() {
//  int resultado = JUnitCalculadora2.resta(3, 2);
//  int valorEsperado = 1;
//  // Con el metodo ponemos el valor que esperamos y el valor devuelto por el metodo que estamos probando
//  assertEquals(valorEsperado, resultado);
// }
// 
// @BeforeClass
// public static void setUpClass() {
// }
// 
// @AfterClass
// public static void tearDownClass() {
// }
// 
 /**
  * The methods must be annotated with annotation
  *
  * @Test. For example:
  *
  */
// @Test
// public void test() {
//  fail("Not yet implemented");
// }
// 
 /**
  * Prueba el metodo suma
  */
 @Test // marca el Test como una prueba
 public void testSum() {
  System.out.println("sum()");
  int resultado = calc.add(3, 2);
  int resultadoEsperado = 5;
  assertEquals(resultadoEsperado, resultado);
 }

 /**
  * Prueba el metodo suma PARAMETRIZADA
  *
  * Varios grupos de parametros y darselo para que haga pruebas sin tener que
  * repetir metodos o parametros
  */
 @Test // marca el Test como una prueba
 public void testSumParametrizados() {
  System.out.println("sum()");
  int resultado = calc.add(3, 2);
  int resultadoEsperado = 5;
  assertEquals(resultadoEsperado, resultado);
 }

 /**
  *
  */
 @Test // marca el Test como una prueba
 public void testAnsSum() {
  System.out.println("ansSum()");
  calc.add(3, 2);
  int resultado = calc.ans();
  int resultadoEsperado = 5;
  assertEquals(resultadoEsperado, resultado);
 }

 /**
  * @Test() Con el parametro expect y timeout
  *
  * https://www.youtube.com/watch?v=yw--pvtxY_k&list=PLTd5ehIj0goML37B7s9I9iN2zhJCfxJBC&index=5
  */
 @Test
 public void testDiv() {
  System.out.println("div()");
  calc.div(5, 2);
 }

 /**
  * Crear una prueba que permita comprobar si se lanza la excepcion
  * correctamente cuando se ejecute el metodo con un error
  *
  * Siempre va a fallar en el caso que no se lance una expecion que le indiques
  */
 @Test(expected = ArithmeticException.class)
 public void testDivPorCero() {
  System.out.println("div() Exception 0");
  calc.div(5, 0);
 }

 /**
  * Si el metodo lanzado tarda más de 1 milisegundo da error
  */
// @Test(timeout = 100)
// public void testAlgoritmoOptimo() {
//  calc.operacionOptimaMuyLarga();
// }
// 
 /**
  * Si el metodo lanzado es un bucle infinito aparece un error
  */
// @Test(timeout = 100)
// public void testAlgoritmoOptimoAntiBucleInfinito() {
//  calc.operacionOptimaMuyLargaAntiBuclesInfinitos();
// }
// 
}
