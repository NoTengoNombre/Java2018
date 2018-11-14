/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevillaejemplos.t4.excepciones.reanudacion;

/**
 * @see - pag 24
 * @since 09-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T4ExcepcionesConReanudacion {

 public static void main(String[] args) {

// Declaracion e Inicializacion
  boolean fueradelimites = true;
  int i;
// Long Array         0      1       2        3        4
  String texto[] = {"uno", "dos", "tres", "cuatro", "cinco"};

// Procesamiento
  while (fueradelimites) {
   try {
    i = (int) (Math.round((Math.random() * 9)));
// Si el indice del array esta fuera del rango 'Se lanza la excepcion' y se ejecuta el 'catch' 
    System.out.println("Posicion del array : " + i + " - Valor : " + texto[i]);
    fueradelimites = false; // Si se produce una catch 'excepcion' esta linea no se ejecuta
   } catch (ArrayIndexOutOfBoundsException exc) {
// Salida
    System.out.println("Indice seleccionado : " + exc.getMessage());
   }
  }
 }
}
