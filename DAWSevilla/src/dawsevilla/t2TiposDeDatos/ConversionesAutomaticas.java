/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t2TiposDeDatos;

/**
 * @see pag 29
 * @since 09-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class ConversionesAutomaticas {

 public static void main(String[] args) {

  // Un tipo de dato se almacena en otro tipo de dato de mayor rango de bytes
  int ai = 5;
  int bi = 6;
  long resultado = ai + bi;
  System.out.println("Valor: " + resultado);

  byte ab = 6;
  byte bb = 6;
  int resultadob = ab + bb;
  System.out.println("Valor: " + resultadob);

  int a;
  byte b;
  a = 12;
  b = 12;

//  b = a; // almacenando un tipo de dato mayor bits en uno de menor de bits
  b = (byte) a;
  System.out.println("Valor convertido de int a byte para que entre en el rango de bits : " + b);

  char c = 'A';
  System.out.println(c);
  System.out.println("Poner el operador unario \"+c\" convierte la letra a numero : " + +c);

 }
}
