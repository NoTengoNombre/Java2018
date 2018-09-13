/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.progOrientadaObjetos;

/**
 * @see Libro Rama
 * @since 25-ago-2018
 * @version 1
 * @author Raul Vela Salas
 */
public class Pag37EjemploDeClase {

}

/**
 * Clase Coche
 *
 * @author Robot
 */
class Coche {

 /**
  * Miembro de instancia
  */
 int ruedas;

 /**
  * Miembro de instancia
  */
 int peso;

 /**
  * Constructor de la clase
  */
 public Coche() {
  ruedas = 4;
  peso = 200;
 }

 /**
  * Constructor de la clase
  */
 public Coche(int ruedas, int peso) {
  this.ruedas = ruedas;
  this.peso = peso;
 }

}

/**
 *
 * @author Robot
 */
class Uso_Coche {

 public static void main(String[] args) {

  Coche c1 = new Coche();
  System.out.println("Ruedas : " + c1.ruedas);

  Coche c2 = new Coche(5, 200);
  System.out.println("Ruedas : " + c2.ruedas + " Peso : " + c2.peso + "kg");

 }
}
