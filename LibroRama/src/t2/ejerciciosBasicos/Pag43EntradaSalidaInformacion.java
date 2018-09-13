/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see Try and Catch
 * @since 26-ago-2018
 * @version
 * @author Raul Vela Salas
 */
public class Pag43EntradaSalidaInformacion {

 public static void main(String[] args) {

  System.out.println("- Introduce un caracter : ");
  ClaseTryCatch ctc = new ClaseTryCatch();
  char valor = ctc.getChar();

  if (valor == '1' && valor != 1) {
   System.out.println("- Valor : " + valor);
  } else {
   System.out.println("- Sin valor : " + valor);
  }
  if (valor == 'a') {
   System.out.println("♠ Valor : " + valor);
  }

 }
}

/**
 *
 * @author Robot
 */
class ClaseTryCatch {

 private static char c;

 public char getChar() {
  try {
   c = (char) System.in.read();
  } catch (IOException ex) {
   System.out.println(""
           + "▬ Mensaje : " + ex.getMessage()
           + "▬ Localiza Mensaje :  " + ex.getLocalizedMessage());
   Logger.getLogger(Pag43EntradaSalidaInformacion.class.getName()).log(Level.SEVERE, null, ex);
  } catch (Exception e) {
   System.out.println("• Localiza el mensaje : " + e.getLocalizedMessage() + " • Mensaje : " + e.getMessage());
  } finally {
   System.out.println("♣ Valor de c : " + c);
  }
  return c;
 }
}
