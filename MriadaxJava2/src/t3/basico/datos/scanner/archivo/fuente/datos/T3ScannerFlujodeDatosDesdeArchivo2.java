/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.datos.scanner.archivo.fuente.datos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see p20
 * @since 09-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3ScannerFlujodeDatosDesdeArchivo2 {

}

class ScannerLeerFicheroV2 {

 public static void main(String[] args) throws IOException {

  String carpeta = "C:\\ficheros\\";
  String archivo = "leerfichero.txt";
//  Path path = FileSystems.getDefault().getPath(carpeta, archivo);
  File fichero = new File("C:\\ficheros\\leerfichero2.txt");

  Scanner leerFichero = null;
  try {
   leerFichero = new Scanner(fichero);
   leerFichero.useDelimiter("=");
  } catch (FileNotFoundException ex) {
   System.err.println("Error : " + ex.getMessage());
   Logger.getLogger(T3ScannerFlujodeDatosDesdeArchivo2.class.getName()).log(Level.SEVERE, null, ex);
  }

  System.out.println("Antes de entrar");
  while (leerFichero.hasNext()) {
   String cadena = leerFichero.next();
   System.out.print(cadena + " ");
  }
  leerFichero.close();
 }
}
