/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t2TiposDeDatos;

/**
 * @see pag 25
 * @since 08-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class OperadorBits {

 private static int op1 = 10;
 private static int op2 = 11;

 public static void main(String[] args) {

  System.out.println("Valor op1 : " + op1);
  System.out.println("Valor op2 : " + op2);

  System.out.println("Complemento binario op1 " + ~(-op1));
  System.out.println("Realiza la operacion '&' AND binaria sobre op1 y op2 : " + (op1 & op2));
  System.out.println("Realiza la operacion '|' OR binaria sobre op1 y op2 : " + (op1 | op2));
  System.out.println("Realiza la operacion '^' OR-exclusivo(XOR) sobre op1 y op2 : " + (op1 ^ op2));
  System.out.println("Realiza la operacion << binaria sobre op1 << op2 : " + (op1 << op2));
  System.out.println("Realiza la operacion >> binaria sobre op1 >> op2 : " + (op1 >> op2));
  System.out.println("Realiza la operacion >>> binaria sobre op1 >>> op2 : " + (op1 >>> op2));

 }
}
