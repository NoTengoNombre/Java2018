/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase1_4.assertbasic;

/**
 * @see
 * https://docs.oracle.com/javase/7/docs/technotes/guides/language/assert.html#usage-invariants
 * @since 05-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class AssertBasicoIfParaAfirmar {

// private static int i = (int) (Math.random() * 5);
 private static int i = 2;

 public static void main(String[] args) {

//  Internal Invariants
  if ((i % 3) == 0) {
   System.out.println("↨ Soy : " + i);
  } else if ((i % 3) == 1) {
   System.out.println("• Soy : " + i);
  } else { // Nosotros sabemos que es (i % 3 == 2)
   assert (i % 3) == 2 : i;
   System.out.println("♦ Soy : " + i);
  }
 }
}
