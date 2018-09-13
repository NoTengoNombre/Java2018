/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejExternos.declaraciones;

/**
 * @see libro
 * @since 01-sep-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class EjemploDeclaracionVariablesString {

 public static void main(String[] args) {

  String cadena0 = null;
  System.out.println("Cadena : " + cadena0);

  String cadena1 = "cadena";
  System.out.println("Cadena 1 : " + cadena1);

  String cadena2 = new String();
  System.out.println("Cadena 2 : " + cadena2);

  String cadena3 = new String("Parametros");
  System.out.println("Cadena 3 : " + cadena3);

  String cadena4 = new String(new char['a']);
  for (int i = 0; i < cadena4.length(); i++) {
   if (i >= 80 && i < cadena4.length()) {
    System.out.println("• Posicion : " + i + " Cadena : " + cadena4);
   }
  }
  System.out.println("• Cadena 4 : " + cadena4);

//  Directamente te lo convierte
  char[] caracteresNuevo = {'a', 'b', 'c', 'b'};
  String cadena5 = new String(caracteresNuevo);
  System.out.println("Cadena 5 : " + cadena5);

  char[] caracteres = new char[10];
  for (int i = 0; i < caracteres.length; i++) {
   System.out.println("• Veces que se repite : " + i + " - " + caracteres.toString().charAt(i));
  }

 }

}
