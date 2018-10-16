/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t3IntroProObjetos.ejercicios.tarea3_03_Complejo.v0Complejo;

/**
 * @see Complejo
 * @since 16-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Main {

 public static void main(String[] args) {

  Complejo miNumero1 = new Complejo();
  Complejo miNumero2 = new Complejo(12, 2);

  double miReal = Teclado.getNumeroEntero();
  miNumero1.setReal(miReal);
  System.out.println("Mostrar numero real : " + miNumero1.getReal());

  double miImaginario = Teclado.getNumeroDecimal();
  miNumero1.setImaginario(miImaginario);
  System.out.println("Mostrar numero miImaginario : " + miNumero1.getImaginario());

  miNumero1.setSumar(miNumero1);
  miNumero1.setSumarMetodos(miNumero1);

  System.out.println("Mostrar numero real : " + miNumero2.getReal());
  System.out.println("Mostrar numero miImaginario : " + miNumero2.getImaginario());

  miNumero1.setSumar(miNumero2);
  miNumero1.setSumarMetodos(miNumero2);

 }
}
