/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.entrada.salida.datos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see p7
 * @since 07-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3FlujoCaracteresLeerEscribir {

 /**
  * Metodo que lee FileReader/escribe FileWriter 2 bytes de caracteres
  *
  */
 public static void getFlujoCaracteres() {
  FileReader entrada = null;
  FileWriter salida = null;
  try {
   entrada = new FileReader("c:\\ficheros\\input.txt");
   salida = new FileWriter("c:\\ficheros\\output.txt");
   int i;

   while ((i = entrada.read()) != -1) {
    System.out.print((char) i);
    salida.write(i);
   }
   System.out.println("\nSe ha copiado el flujo de datos correctamente");
  } catch (FileNotFoundException ex) {
   Logger.getLogger(T3FlujoCaracteresLeerEscribir.class.getName()).log(Level.SEVERE, null, ex);
  } catch (IOException ex) {
   Logger.getLogger(T3FlujoCaracteresLeerEscribir.class.getName()).log(Level.SEVERE, null, ex);
  }
 }

 public static void main(String[] args) {

  getFlujoCaracteres();

 }
}
