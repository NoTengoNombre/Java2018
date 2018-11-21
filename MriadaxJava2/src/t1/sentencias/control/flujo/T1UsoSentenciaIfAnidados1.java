/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.sentencias.control.flujo;

import java.util.Random;

/**
 * @see -
 * @since 18-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1UsoSentenciaIfAnidados1 {

 public static void main(String[] args) {
  int i = 0;
  int j = new Random().nextInt(100);
  int k = new Random().nextInt(100);
  double incto;

  if (i <= 100) {
   if( j > 10 ) incto = - 0.5f;
   if( k < 5 ) incto = 0.5f;
   else incto = .0f; // este else hace referencia a if( k < 5 )
  }else incto = 1.5F; // este else hace referencia a if (i <= 100)
 }
}
