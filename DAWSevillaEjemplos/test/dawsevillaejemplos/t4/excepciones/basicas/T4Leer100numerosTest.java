/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevillaejemplos.t4.excepciones.basicas;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MyDevelop
 */
public class T4Leer100numerosTest {

 public T4Leer100numerosTest() {
 }

 /**
  * Test of getContador method, of class T4Leer100numeros.
  */
 @Test
 public void testGetContador() {
  System.out.println("getContador");
  int expResult = 0;
  int result = T4Leer100numeros.getContador();
  assertEquals(expResult, result);
  // TODO review the generated test code and remove the default call to fail.
//  fail("The test case is a prototype.");
 }

 /**e
  * Test of getCadena method, of class T4Leer100numeros.
  */
 @Test
 public void testGetCadena() {
  System.out.println("getCadena");
  String expResult = "";
  String result = T4Leer100numeros.getCadena();
  assertEquals(expResult, result);
  // TODO review the generated test code and remove the default call to fail.
//  fail("The test case is a prototype.");
 }

 /**
  * Test of getConversion method, of class T4Leer100numeros.
  */
 @Test
 public void testGetConversion() {
  System.out.println("getConversion");
  String cadena = "";
  int expResult = 0;
  int result = T4Leer100numeros.getConversion(cadena);
  assertEquals(expResult, result);
  // TODO review the generated test code and remove the default call to fail.
//  fail("The test case is a prototype.");
 }

 /**
  * Test of getNumero method, of class T4Leer100numeros.
  */
 @Test
 public void testGetNumero() {
  System.out.println("getNumero");
  int expResult = 0;
  int result = T4Leer100numeros.getNumero();
  assertEquals(expResult, result);
  // TODO review the generated test code and remove the default call to fail.
//  fail("The test case is a prototype.");
 }

 /**
  * Test of getNumeroEntre1y100 method, of class T4Leer100numeros.
  */
 @Test
 public void testGetNumeroEntre1y100() {
  System.out.println("getNumeroEntre1y100");
  int expResult = 0;
  int result = T4Leer100numeros.getNumeroEntre1y100();
  assertEquals(expResult, result);
  // TODO review the generated test code and remove the default call to fail.
//  fail("The test case is a prototype.");
 }

 /**
  * Test of isNumber method, of class T4Leer100numeros.
  */
 @Test
 public void testIsNumber() {
  System.out.println("isNumber");
  String valor = "";
  boolean expResult = false;
  boolean result = T4Leer100numeros.isNumber(valor);
  assertEquals(expResult, result);
  // TODO review the generated test code and remove the default call to fail.
//  fail("The test case is a prototype.");
 }

 /**
  * Test of main method, of class T4Leer100numeros.
  */
 @Test
 public void testMain() {
  System.out.println("main");
  String[] args = null;
  T4Leer100numeros.main(args);
  // TODO review the generated test code and remove the default call to fail.
//  fail("The test case is a prototype.");
 }

}
