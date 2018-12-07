/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.entrada.salida.datos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see p5
 * @since 07-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class StreamBytes {

 public static void main(String[] args) {
  FileInputStream entrada = null;
  FileOutputStream salida = null;

  System.out.println("Pasar texto de un archivo a otro");
  try {
   entrada = new FileInputStream("c://ficheros//input.txt");
   salida = new FileOutputStream("c://ficheros//output.txt");
   int i;
   while ((i = entrada.read()) != -1) {
    System.out.print((char) i);
    salida.write(i);
   }
  } catch (IOException ioe) {
   System.out.println("IOException : " + ioe.getMessage());
  } finally {
   if (entrada != null) {
    try {
     entrada.close();
    } catch (IOException ex) {
     Logger.getLogger(StreamBytes.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
   if (salida != null) {
    try {
     salida.close();
    } catch (IOException ex) {
     Logger.getLogger(StreamBytes.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
  }
 }
}
