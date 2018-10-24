/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitcalculadora;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Robot
 */
public class OperacionesTest {

 public OperacionesTest() {
 }

 /**
  * Test of sumar method, of class Operaciones.
  */
 @Test
 public void testSumar() {
  System.out.println("sumar");
  double a = 0.0;
  double b = 0.0;
  Operaciones instance = new Operaciones();
  double expResult = 0.0;
  double result = instance.sumar(a, b);
  assertEquals(expResult, result, 0.0);
  // TODO review the generated test code and remove the default call to fail.
//  fail("The test case is a prototype.");
 }

 /**
  * Test of restar method, of class Operaciones.
  */
 @Test
 public void testRestar() {
  System.out.println("restar");
  double a = 0.0;
  double b = 0.0;
  Operaciones instance = new Operaciones();
  double expResult = 0.0;
  double result = instance.restar(a, b);
  assertEquals(expResult, result, 0.0);
  // TODO review the generated test code and remove the default call to fail.
//  fail("The test case is a prototype.");
 }

}
