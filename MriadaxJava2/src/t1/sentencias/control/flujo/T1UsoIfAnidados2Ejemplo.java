/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.sentencias.control.flujo;

import java.util.Random;

/**
 * @see p7
 * @since 18-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1UsoIfAnidados2Ejemplo {

 private static Coche marcha = new Coche();

 public static void main(String[] args) {

  int i = new NumeroConConstructor().getValor();

  System.out.println("Valor : " + i);

  if (i < 0) {
   marcha.setMarcha("frenar");
  } else if (i == 0) {
   marcha.setMarcha("punto muerto");
  } else {
   marcha.setMarcha("acelera");
  }

  System.out.println(marcha.getMarcha());

  System.out.println("----------------------");

  NumeroSinConstructor.getValor();

 }
}

class Coche {

 private String marcha;

 public Coche() {
  this("");
 }

 public Coche(String marcha) {
  this.marcha = marcha;
 }

 public void setMarcha(String marcha) {
  this.marcha = marcha;
 }

 public String getMarcha() {
  return marcha;
 }

 /**
  * Este metodo devuelve valor atributo
  *
  * @return getMarcha()
  */
 @Override
 public String toString() {
  return getMarcha();
 }
}

class Categorias {

 private String categoria;

 public Categorias() {
  categoria = "Sin Categoria";
 }

 public Categorias(String categoria) {
  this.categoria = categoria;
 }

 public void setCategoria(String categoria) {
  this.categoria = categoria;
 }

 public String getCategoria() {
  return categoria;
 }

 /**
  * @return getCategoria()
  */
 @Override
 public String toString() {
  return getCategoria();
 }

}

/**
 * Esta clase no sera heredada por nadie
 *
 * @author MyDevelop
 */
final class NumeroConConstructor {

 private static int valor;

 public NumeroConConstructor() {
  this(new Random().nextInt(3));
 }

 public NumeroConConstructor(int valor) {
  NumeroConConstructor.valor = valor;

 }

 public static void setValor(int valor) {
  NumeroConConstructor.valor = valor;
 }

 public static int getValor() {
  return valor;
 }
}

class NumeroSinConstructor {

 private static int valor;

 public NumeroSinConstructor() {
  this(valor = new Random().nextInt(10));
 }

 public NumeroSinConstructor(int valor) {
  NumeroSinConstructor.valor = valor;
 }

 public static void setValor(int valor) {
  NumeroSinConstructor.valor = valor;
 }

 public static int getValor() {
  return valor;
 }
}
