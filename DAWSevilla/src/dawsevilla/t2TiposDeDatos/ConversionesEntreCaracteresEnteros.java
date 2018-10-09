/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t2TiposDeDatos;

/**
 * @see @since 09-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class ConversionesEntreCaracteresEnteros {

 public static void main(String[] args) {

  int num;
  double num2;
  char c;
  num = (int) 'A';
  System.out.println(num);
  c = (char) 97;
  System.out.println(c);
  c = (char) ((int) 'A' + 1);
  System.out.println(c);

  String cadena = "65";
  String cadena2 = "65.4";

  num = Byte.parseByte(cadena);
  System.out.println(num);

  num = Short.parseShort(cadena);
  System.out.println(num);

  num = Integer.parseInt(cadena);
  System.out.println(num);

  num2 = Float.parseFloat(cadena2);
  System.out.println(num);

  num2 = Double.parseDouble(cadena2);
  System.out.println(num);

 }
}
