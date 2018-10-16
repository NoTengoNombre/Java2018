/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t3IntroProObjetos.leerTeclado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see @since 14-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class LeerBufferedReader {

 public static void main(String[] args) {

  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);

  String cadena = null;
  try {
   System.out.println("Introduce una cadena : ");
   cadena = br.readLine();
  } catch (IOException ex) {
   Logger.getLogger(LeerBufferedReader.class.getName()).log(Level.SEVERE, null, ex);
  }
  System.out.println("Cadena : " + cadena);

  int numero = Integer.parseInt(cadena);
  System.out.println("String convertido a numero : " + ((numero >= 0) ? "Numero : " + (numero + 10) : "No Numero : " + (numero + 1)));

  String valor = null;
  if (cadena instanceof String) {
   valor = (String) cadena;
   System.out.println("Soy String : " + valor);
  } else {
   System.out.println("No Soy String : " + valor);
  }

 }
}
