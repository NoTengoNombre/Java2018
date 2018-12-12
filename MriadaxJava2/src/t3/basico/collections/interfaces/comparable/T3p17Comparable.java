/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.interfaces.comparable;

/**
 * @see -
 * @since 11-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3p17Comparable {

 public static void main(String[] args) {
  T3Persona p1 = new T3Persona("Juan", 43, "b195012346");
  T3Persona p2 = new T3Persona("Pepe", 53, "a950123456");

  System.out.println(p1);
  System.out.println(p2);

  int hashCode1 = p1.hashCode();
  System.out.println("HashCode 1 : " + hashCode1);

  int hashCode2 = p2.hashCode();
  System.out.println("HashCode 2 : " + hashCode2);

  int comparacion = p1.compareTo(p2);
  System.out.println("Valor devuelto : " + comparacion);

  switch (comparacion) {
   case -1:
    System.out.println("Es menor que el pasado por parametro");
    break;
   case 0:
    System.out.println("Es igual que el pasado por parametro");
    break;
   case 1:
    System.out.println("Es Mayor que el pasado por parametro");
    break;
   default:
    System.out.println("Sin Comparacion");
    break;
  }
  System.out.println("Equivale : " + p1.equals(p2));
 }

}
