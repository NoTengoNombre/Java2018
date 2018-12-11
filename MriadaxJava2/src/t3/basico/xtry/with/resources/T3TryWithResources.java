/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.xtry.with.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @see p22
 * @since 09-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3TryWithResources {

}

class UsarRecursosTryCatch {

 /**
  * Copia lo que hay en un archivo a otro
  *
  * @param origen
  * @param destino
  * @throws FileNotFoundException
  * @throws IOException
  */
 private static void getCopiarFicheros(File origen, File destino) throws FileNotFoundException, IOException {
  System.out.println("Ejecuta");
  try (InputStream forigen = new FileInputStream(origen);
          OutputStream fdestino = new FileOutputStream(destino)) {
   // Buffer de datos 9k Byte
   byte[] buffer = new byte[9000];
   int i;
   while ((i = forigen.read(buffer)) != -1) {
    fdestino.write(buffer, 0, i);
   }
  } catch (Exception e) {
   System.err.println("Error : " + e.getMessage());
  }
 }

 public static void main(String[] args) throws IOException {

  File origen = new File("c:\\ficheros\\1origen.txt");
  File destino = new File("c:\\ficheros\\2destino.txt");

  getCopiarFicheros(origen, destino);

 }
}
