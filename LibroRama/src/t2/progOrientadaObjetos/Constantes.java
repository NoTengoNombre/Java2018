/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.progOrientadaObjetos;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class Constantes {

 public final static double PI = 3.141792;
 public final static String cadena = "CadenaCONSTANTE";
 public final static char caracteres = 'C';

 public static String cadena1 = "Cadena";

 public Constantes() {
  System.out.println("Constructor : PI " + PI);
  System.out.println("Constructor : cadena " + cadena);
  System.out.println("Constructor : caracteres " + caracteres);
  System.out.println("Constructor : variable local " + cadena1);
 }

 public double getPI() {
  return PI;
 }

 public String getCadena() {
  return cadena;
 }

 public char getCaracteres() {
  return caracteres;
 }

 public String getCadena1() {
  final String cadena2 = "otro";
  return cadena1.concat(cadena2);
 }

}
