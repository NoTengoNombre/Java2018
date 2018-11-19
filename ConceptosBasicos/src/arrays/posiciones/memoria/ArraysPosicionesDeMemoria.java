/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.posiciones.memoria;

/**
 * @see @since 14-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class ArraysPosicionesDeMemoria {

 public static void main(String[] args) {
  //  https://stackoverflow.com/questions/3442090/java-what-is-this-ljava-lang-object
// Si este objeto de clase representa una clase de arrays, 
//la forma interna del nombre consiste en el nombre del 
//tipo de elemento precedido por uno o más caracteres '[' que 
//representan la profundidad del anidamiento del array. 
//La codificación de los nombres de los tipos de elementos es la siguiente:
//Element Type        Encoding
//boolean             Z
//byte                B
//char                C
//double              D
//float               F
//int                 I
//long                J
//short               S 
//class or interface  Lclassname;
  System.out.println("La codificación de los nombres de los tipos de elementos " + new int[0][0][7]);
  System.out.println("La codificación de los nombres de los tipos de elementos " + new String[4][2]);
  System.out.println("La codificación de los nombres de los tipos de elementos " + new boolean[256]);

 }
}
