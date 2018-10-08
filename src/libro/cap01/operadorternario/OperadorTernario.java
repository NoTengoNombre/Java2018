/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap01.operadorternario;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class OperadorTernario {

 public static void main(String[] args) {

  for (int i = 0; i < 10; i++) {
   int a = (int) (Math.random() * (1 + 100) + 1);
   int b = (int) (Math.random() * (1 + 100) + 1);

   System.out.println("Valor de a"
           + " : " + a);
   System.out.println("Valor de b"
           + " : " + b);

   System.out.println(a > b ? "a es Mayor " : "a es Menor");
  }
 }
}
