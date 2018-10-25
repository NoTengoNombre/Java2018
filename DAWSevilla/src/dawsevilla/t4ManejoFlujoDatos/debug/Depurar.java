/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.debug;

/**
 *
 * @author Robot
 */
public class Depurar {

 public static void main(String[] args) {

  int numMax = 100;
  int numActual = 1;
  int incremento = 1;
  while (numActual <= numMax) {
   System.out.println(numActual);
   numActual += incremento;
   incremento++;
  }
 }

}
