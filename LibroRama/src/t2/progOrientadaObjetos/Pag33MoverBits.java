/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.progOrientadaObjetos;

/**
 * @see @since 23-ago-2018
 * @version
 * @author Raul Vela Salas
 */
public class Pag33MoverBits {

 public static void main(String[] args) {

  System.out.println("valor en bytes : " + 0x100);

  int i = 0x100;
  i >>>= 1;
  System.out.println(i);
 }
}
