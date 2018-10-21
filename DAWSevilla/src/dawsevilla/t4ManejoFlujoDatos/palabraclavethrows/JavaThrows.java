/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.palabraclavethrows;

/**
 * @see @since 18-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class JavaThrows {

 static void demoProc() throws IllegalAccessException {
  System.out.println("Dentro de demoproc");
  throw new IllegalAccessException();
 }

 public static void main(String[] args) throws IllegalAccessException {
  try {
   demoProc();
  } catch (IllegalAccessError ila) {
   System.out.println("Capturada de nuevo : " + ila.getMessage());
  }
 }

}
