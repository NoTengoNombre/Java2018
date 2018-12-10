/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.datos.entrada.uso.scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see -
 * @since 08-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3BasicoLeerDatosAlmacenados {

 public static void main(String[] args) throws FileNotFoundException {

  ObtenerDatos datos = new ObtenerDatos();
  try {
   System.out.println("Introduce carpeta y archivo ");
   datos.getDatos();
  } catch (FileNotFoundException ex) {
   Logger.getLogger(T3BasicoLeerDatosAlmacenados.class.getName()).log(Level.SEVERE, null, ex);
  }
 }
}

/**
 *
 * @author MyDevelop
 */
class ObtenerDatos {

 /**
  *
  * @return
  */
 public String getCarpeta() {
  String leerLinea = null;
  try {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Introduce el nombre de la carpeta");
   leerLinea = br.readLine();
  } catch (IOException ex) {
   Logger.getLogger(ObtenerDatos.class.getName()).log(Level.SEVERE, null, ex);
  }
  return leerLinea;
 }

 /**
  *
  * @return
  */
 public String getArchivo() {
  String leerLinea = null;
  try {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Introduce el nombre del archivo");
   leerLinea = br.readLine();
  } catch (IOException ex) {
   Logger.getLogger(ObtenerDatos.class.getName()).log(Level.SEVERE, null, ex);
  }
  return leerLinea;
 }

 /**
  *
  * @throws FileNotFoundException
  */
 public void getDatos() throws FileNotFoundException {
  Scanner fichero = new Scanner(new File(getCarpeta(), getArchivo()));
  System.out.println("" + fichero);
 }

 /**
  *
  * @return @throws FileNotFoundException
  */
 public String getDatosTeclado() throws FileNotFoundException {
  Scanner teclado = new Scanner(System.in);
  System.out.println("Obtener datos teclado: ");
  String cadena = teclado.next();
  return cadena;
 }

 /**
  *
  * @throws FileNotFoundException
  */
 public void getDatosConstructor() throws FileNotFoundException {
  Scanner scanner = new Scanner("3 4 78,5 HOLA 21");
  System.out.println("" + scanner);
 }

}
