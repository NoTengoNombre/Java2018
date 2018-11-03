/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.excepciones.fueralimitearray;

/**
 * @see -
 * @since 30-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class FueraLimiteArray {

 public static void main(String[] args) {

// Declaracion e Instanciación
  boolean fueraLimitesArray = true;
  int i;
  int veces = 0;
  String texto[] = {"uno", "dos", "tres", "cuatro", "cinco"};

// Procesamiento : Reanudación 
// Va a estar ejecutandose la instruccion/sentencia/accion hasta que se ejecute el valor correcto 
  while (fueraLimitesArray) {
   try {
    i = (int) (Math.round(Math.random() * 9));
    System.out.println("\u001B[33m" + texto[i].toUpperCase());
    fueraLimitesArray = false;
   } catch (ArrayIndexOutOfBoundsException exc) {
    System.out.println("\u001B[31mFallo en el indice : " + exc.getMessage() + " - Numero de veces : " + (++veces));
   }
  }

 }
}
