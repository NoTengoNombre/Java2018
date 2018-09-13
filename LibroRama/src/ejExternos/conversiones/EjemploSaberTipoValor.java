/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejExternos.conversiones;

/**
 * @see @since 01-sep-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class EjemploSaberTipoValor {

 public static Class<Integer> typeof(final int expr) {
  return Integer.TYPE;
 }

 public static Class<Long> typeof(final long expr) {
  return Long.TYPE;
 }

 public static void main(String[] args) {

  System.out.println(" --- Para Primitivos --- ");
  int i = 20;
  float f = 20.2f;
  System.out.println("Tipo valor : " + ((Object) i).getClass().getName());
  System.out.println("Tipo valor : " + ((Object) f).getClass().getName());

  System.out.println(" --- Para Objetos --- ");
  String a = "test";
  System.out.println("Tipo valor : " + a.getClass().getName());

  Object o = new Object();
  System.out.println("Tipo valor : " + o.getClass().getName());

  System.out.println(" --- Para Metodos --- ");

  System.out.println(typeof(500 * 3 - 2));
  System.out.println(typeof(50 % 3L));

 }
}
