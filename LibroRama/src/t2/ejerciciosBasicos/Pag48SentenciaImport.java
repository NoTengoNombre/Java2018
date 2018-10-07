/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejerciciosBasicos;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Marco : Frame
 *
 * @see libro
 * @since 27-ago-2018
 * @version 1
 * @author Raul Vela Salas
 */
public class Pag48SentenciaImport {

 static Frame ventana = new Frame();

 public static void main(String[] args) {
  ventana.setTitle("• Mi Programa");
  ventana.setBackground(java.awt.Color.pink);
  ventana.setSize(200, 250);
  ventana.setVisible(true);

  ventana.addWindowListener(new WindowAdapter() {

   /**
    *
    * @param e
    */
   @Override
   public void windowClosing(WindowEvent e) {
    System.exit(0);
   }
  });

 }
}
