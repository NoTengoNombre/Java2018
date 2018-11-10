/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.system.basic;

import java.io.File;

/**
 * @see -
 * @since 08-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class ClaseSystemBasic {

 public static void main(String[] args) {

  System.out.println(System.getProperty("user.dir"));
//C:\0_Java\Java2018\ConceptosBasicos
  System.out.println(System.getProperty("java.home"));
//C:\Program Files\Java\jdk1.8.0_191\jre
  System.out.println(System.getProperty("java.specification.version"));
//1.8
  System.out.println(System.currentTimeMillis());
//  1541706319540

  File fichero = new File("archivo\\test.txt");

  long ms = System.currentTimeMillis();
  boolean cambio = fichero.setLastModified(ms);

  if (cambio) {
   System.out.println("Se ha cambiado la hora del sistema correctamente");
  } else {
   System.out.println("NO se ha cambiado la hora");
  }

 }
}
