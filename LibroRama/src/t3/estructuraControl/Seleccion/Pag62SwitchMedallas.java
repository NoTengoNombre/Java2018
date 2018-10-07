/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.estructuraControl.Seleccion;

/**
 * @see libro
 * @since 31-ago-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pag62SwitchMedallas {

 public static void main(String[] args) {

  int contador = 0;
  int ganador = 0;

  do {
   int posicion = (int) (Math.random() * (1 + 15) + 1);
   switch (posicion) {
    case 0:
     if ((0 == posicion && ganador == 0)) {
      System.out.println(contador + " ♦ ORO : " + (posicion + 1));
      ganador++;
     } else {
      System.out.println(contador + " ♦ Posicion : " + (ganador++));
     }
     break;
    case 1:
     System.out.println(contador + " • PLATA : " + (posicion + 1));
     break;
    case 2:
     System.out.println(contador + " ○ COBRE : " + (posicion + 1));
     break;
    case 3:
     System.out.println(contador + " ♠ Posicion 4º : " + (posicion + 1));
     break;
    case 4:
     System.out.println(contador + " ♥ Posicion 5º : " + (posicion + 1));
     break;
    default:
     System.out.println(contador + " ▬ Posicion : " + (posicion + 1));
     break;
   }
  } while (contador++ <= 10);

 }

}
