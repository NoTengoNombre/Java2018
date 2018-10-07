/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoPorParametros;

/**
 * @see pdf pagina
 * @since 07-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class PasoPorParametros {

 byte x = 7;

 void haz(byte z) {
  z = 0;
  System.out.println(z);
 }

 public static void main(String[] args) {

  PasoPorParametros ppp = new PasoPorParametros();
  ppp.haz(ppp.x);

 }
}
