/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.datos.scanner.archivo.fuente.datos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see p20
 * @since 09-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3ScannerFlujodeDatosDesdeArchivo {

}

class ScannerLeerFichero {

 public static void main(String[] args) {

  String carpeta = "c:\\ficheros\\";
  String archivo = "leerfichero.txt";

//Path path = FileSystems.getDefault().getPath(carpeta,archivo);
//Scanner leerfichero = new Scanner(path);
  File fichero = new File(carpeta + archivo);

  Scanner leerFichero = null;
  try {
   leerFichero = new Scanner(fichero);
   leerFichero.useDelimiter("=");
  } catch (FileNotFoundException ex) {
   Logger.getLogger(T3ScannerFlujodeDatosDesdeArchivo.class.getName()).log(Level.SEVERE, null, ex);
  }

  while (leerFichero.hasNext()) {
   System.out.println("Recorre Array");
   String cadena = leerFichero.next();
   System.out.println(cadena + " ");
  }

  leerFichero.close();

 }
}
