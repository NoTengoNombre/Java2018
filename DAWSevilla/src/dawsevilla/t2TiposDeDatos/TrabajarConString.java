/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t2TiposDeDatos;

/**
 * @see pag 26
 * @since 09-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class TrabajarConString {

 public static void main(String[] args) {

  String cadena0 = "cadena";
  String cadena1 = "cadena".toUpperCase();
  System.out.println("Cadena: " + cadena0.length());
  System.out.println("Cadena: " + cadena0.concat(" caracteres"));
  System.out.println("Cadena: " + cadena0.equals(" caracteres"));
  String nuevaCadena = cadena0.substring(0, cadena0.length());
  System.out.println("Nueva Cadena : " + nuevaCadena);
  String nuevaCadena1 = cadena0.substring(0, cadena0.length() - 1);
  System.out.println("Nueva Cadena : " + nuevaCadena1);
  String nuevaCadena2 = cadena0.substring(0, cadena0.length() - 2);
  System.out.println("Nueva Cadena : " + nuevaCadena2);
  String nuevaCadena3 = cadena0.substring(0, cadena0.length() - 3);
  System.out.println("Nueva Cadena : " + nuevaCadena3);
  String nuevaCadena4 = cadena0.substring(0, cadena0.length() - 4);
  System.out.println("Nueva Cadena : " + nuevaCadena4);
  String nuevaCadena5 = cadena0.substring(0, cadena0.length() - 5);
  System.out.println("Nueva Cadena : " + nuevaCadena5);

  System.out.println("Cadena toUpperCase : " + cadena0.toUpperCase());
  System.out.println("CADENA toLowerCase : " + cadena0.toLowerCase());
  System.out.println("CADENA equalsIgnoreCase : " + cadena0.equalsIgnoreCase(cadena1));

  String caracter = String.valueOf('c');
  System.out.println("char : " + caracter);
  String numero = String.valueOf(1);
  System.out.println("numero : " + numero);
  String boleano = String.valueOf(true);
  System.out.println("booleano : " + boleano);
  String real = String.valueOf(11.11);
  System.out.println("real : " + real);
  String objeto = String.valueOf(new Object());
  System.out.println("objeto : " + objeto);

 }
}
