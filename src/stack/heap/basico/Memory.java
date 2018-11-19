/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack.heap.basico;

/**
 * @see https://stackify.com/java-heap-vs-stack/
 * @since 16-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Memory {

 /**
  *
  * @param args
  */
 public static void main(String[] args) { // line 1
  int i = 1; // line 2
  Object obj = new Object(); // line 3
  Memory memory = new Memory(); // line 4
  memory.foo(obj); // line 5
 } // line 9

 /**
  *
  * @param param
  */
 private void foo(Object param) { // line 6
  String str = param.toString(); // line 7
  System.out.println(str);
 } // line 8
}
