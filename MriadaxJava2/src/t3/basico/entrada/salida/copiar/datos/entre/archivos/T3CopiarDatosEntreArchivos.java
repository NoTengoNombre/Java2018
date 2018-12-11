/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.entrada.salida.copiar.datos.entre.archivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see p5
 * @since 07-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3CopiarDatosEntreArchivos {

 public static void main(String[] args) {

  CopiarDatosEntreArchivos.getCopiarDatos();
 }
}

class CopiarDatosEntreArchivos {

 private static int contador = 0;

 public static String getCapturaTeclado() {

  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
  String cadena = null;
  if (contador == 0) {
   System.out.println("\u001B[33mIntroduce la ruta del directorio y el archivo a copiar");
  } else {
   System.out.println("\u001B[36mIntroduce la ruta del directorio y el archivo donde quieres mostrar los datos");
  }
  try {
   cadena = bf.readLine();
  } catch (IOException ex) {
   Logger.getLogger(CopiarDatosEntreArchivos.class.getName()).log(Level.SEVERE, null, ex);
  }
  contador++;
  return cadena;
 }

 /**
  * Introducimos la ruta por teclado y copia todos los datos del archivo
  */
 public static void getCopiarDatos() {
  FileInputStream entrada = null;
  FileOutputStream salida = null;

  System.out.println("Pasar 'datos' de un archivo a otro escribiendo la ruta");
  try {
   String capturaLinea = getCapturaTeclado();
   entrada = new FileInputStream(capturaLinea);
// 'objeto' define el archivo de 'salida' 
//   salida = new FileOutputStream(".\\src\\archivoqs\\output.txt");
   salida = new FileOutputStream(getCapturaTeclado());
   int i;
   // read() - va leyendo 'bytes' de entrada hasta que llega al final 
//             lo marca como '-1'
   while ((i = entrada.read()) != -1) {
    System.out.print((char) i);
// 'objeto' escribe en el archivo de salida 
    salida.write(i);
   }
  } catch (IOException ioe) {
   System.out.println("IOException : " + ioe.getMessage());
  } finally {
   if (entrada != null) {
    try {
     entrada.close();
    } catch (IOException ex) {
     Logger.getLogger(T3CopiarDatosEntreArchivos.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
   if (salida != null) {
    try {
     salida.close();
    } catch (IOException ex) {
     Logger.getLogger(T3CopiarDatosEntreArchivos.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
  }
  System.out.println("");
 }

}
