/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.clase.abstracta.ejercicio;



/**
 * @see -
 * @since 17-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3ClaseAbstracta {

 public static void main(String[] args) {
  Primera prim;
  Segunda seg = new Segunda();
  prim = seg;
//  prim.incrementar();
  prim.imprimir();

 }
}

/**
 *
 * @author MyDevelop
 */
abstract class Primera {

 /**
  *
  */
 int x;

 /**
  *
  */
 public Primera() {
  x = 8;
 }

 /**
  *
  */
 public abstract void imprimir();

}

/**
 *
 * @author MyDevelop
 */
class Segunda extends Primera {

 /**
  *
  */
 @Override
 public void imprimir() {
  x = 10;
 }

 /**
  * Incrementar
  */
 public void incrementar() {
  x++;
 }

}
