/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitcalculadora;

import java.awt.event.ActionEvent;
import org.junit.Test;

/**
 *
 * @author Robot
 */
public class CalculadoraTest {

 public CalculadoraTest() {
 }

 /**
  * Test of main method, of class Calculadora.
  */
 @Test
 public void testMain() {
  System.out.println("main");
  String[] args = null;
  Calculadora.main(args);
  // TODO review the generated test code and remove the default call to fail.
//  fail("The test case is a prototype.");
 }

 /**
  * Test of actionPerformed method, of class Calculadora.
  */
 @Test
 public void testActionPerformed() {
  System.out.println("actionPerformed");
  ActionEvent e = null;
  Calculadora instance = new Calculadora();
  instance.actionPerformed(e);
  // TODO review the generated test code and remove the default call to fail.
//  fail("The test case is a prototype.");
 }

}
