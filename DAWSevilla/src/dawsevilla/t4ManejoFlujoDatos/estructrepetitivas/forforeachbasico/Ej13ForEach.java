/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.estructrepetitivas.forforeachbasico;

/**
 * @see @since 17-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Ej13ForEach {

 public enum Semana {
  lunes, martes, miercoles, jueves, viernes, sabado, domingo;
 }

 public static void main(String[] args) {

  String[] semana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

  int c = 0;
  for (String dia : semana) {
   System.out.println(++c + " - " + dia);
  }

  System.out.println("--------------------------");

  c = 0;
  for (Semana dia : Semana.values()) {
   System.out.println(++c + " - " + dia);
  }
 }
}
