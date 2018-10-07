/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

/**
 * @see libro
 * @since 28-ago-2018
 * @version 1
 * @author Raul Vela Salas
 */
public class Pag54Ej2MiNumero {

 public static void main(String[] args) {

  MiNumero m = new MiNumero();
  System.out.println("• Doble : " + m.getDoble());
  System.out.println("• Triple : " + m.getTriple());
  System.out.println("• Cuatriple : " + m.getCuatriple());

  System.out.println("-------------------------------");

  MiNumero m1 = new MiNumero(5);
  System.out.println(m1.toString());

 }
}

/**
 *
 * @author Robot
 */
class MiNumero {

 /**
  * Miembro de instancia , dato , propiedad , atributo
  */
 private final int numero;

 /**
  *
  * @param num
  */
 public MiNumero(int num) {
  this.numero = num;
 }

 /**
  * Constructor por defecto
  */
 public MiNumero() {
  this.numero = 0;
 }

 /**
  *
  * @param num
  * @return
  */
 public double getDoble() {
  return Math.pow(this.numero, 2);
 }

 /**
  *
  * @param num
  * @return
  */
 public double getTriple() {
  return Math.pow(this.numero, 3);
 }

 /**
  *
  * @param num
  * @return
  */
 public double getCuatriple() {
  return Math.pow(this.numero, 4);
 }

 /**
  *
  * @return "Double : " + getDoble() + "\nTriple : " + getTriple() +
  * "\nCuatriple : " + getCuatriple();
  *
  */
 @Override
 public String toString() {
  return "Double : " + getDoble() + "\nTriple : " + getTriple() + "\nCuatriple : " + getCuatriple();
 }

}
