/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

/**
 * @see @since 21-ago-2018
 * @version
 * @author Raul Vela Salas
 */
public class Pag31N1PalabrasAleatorias {

 /**
  *
  * @return char
  */
 public static char getLetras() {
  return (char) (Math.random() * 26 + 'a');
 }

 public static void main(String[] args) {

  for (int i = 0; i < 10; i++) {
   System.out.print(getLetras());
   if (i == 9) {
    System.out.print('\n');
   }
  }
 }
}
