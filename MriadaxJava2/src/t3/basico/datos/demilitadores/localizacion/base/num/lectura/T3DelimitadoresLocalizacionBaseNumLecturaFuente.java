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
public class T3DelimitadoresLocalizacionBaseNumLecturaFuente {

}

class ScannerPruebas {

 public static void main(String[] args) {

  Scanner teclado = new Scanner(System.in);
  String string = new String("3 2 4 AF Pepe 8");
  Scanner scString = new Scanner(string);

  while (scString.hasNext()) {
   String cadena = scString.next();
   System.out.print(cadena + "-");
  }
  scString.close();

  System.out.println("");
  System.out.println("Cadena : " + string);
  Scanner scBase = new Scanner("Cadena: " + string);
  scBase.useRadix(16);
  System.out.println("La base numérica es : " + scBase.radix());

  while (scBase.hasNextInt()) {
   int n = scBase.nextInt();
   System.out.print(n + " ");
  }
  scBase.close();
  System.out.println("");

  String stringDelimiter = "aa /      /// bb/cc";
  System.out.println("Cadena: " + stringDelimiter);
  Scanner scDelimiter = new Scanner(stringDelimiter);
//  scDeliScanner.useDelimiter("\\s*\\+\\s*");
  scDelimiter.useDelimiter("/");
  System.out.println("El delimitador usado es : " + scDelimiter.delimiter());

  while (scDelimiter.hasNext()) {
   String s = scDelimiter.next();
   System.out.println(s + "-");
  }

  scDelimiter.close();
  System.out.println("");

  System.out.println("------- 2 Parte del Ejercicio -------- ");

  String stringLocale = "1.234,6 0,888 1_344_899,098";
  System.out.println("Cadena: " + stringLocale);

  Scanner scLocale = new Scanner(stringLocale);
  scDelimiter.useLocale(new Locale("ES"));

  while (scLocale.hasNextDouble()) {
   double d = scLocale.nextDouble();
   System.out.print(d + " ");
  }

  scLocale.close();
  System.out.println("");
  teclado.useDelimiter("=");
  System.out.println("teclea cadenas con separador \'" + teclado.delimiter() + "\' : ");

  while (teclado.hasNext()) {
   String s = teclado.next();
   System.out.println(s + " ");
   if (s.equals("FIN")) {
    teclado.reset();
    break;
   }
  }
  System.out.println("");
//  teclado.useDelimiter("\\p{javaWhitespace}+")
//  .useLocale(Locale.getDefault(Locale.Category.FORMAT))
//  .useRadix(10);

  System.out.println("Reset reinicia delimitador, localizacion y base numerica");
  System.out.println("Demilitador es : " + teclado.delimiter());
  System.out.println("La localizacion es : " + teclado.locale().getCountry());
  System.out.println("La base numerica es : " + teclado.radix());
 }
}
