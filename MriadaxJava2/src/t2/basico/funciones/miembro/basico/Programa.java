/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.funciones.miembro.basico;

/**
 * @see @since 13-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Programa {

 public static void main(String[] args) {

  Clase01 objeto1 = new Clase01();
  objeto1.definirDatos();
  objeto1.leerDatos();

  Clase01 referencia = objeto1;
  referencia.leerDatos();

  Clase02 objeto2 = new Clase02();
  objeto2.leerDatos();

  System.out.println("--------------------------");

  Clase02 objeto22 = new Clase02(18, "Pepe Perez");
  objeto22.leerDatos();

  Clase02 objeto222 = new Clase02(objeto22);
  objeto222.leerDatos();

 }
}
