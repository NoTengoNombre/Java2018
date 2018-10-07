/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.progOrientadaObjetos;

/**
 * @see @since 21-ago-2018
 * @version
 * @author Raul Vela Salas
 */
public class OperadoresLogicos {

 public static void main(String[] args) {

  int m = 2, n = 5;
  boolean res;

  res = (m > n) && (m >= n);

  System.out.println("Respuesta : " + res);

  res = !(m < n || m != n);

  System.out.println("Respuesta : " + res);

 }
}
