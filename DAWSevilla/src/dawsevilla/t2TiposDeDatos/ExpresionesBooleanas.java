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
public class ExpresionesBooleanas {

 public static final boolean A = false;
 public static final boolean B = true;

 public static void evaluar1Admiracion() {
  if (!A) {
   System.out.println("Devuelve true por cambiar el valor del operador");
  }
 }

 public static void evaluar1AND() {
  System.out.println(A & B ? "NO SE EVALUA ESTA CONDICION" : "Devuelve true si op1 y op2 son true");
 }

 public static void evaluar1OR() {
  System.out.println(B | A ? "Devuelve true si op1 u op2 son true" : "NO SE EVALUA ESTA CONDICION");
 }

 public static void evaluar1ORExclusivo() {
  System.out.println(B ^ A ? "Devuelve true si solo uno de los operandos es true" : "Devuelve true si solo uno de los operandos es true");
 }

 public static void evaluar2Ampersand() {
  if (A && B) {
   System.out.println("NO SE EVALUA ESTA CONDICION");
  } else {
   System.out.println("Si \"a\" es " + A + " no se sigue evaluando la siguiente condicion");
  }
 }

 public static void evaluar2OR() {
  if (A || B) {
   System.out.println("Devuelve true si op1 u op2 son true");
  } else {
   System.out.println("NO SE EVALUA ESTA CONDICION");
  }
 }

 public static void main(String[] args) {
  evaluar1Admiracion();
  evaluar1AND();
  evaluar1OR();
  evaluar1ORExclusivo();
  evaluar2Ampersand();
  evaluar2OR();
 }

}
