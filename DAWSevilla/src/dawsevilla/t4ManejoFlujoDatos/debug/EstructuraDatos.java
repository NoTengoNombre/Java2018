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
public class EstructuraDatos {

 public static void main(String[] args) {
  int resultado;
  for (int i = 0; i < 10; i++) {
   resultado = sumar(i, i);
   System.out.println(resultado);
  }

 }

 public static int sumar(int operando1, int operando2) {
  return (operando1 + operando2);
 }

}
