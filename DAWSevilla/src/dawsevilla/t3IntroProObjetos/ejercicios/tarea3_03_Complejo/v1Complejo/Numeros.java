/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t3IntroProObjetos.ejercicios.tarea3_03_Complejo.v1Complejo;

/**
 * @see Ej 2
 * @since 15-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Numeros {

 public static void main(String[] args) {

  Complejo c1 = new Complejo();
  System.out.println("Valor Complejo : " + c1.toString());

  Complejo c2 = new Complejo();
  c2.cambia_Real(1.1f);
  c2.cambia_Imag(2.1f);
  System.out.printf("Valor Complejo : ", c2.toString());
  c2.sumarMetodos(c2);

 }
}
