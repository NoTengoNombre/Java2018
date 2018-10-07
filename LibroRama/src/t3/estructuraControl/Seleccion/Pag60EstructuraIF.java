/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.estructuraControl.Seleccion;

/**
 * @see libro
 * @since 30-ago-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pag60EstructuraIF {

 public static void main(String[] args) {

  EstructuraIf eif = new EstructuraIf();
  EstructuraIf.getNumeroAleatorio();

  if (eif.getExpresion()) {
   System.out.println(eif.toString());
  }

 }
}

final class EstructuraIf {

 private final static int NUMALEATORIO = (int) (Math.random() * (1 + 100) + 100);
 private final boolean expresion = (NUMALEATORIO > 20);

 public EstructuraIf() {
  System.out.println("Numero Generado : " + getNumeroAleatorio());
 }

 public static int getNumeroAleatorio() {
  return EstructuraIf.NUMALEATORIO;
 }

 public boolean getExpresion() {
  return this.expresion;
 }

 @Override
 public String toString() {
  return "Obtener Expresion '" + getExpresion() + "' con el valor : " + getNumeroAleatorio();
 }

}
