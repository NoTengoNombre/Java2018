/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejExternos.incrementoDecremento;

/**
 * @see libro
 * @since 31-ago-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Ejemplo_IncrementoDecremento {

 public static void main(String[] args) {

  int i = 0;
  System.out.println(i += 1); // i = i + 1 --> i = 0 + 1 => 1
  System.out.println(i += 1); // i = i + 1 --> i = 1 + 1 => 2
  System.out.println(i += 1); // i = i + 1 --> i = 2 + 1 => 3
  System.out.println(i += 1); // i = i + 1 --> i = 3 + 1 => 4
  System.out.println("---------------");
  System.out.println(i -= 1); // i = i - 1 --> i = 4 - 1 => 3
  System.out.println(i -= 1); // i = i - 1 --> i = 3 - 1 => 2
  System.out.println(i -= 1); // i = i - 1 --> i = 2 - 1 => 1
  System.out.println(i -= 1); // i = i - 1 --> i = 1 - 1 => 0
  System.out.println("---------------");
  System.out.println(i += 2); // i = i + 2 --> i = 0 + 2 => 2
  System.out.println(i += 2); // i = i + 2 --> i = 2 + 2 => 4
  System.out.println(i += 2); // i = i + 2 --> i = 4 + 2 => 6
  System.out.println(i += 2); // i = i + 2 --> i = 6 + 2 => 8
  System.out.println("---------------");
  System.out.println(i -= 2);
  System.out.println(i -= 2);
  System.out.println(i -= 2);
  System.out.println(i -= 2);
  System.out.println("---------------");
  System.out.println(i += 2);
  System.out.println(i = i + 2);
  System.out.println(i = i + 3);
  System.out.println(i = i + 4);

 }
}
