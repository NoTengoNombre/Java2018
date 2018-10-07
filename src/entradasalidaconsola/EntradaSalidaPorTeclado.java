/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasalidaconsola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see pag 41
 * @since 07-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class EntradaSalidaPorTeclado {

 public static void main(String[] args) {

  InputStreamReader lector = new InputStreamReader(System.in);
  BufferedReader buffer = new BufferedReader(lector);
  System.out.println("Lee por teclado una cadena");
  try {
   String entrada = buffer.readLine();
   System.out.println("Cadena leida: " + ((entrada instanceof String) ? ("Si es de tipo String : " + entrada) : ("No es de tipo String : " + entrada)));
  } catch (IOException ex) {
   Logger.getLogger(EntradaSalidaPorTeclado.class.getName()).log(Level.SEVERE, null, ex);
  }

 }
}
