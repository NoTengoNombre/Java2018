/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.datos.demilitadores.localizacion.base.num.lectura;

import java.util.Locale;
import java.util.Scanner;

/**
 * @see p18
 * @since 08-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3DelimitadoresLocalizacionBaseNumLecturaFuenteFunciones {

}

class ScannerPruebasConFunciones {

 static String string = "3 2 4 AF Pepe 8";
 static Scanner teclado = new Scanner(System.in);
 static Scanner scDelimiter2 = null;

 public static void setSeparador() {
  // Dentro de 'try' se crea una instancia del tipo compuesto 'Scanner'
  try (Scanner scString = new Scanner(string)) {
   while (scString.hasNext()) {
    String cadena = scString.next();
    System.out.print(cadena + "-");
   }
  }
  System.out.println("");
  System.out.println("Cadena : " + string);
 }

 public static void getSeparador() {
  try (Scanner scBase = new Scanner("Cadena: " + string)) {
   scBase.useRadix(16);
   System.out.println("La base numérica es : " + scBase.radix());
   while (scBase.hasNextInt()) {
    int n = scBase.nextInt();
    System.out.print(n + " ");
   }
  }
  System.out.println("");
 }

 public static void setDelimitador() {
  String stringDelimiter = "aa /      /// bb/cc";
  System.out.println("Cadena: " + stringDelimiter);
  try (Scanner scDelimiter = new Scanner(stringDelimiter)) {
   //  scDeliScanner.useDelimiter("\\s*\\+\\s*");
   scDelimiter2 = scDelimiter;
   scDelimiter2.useDelimiter("/");
   System.out.println("El delimitador usado es : " + scDelimiter2.delimiter());

   while (scDelimiter2.hasNext()) {
    String s = scDelimiter2.next();
    System.out.println(s + "-");
   }
  }
  System.out.println("");
 }

 public static void getDelimitador() {
  String stringLocale = "1.234,6 0,888 1_344_899,098";
  System.out.println("Cadena: " + stringLocale);

  try (Scanner scLocale = new Scanner(stringLocale)) {
   scDelimiter2.useLocale(new Locale("ES"));
   while (scLocale.hasNextDouble()) {
    double d = scLocale.nextDouble();
    System.out.print(d + " ");
   }
  }
 }

 public static void getDelimitadorEntradaTeclado() {
  System.out.println("");
  teclado.useDelimiter("=");
  System.out.println("Teclea cadenas con separador \' " + teclado.delimiter() + " \' : ");

  while (teclado.hasNext()) {
   String s = teclado.next();
   System.out.println(s + " ");
   if (s.equals("FIN")) {
    teclado.reset();
    break;
   }
  }
  System.out.println("---- Una sola Instruccion -------");
  teclado.useDelimiter("\\p{javaWhitespace}+").useLocale(Locale.getDefault(Locale.Category.FORMAT)).useRadix(10);
  System.out.println("Reset reinicia delimitador, localizacion y base numerica");
  System.out.println("Demilitador es : " + teclado.delimiter());
  System.out.println("La localizacion es : " + teclado.locale().getCountry());
  System.out.println("La base numerica es : " + teclado.radix());
 }

 public static void main(String[] args) {

  setSeparador();
  getSeparador();

  System.out.println("");

  setDelimitador();
  getDelimitador();

  System.out.println("");
  getDelimitadorEntradaTeclado();

 }
}
