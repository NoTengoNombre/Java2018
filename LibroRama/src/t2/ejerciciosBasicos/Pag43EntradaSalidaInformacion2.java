/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

import java.io.IOException;

/**
 * @see Try and Catch
 * @since 26-ago-2018
 * @version
 * @author Raul Vela Salas
 */
public class Pag43EntradaSalidaInformacion2 {

 public static void main(String[] args) {

  System.out.println("- Introduce un caracter : ");
  ClaseTryCatch2 ctc = new ClaseTryCatch2();
  char valor = ctc.getChar();
  System.out.println("- Valor : " + valor);

 }
}

/**
 *
 * @author Robot
 */
class ClaseTryCatch2 {

 /**
  *
  */
 private static char c;

 /**
  *
  * @return
  */
 public char getChar() {
  try {
   c = (char) System.in.read();
  } catch (IOException e) {
   System.out.println("• Localiza el mensaje : " + e.getLocalizedMessage() + " • Mensaje : " + e.getMessage());
  }
  return c;
 }

}
