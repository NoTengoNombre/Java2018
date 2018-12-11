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
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see -
 * @since 08-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3BasicoLeerDatosAlmacenados2 {

 public static void main(String[] args) throws FileNotFoundException {

  System.out.println("Metodo utiliza delimitadores :");
  ObtenerDatos2 od2 = new ObtenerDatos2();
  od2.getDatosConstructor2();

 }
}

/**
 *
 * @author MyDevelop
 */
class ObtenerDatos2 {

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
 public void getDatosConstructor1() throws FileNotFoundException {
  Scanner scanner = new Scanner("3 4 78,5 HOLA 21");
  Scanner configuracion = scanner.useDelimiter("/").useLocale(Locale.getDefault(Locale.Category.FORMAT)).useRadix(10);
  System.out.println("Configuración : " + configuracion);
 }

 /**
  *
  * @throws FileNotFoundException
  */
 public void getDatosConstructor2() throws FileNotFoundException {
  Scanner scanner = new Scanner("3 4 78,5 HOLA 21");
  scanner.useDelimiter("/");
  scanner.useLocale(new Locale("ES"));
  scanner.useLocale(Locale.ITALIAN);
  Scanner useRadix = scanner.useRadix(16);
  System.out.println("Usar Radix : " + useRadix);
 }

 public void getDelimitador() throws FileNotFoundException {
  Scanner scanner = new Scanner("3 4 78,5 HOLA 21");
  scanner.useDelimiter("\\p{javaWhitespace}+").useLocale(Locale.getDefault(Locale.Category.FORMAT)).useRadix(10);
 }

}
