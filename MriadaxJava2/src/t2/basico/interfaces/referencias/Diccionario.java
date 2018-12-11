/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.interfaces.referencias;

/**
 * @see p9
 * @since 06-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Diccionario implements Visualizar {

 public int numElementos;

 public Diccionario(int numElementos) {
  this.numElementos = numElementos;
 }

 public Diccionario() {
  this(10);
 }

 public int getCantidadElementos() {
  return numElementos;
 }

 @Override
 public void verUnaPareja(int pos) {
  System.out.println("Posicion : " + pos);
 }

 @Override
 public void verUnaParejaPorClave(Object clave) {
  System.out.println("Posicion : " + clave.toString());
 }

 @Override
 public void listarParejas() {
  System.out.println("Listar Parejas");
 }

 @Override
 public String toString() {
  return "Cantidad Elementos : " + getCantidadElementos();
 }

}
