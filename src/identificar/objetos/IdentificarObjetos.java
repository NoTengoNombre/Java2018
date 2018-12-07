/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identificar.objetos;

/**
 * @see -
 * @since 22-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class IdentificarObjetos {

 public static void main(String[] args) {

  Base b = new Base(2, 'b');
  b.verNumero(); // identificar.objetos.Base@15db9742
  Base c = new Base(3, 'c');
  c.verNumero(); // identificar.objetos.Base@6d06d69c
  Base d = new Base(4, 'd');
  d.verNumero(); // identificar.objetos.Base@7852e922

// Ambas referencias apuntan al mismo OBJETO
  b = c;

  // Tienen la misma referencia hacia el objeto
  b.verNumero(); // identificar.objetos.Base@15db9742
  c.verNumero(); // identificar.objetos.Base@15db9742

  // Tienen los mismos parametros
  System.out.println(b.getLetra() + " " + b.getNumero());
  System.out.println(c.getLetra() + " " + c.getNumero());

 }
}

class Base {

 private int numero;
 private char letra;

 public Base(int numero, char letra) {
  this.numero = numero;
  this.letra = letra;
 }

 public Base() {
  this(1, 'a');
 }

 public char getLetra() {
  return letra;
 }

 public int getNumero() {
  return numero;
 }

 public void setLetra(char letra) {
  this.letra = letra;
 }

 public void setNumero(int numero) {
  this.numero = numero;
 }

 public void verNumero() {
  System.out.println(this);
 }

 @Override
 public String toString() {
  return super.toString(); //To change body of generated methods, choose Tools | Templates.
 }

}
