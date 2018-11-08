/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitsimpleclase;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MyDevelop
 */
public class JUnitSimpleClaseTest {
 
 public JUnitSimpleClaseTest() {
 }
 
 @BeforeClass
 public static void setUpClass() {
 }
 
 @AfterClass
 public static void tearDownClass() {
 }

 /**
  * Test of getCalculaLetra method, of class JUnitSimpleClase.
  */
 @Test
 public void testGetCalculaLetra() {
  System.out.println("getCalculaLetra");
  int dni = 0;
  char expResult = ' ';
  char result = JUnitSimpleClase.getCalculaLetra(dni);
  assertEquals(expResult, result);
  // TODO review the generated test code and remove the default call to fail.
//  fail("The test case is a prototype.");
 }

 /**
  * Test of getNumeroDNI method, of class JUnitSimpleClase.
  */
 @Test
 public void testGetNumeroDNI() {
  System.out.println("getNumeroDNI");
  int expResult = 0;
  int result = JUnitSimpleClase.getNumeroDNI();
  assertEquals(expResult, result);
  // TODO review the generated test code and remove the default call to fail.
//  fail("The test case is a prototype.");
 }

 /**
  * Test of getNumeroCompleto method, of class JUnitSimpleClase.
  */
 @Test
 public void testGetNumeroCompleto() {
  System.out.println("getNumeroCompleto");
  int numero = 0;
  String expResult = "";
  String result = JUnitSimpleClase.getNumeroCompleto(numero);
  assertEquals(expResult, result);
  // TODO review the generated test code and remove the default call to fail.
//  fail("The test case is a prototype.");
 }

 /**
  * Test of main method, of class JUnitSimpleClase.
  */
 @Test
 public void testMain() {
  System.out.println("main");
  String[] args = null;
  JUnitSimpleClase.main(args);
  // TODO review the generated test code and remove the default call to fail.
//  fail("The test case is a prototype.");
 }
 
}
