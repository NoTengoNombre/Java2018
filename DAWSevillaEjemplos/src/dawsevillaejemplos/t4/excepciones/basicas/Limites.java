/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevillaejemplos.t4.excepciones.basicas;

/**
 * @see http://dis.um.es/~bmoros/Tutorial/parte9/cap9-3.html
 * @since 09-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Limites extends Exception {

}

class DemasiadoCalor extends Limites {
}

class DemasiadoFrio extends Limites {
}

class DemasiadoRapido extends Limites {
}

class DemasiadoCansado extends Limites {
}

class Principal {

 public static void main(String[] args) {

  int temp = 10;
  int dormir = 0;

  try {
   if (temp > 40) {
    throw (new DemasiadoCalor());
   }
   if (dormir < 8) {
    throw (new DemasiadoCansado());
   }
  } catch (Limites lim) {
   if (lim instanceof DemasiadoCalor) {
    System.out.println("Capturada excesivo calor! : " + lim.getMessage());
    return;
   }
   if (lim instanceof DemasiadoCansado) {
    System.out.println("Capturada excesivo cansancio! : " + lim.getMessage());
//    return;
   }
  } finally {
   System.out.println("En la clausula finally");
  }
 }
}
