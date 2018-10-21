/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.etiquetas;

/**
 * @see -
 * @since 18-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Etiquetas {

 public static void main(String[] args) {

  for (int i = 0; i < 3; i++) { // Creamos cabecera del bucle
//   2º- SE EJECUTARA Y SE SALTARA TODAS INSTRUCCIONES HASTA LLEGAR AL FINAL DE LAS LLAVES
   bloque_uno: // Creamos primera etiqueta : 
   {
    bloque_dos: // Creamos segunda etiqueta
    {
     System.out.println("Iteracion : " + i);
     if (i == 1) {
//   1º- SE EJECUTA CUANDO (i = 1)
      break bloque_uno; // Llevamos a cabo el primer salto : 
     }
     if (i == 2) {
      break bloque_dos; // Llevamos a cabo el segundo salto
     }
     System.out.println("Despues del bloque dos");
    }
    System.out.println("Despues del bloque uno");
   }
//  3º- INSTRUCCION SE EJECUTARA POR MEDIO DE LA ETIQUETA SALTANDOSE TODAS LAS 
//      DEMAS INSTRUCCIONES
   System.out.println("Fin del bloque");
  }
 }
}
