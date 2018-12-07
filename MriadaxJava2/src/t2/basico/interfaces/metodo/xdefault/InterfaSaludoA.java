/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.interfaces.metodo.xdefault;

/**
 * @see p7
 * @since 06-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public interface InterfaSaludoA {

 public void decirAlgo();

 public void decirHola();

 public default void buenosDias() {
  System.out.println("Buenos dias");
 }

 public default void buenasTardes() {
  System.out.println("Buenos tardes");
 }

}
