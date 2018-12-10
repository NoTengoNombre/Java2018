/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos.compuestos.string.basico;

import java.io.UnsupportedEncodingException;

/**
 * @see https://stackoverflow.com/questions/4385623/bytes-of-a-string-in-java
 * @since 10-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class StringBasicoCantidadBytesPorString {

 private static int sizeof(String string) {
  int numero = 36 + (string.length() * 2);
  return numero;
 }

 public static void main(String[] args) throws UnsupportedEncodingException {

  final String cadena = "Hello Friend";

  System.out.println("Longitud : " + cadena.length());

  byte[] bytes = cadena.getBytes();

  int totalBytes = 0;
  for (int i = 0; i < bytes.length; i++) {
   System.out.println(bytes[i]);
   totalBytes += bytes[i];
  }

  System.out.println("Total de bytes : " + totalBytes);

  final String string = "Hello World";

// Check length, in characters
  System.out.println(string.length()); // prints "11"

// Check encoded sizes
  final byte[] utf8Bytes = string.getBytes("UTF-8");
  System.out.println(utf8Bytes.length); // prints "11"

  final byte[] utf16Bytes = string.getBytes("UTF-16");
  System.out.println(utf16Bytes.length); // prints "24"

  final byte[] utf32Bytes = string.getBytes("UTF-32");
  System.out.println(utf32Bytes.length); // prints "44"

  final byte[] isoBytes = string.getBytes("ISO-8859-1");
  System.out.println(isoBytes.length); // prints "11"

  final byte[] winBytes = string.getBytes("CP1252");
  System.out.println(winBytes.length); // prints "11"
//  --------------------------------------------------
//  --------------------------------------------------
//sizeof(string) = 
//8 + // object header used by the VM
//8 + // 64-bit reference to char array (value)
//8 + string.length() * 2 + // character array itself (object header + 16-bit chars)
//4 + // offset integer
//4 + // count integer
//4 + // cached hash code
  int cantidad = sizeof(cadena);
  System.out.println("Cantidad total : " + cantidad);
 }

}
