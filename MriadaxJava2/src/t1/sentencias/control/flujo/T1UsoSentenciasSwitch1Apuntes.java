/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.sentencias.control.flujo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see p10
 * @since 18-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1UsoSentenciasSwitch1Apuntes {

 public static void main(String[] args) {

  System.out.println("Teclea una opcion");

  

 }
}

class LeerTeclado {

 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 public String getCadena() {
  String cadena = null;
  try {
   cadena = br.readLine();
  } catch (IOException ex) {
   Logger.getLogger(LeerTeclado.class.getName()).log(Level.SEVERE, null, ex);
  }
  return cadena;
 }

}
