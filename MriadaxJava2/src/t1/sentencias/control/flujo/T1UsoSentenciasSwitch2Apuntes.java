
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.sentencias.control.flujo;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see p10
 * @since 19-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1UsoSentenciasSwitch2Apuntes {

 private static final BufferedReader TECLADO = new BufferedReader(new InputStreamReader(System.in));
 private static File file;

 public static void getListaOpciones() {
  System.out.println("Abrir Archivo 'A' ");
  System.out.println("Borrar Archivo 'B' ");
  System.out.println("Crear Archivo 'C' ");
  System.out.println("Listar Archivo 'L' ");
  System.out.println("Terminar 'X' ");
 }

 public static String getCadena() {
  String opcion = null;
  try {
   opcion = TECLADO.readLine();
  } catch (IOException e) {
   System.out.println("Error : " + e);
  }
  return opcion;
 }

 public static void setAction() {
  boolean valor = true;
  do {
   getListaOpciones();
   String opcion = getCadena();
   switch (opcion) {
    case "A":
     valor = false;
     abrirArchivo();
     break;
    case "B":
     valor = false;
     borrarArchivo();
     break;
    case "C":
     valor = false;
     crearArchivo();
     break;
    case "L":
     valor = false;
     listarArchivo();
     break;
    case "X":
     valor = false;
     terminar();
     break;
    default:
     valor = true;
     System.out.println("Opcion no valida");
     break;
   }
  } while (valor);

 }

 public static void main(String[] args) {
  setAction();
 }

 public static File getFile() {
  System.out.println("Introduce el nombre del archivo : ");
  String archivo = getCadena();
  archivo += ".txt";
  file = new File("..\\MriadaxJava2\\assets\\" + archivo);
  return file;
 }

 private static void abrirArchivo() {
  listarArchivo();
  //text file, should be opening in default text editor
  File archivo = getFile();
  //first check if Desktop is supported by Platform or not
  if (!Desktop.isDesktopSupported()) {
   System.out.println("Desktop is not supported");
  }
  Desktop desktop = Desktop.getDesktop();
  if (archivo.exists()) {
   try {
    desktop.open(archivo);
   } catch (IOException ex) {
    Logger.getLogger(T1UsoSentenciasSwitch2Apuntes.class.getName()).log(Level.SEVERE, null, ex);
   }
  }
 }

 private static void borrarArchivo() {
  listarArchivo();
  System.out.println("Introduce el nombre del archivo : ");
  String archivo = getCadena();
  archivo += ".txt";
  file = new File("..\\MriadaxJava2\\assets\\" + archivo);
  //relative path
  if (file.delete()) {
   System.out.println("File deleted from Project root directory");
  } else {
   System.out.println("File doesn't exists in project root directory");
  }
 }

 private static void crearArchivo() {
  System.out.println("Introduce el nombre del archivo : ");
  String archivo = getCadena() + ".txt";
  //file name only
  file = new File("..\\MriadaxJava2\\assets\\" + archivo);
  try {
   if (file.createNewFile()) {
    System.out.println("File : " + archivo + " File Created in Project root directory");
   } else {
    System.out.println("File : " + archivo + " Already exists in project root directory");
   }
  } catch (IOException ex) {
   Logger.getLogger(T1UsoSentenciasSwitch2Apuntes.class.getName()).log(Level.SEVERE, null, ex);
  }
 }

 private static void listarArchivo() {
  file = file = new File("..\\MriadaxJava2\\assets\\");
  for (final File fileEntry : file.listFiles()) {
   if (fileEntry.isDirectory()) {
    System.out.println("Es un directorio : " + fileEntry.isDirectory());
   } else {
    System.out.println("Archivo : " + fileEntry.getName());
   }
  }
 }

 private static void terminar() {
  System.out.println("Salir");
 }

}
