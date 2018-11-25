/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.sentencias.control.flujo;

import java.util.Random;

/**
 * @see -
 * @since 16-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1UsoSentenciaIF {

 public static void main(String[] args) {

  Random aleatorio = new Random();
  int num_ = aleatorio.nextInt() + 2;
  System.out.println("Numero : " + num_);
  if (num_ % 2 == 0) {
   System.out.println("El numero " + num_ + " es par ");
  }
// Tipo de Dato
//       variable instancia = Esta en el Stack y apunta al contenido del Constructor que se encuentra en el 'Heap' 
//                    reserva memoria en el 'Heap' para almacenar el objeto de la clase Random
//                        funcion Constructor 'Inicializa los Atributos 'pueden ser objetos 'otras clases' /primitivos'
  Random aleatorio1 = new Random();
  int num = 0, num1 = aleatorio1.nextInt(5), num2 = aleatorio1.nextInt(2500);
  do {
   num1 = aleatorio1.nextInt(5);
   if (num1 == 0) {
    num++;
   }
   try {
    System.out.println("• Division : " + (num2 / num1));
   } catch (java.lang.ArithmeticException ae) {
    System.out.println("\u001B[36m• Error en el mensaje : 1º" + ae.getMessage() + " - Valor de num1 : " + num1);

   }
  } while (num1 == 0);
  System.out.println("• Valor de num1 : " + num1 + " - Numero de veces que se ha salido 0 : " + num);
 }
}
