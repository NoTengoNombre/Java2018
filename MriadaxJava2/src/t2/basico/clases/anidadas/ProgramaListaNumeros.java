/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.clases.anidadas;

import java.util.Random;

/**
 * @see p35
 * @since 23-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class ProgramaListaNumeros {

 public static void main(String[] args) {

  Random aleatorio = new Random(); // Crea una variable de instancia que apunta a una posición en la memoria HEAP que almacena un objeto 
  int cantidad_numeros = aleatorio.nextInt(10) + 1; // Invoco 
  ListaNumerosIterador milista = new ListaNumerosIterador(cantidad_numeros);

  for (int i = 0; i < cantidad_numeros; i++) {
   milista.add(aleatorio.nextInt());
  }

//     ClaseCONTENEDORA.ClaseInterior      
  ListaNumerosIterador.Iterador iterador = milista.getIterador();
  Integer numero;
//Declaracion/Asignacion 
  while ((numero = iterador.siguiente()) != null) {
   System.out.println(numero + " ");
  }
 }

}
