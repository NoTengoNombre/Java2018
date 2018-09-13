/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejExternos.GUI;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @see
 * https://www.binarykode.com/bdescargas/Manuales%20y%20Documentos/JAVA/Interfaces%20de%20Usuario/Tutorial%20JAVA%20avanzado%20(I)/swing/frame.html
 * @since 27-ago-2018
 * @version 1
 * @author Raul Vela Salas
 */
public class FrameDemo {

 private static final String MIME = "G:\\xRepositorio\\Java2018\\LibroProgramacionRama\\src\\ejemplosExternos\\GUI\\images\\giphy.gif";

 public static void main(String[] args) {

  JFrame frame = new JFrame("A Basic Frame");

  WindowListener winlistener = new WindowAdapter() {
   @Override
   public void windowClosing(WindowEvent e) {
    System.exit(0);
   }
  };
  frame.addWindowListener(winlistener);

  JLabel aLabel = new JLabel("Something to look at", new ImageIcon(MIME), JLabel.CENTER);
  aLabel.setVerticalTextPosition(JLabel.TOP);
  aLabel.setHorizontalTextPosition(JLabel.CENTER);
  frame.getContentPane().add(aLabel, BorderLayout.CENTER);
  frame.pack();
  frame.setVisible(true);
 }
}
