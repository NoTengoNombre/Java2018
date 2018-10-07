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
public class Pag55Ej1ClaseNumero {

 public static void main(String[] args) {

  ClaseNumero cn = new ClaseNumero();
  cn.aniade(10);
  System.out.println(cn.toString());
  cn.resta(5);
  System.out.println(cn.toString());
  cn.aniade(10);
  System.out.println(cn.toString());
  System.out.println(cn.toString() + " Doble : " + cn.getDoble());
  System.out.println(cn.toString() + " Triple : " + cn.getTriple());
  cn.setNumero(11);
  System.out.println(cn.toString());
  cn.aniade(10);
  System.out.println(cn.toString());

  System.out.println("------------------------");
  ClaseNumero cn1 = new ClaseNumero(30);
  cn1.aniade(10);
  System.out.println(cn1.toString());
  cn1.resta(25);
  System.out.println(cn1.toString());
  System.out.println(cn1.toString() + " Doble : " + cn.getDoble());
  System.out.println(cn1.toString() + " Triple : " + cn.getTriple());
  cn1.setNumero(11);
  System.out.println(cn1.toString());
  cn1.aniade(10);
  System.out.println(cn1.toString());

  System.out.println("------------------------");
  ClaseNumero cn2 = new ClaseNumero(20);
  System.out.println(cn2.toString());
  System.out.println(cn2.toString() + " Doble : " + cn.getDoble());
  System.out.println(cn2.toString() + " Triple : " + cn.getTriple());

 }
}

class ClaseNumero {

 /**
  *
  */
 private int numero;
 /**
  * Una copia distinta por cada objeto
  */
 private final char c = (char) (Math.random() * 26 + 'a');

 public ClaseNumero() {
  numero = 0;
 }

 public ClaseNumero(int numero) {
  this.numero = numero;
 }

 public void aniade(int num) {
  this.numero += num;
 }

 public void resta(int num) {
  this.numero -= num;
 }

 public int getValor() {
  return numero;
 }

 public int getDoble() {
  return (int) (Math.pow(numero, 2));
 }

 public int getTriple() {
  return (int) (Math.pow(numero, 3));
 }

 public void setNumero(int num) {
  this.numero = num;
 }

 /**
  * Este metodo se
  *
  * @return
  */
 @Override
 public String toString() {
  return Character.toUpperCase(c) + " - Numero : " + numero;
 }

}
