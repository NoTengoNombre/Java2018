/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t3IntroProObjetos.leerTeclado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see pag 33
 * @since 14-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class EntradaTecladoSystem {

 public static void main(String[] args) {

  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
  String cad = null;
  System.out.println("Introduce un numero");
  try {
   cad = br.readLine();
  } catch (IOException ex) {
   Logger.getLogger(EntradaTecladoSystem.class.getName()).log(Level.SEVERE, null, ex);
  }
  // salida por pantalla del texto introducido
  System.out.println("numero o palabra introducido : " + cad);

  System.out.println("Introduce un numero");
  int num = 0;
  try {
   num = Integer.parseInt(br.readLine());
  } catch (IOException | NumberFormatException ex) {
   Logger.getLogger(EntradaTecladoSystem.class.getName()).log(Level.SEVERE, null, ex);
   System.out.println("Error en la salida : " + ex.getLocalizedMessage());
  }
  System.out.printf("El numero introducido : %d \n", num);
 }
}
