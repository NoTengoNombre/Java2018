/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.interfaces.metodo.xdefault;

/**
 * @see p8
 * @since 06-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public interface LimitesSistema {

 int XMAX = 300;
 int XMIN = 0;
 int YMAX = 500;
 int YMIN = 0;
}

/**
 *
 * @author MyDevelop
 */
class Punto implements LimitesSistema {

 private int x;
 private int y;
 private int aleatorio;

 /**
  *
  * @param x
  * @param y
  */
 public Punto(int x, int y) {
  normalizar(x, y);
 }

 /**
  *
  */
 public Punto() {
  this(new Punto().aleatorio, new Punto().aleatorio);
 }

 /**
  *
  * @return
  */
 public int getX() {
  return x;
 }

 /**
  *
  * @return
  */
 public int getY() {
  return y;
 }

 /**
  *
  * @return
  */
 public int getNumeroAleatorio() {
  return aleatorio = (int) (Math.random() * (1 + 10) + 1);
 }

 /**
  * Con esta funcion se asegura que ningun punto estara fuera de los limites del
  * sistema
  *
  * @param x
  * @param y
  */
 private void normalizar(int x, int y) {
  if (x > XMAX) {
   this.x = XMAX;
  } else if (x < XMIN) {
   this.x = XMIN;
  } else {
   this.x = x;
  }
  if (y > YMAX) {
   this.y = YMAX;
  } else if (y < YMIN) {
   this.y = YMIN;
  } else {
   this.y = y;
  }
 }

 /**
  * Devuelve los ATRIBUTOS 'getX' y 'getY'
  *
  * @return "Obtener 'x': " + getX() + " Obtener 'y': " + getY()
  */
 @Override
 public String toString() {
  return "Obtener 'x': " + getX() + " Obtener 'y': " + getY();
 }

}
