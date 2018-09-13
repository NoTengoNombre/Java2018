/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.progOrientadaObjetos;

/**
 * @see @since 21-ago-2018
 * @version
 * @author Raul Vela Salas
 */
public class Suma {

 /**
  * Variable miembro instancia
  */
 int n2;

 /**
  * Variable miembro de clase
  */
 static int n1 = ((int) (Math.random() * (1 + 100) + 1));

 /**
  * Constructor por defecto
  */
 public Suma() {
  this.n2 = 20;
 }

 public Suma(int n2) {
  this.n2 = n2;
 }

 public void setN1(int n1) {
  Suma.n1 = n1;
 }

 public int getN1() {
  return Suma.n1;
 }

 public void setN2(int n2) {
  this.n2 = n2;
 }

 public int getN2() {
  return n2;
 }

 @Override
 public String toString() {
  return "♦ Suma.n1 : " + getN1() + " • n2 : " + getN2();
 }

}

class Suma2 {

 /**
  * Variable miembro instancia
  */
 int n3;

 /**
  * Variable miembro de clase
  */
 static int n4 = ((int) (Math.random() * (1 + 100) + 1));

 /**
  * Constructor por defecto
  */
 public Suma2() {
  this.n3 = 30;
 }

 /**
  * Constructor
  *
  * @param n3
  */
 public Suma2(int n3) {
  this.n3 = n3;
 }

 public void setN3(int n3) {
  this.n3 = n3;
 }

 public int getN3() {
  return n3;
 }

 public void setN4(int n4) {
  Suma2.n4 = n4;
 }

 public int getN4() {
  return n4;
 }

 @Override
 public String toString() {
  return "♦ Suma.n3 : " + getN3() + " • n4 : " + getN4();
 }

}
