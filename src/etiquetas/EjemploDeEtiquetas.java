/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etiquetas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see "otra clase"
 * @since 07-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class EjemploDeEtiquetas {

 /**
  * Atributo de instancia
  */
 private String valorPorRef;

 /**
  * Atributo de instancia 'tipo referencia'
  */
 private EjemploDeEtiquetas a;

 /**
  * Atributo de instancia 'tipo primitivo'
  */
 private int x;
 private int b;

 /**
  *
  * @param a "nombre del argumento" "descripcion"
  * @return x "descripcion"
  * @throws java.io.IOException
  */
 public int getValor(EjemploDeEtiquetas a) throws IOException {
  this.b = 11;
  System.out.println("Metodo: " + a.x);
  a.x += b;
  return a.x;
 }

 public static void main(String[] args) {
  EjemploDeEtiquetas ede = new EjemploDeEtiquetas();
  ede.x = 10;
  try {
   ede.getValor(ede);
  } catch (IOException ex) {
   Logger.getLogger(EjemploDeEtiquetas.class.getName()).log(Level.SEVERE, null, ex);
  }

  System.out.println("Valor de 'b' : " + ede.b);
  System.out.println("Valor de ede.x : " + ede.x);
 }

}
