/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumatest;

import junitbasico.JUnitSuma;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

/**
 * Clase JUnit Test Case 'solo se comprueba 1 clase'
 *
 * @author MyDevelop
 */
public class SumaTest {

 /**
  * Creamos un atributo de la clase JUnitSuma para poder invocar a los objetos
  * de la clase
  *
  */
 private JUnitSuma suma = new JUnitSuma();

 /**
  * Anotacion : Before
  *
  * Antes de ejecutar las pruebas 'Test' de JUnit se INICIALIZA los valores a
  * los distintos atributos del objeto 'suma'
  */
 @Before
 public void setUp() {
  suma.setA(2);
  suma.setB(3);
 }

 /**
  * Anotacion : Test
  *
  * Prueba el metodo que este indicado con esta 'Anotación' sin tener que
  * ejecutar toda la app
  *
  * Llamamos al metodo 'STATIC' assertEquals y comprobamos los valores
  */
 @Test
 public void testSuma() {
  assertEquals(4, suma.sumar());
//  assertEquals(5, suma.sumar());
  assertNotNull(suma.getC());
//  assertNotNull(suma.getC1());
 }
}
