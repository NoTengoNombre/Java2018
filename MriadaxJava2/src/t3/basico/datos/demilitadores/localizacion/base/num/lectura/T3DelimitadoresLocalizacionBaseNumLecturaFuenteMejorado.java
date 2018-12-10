/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.datos.demilitadores.localizacion.base.num.lectura;

import java.util.Scanner;

/**
 * @see p18
 * @since 08-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3DelimitadoresLocalizacionBaseNumLecturaFuenteMejorado {

}

class ScannerPruebasMejorado {

 public static void main(String[] args) {

  String string = "3 2 4 AF Pepe 8";
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

 }
}
