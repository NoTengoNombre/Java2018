/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.interfaces.ej;

/**
 * @see p5
 * @since 06-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Diccionario {

 public int numElementos;

 public int getCantidadElementos() {
  return numElementos;
 }

 @Override
 public String toString() {
  return "numElementos : " + getCantidadElementos();
 }
}
