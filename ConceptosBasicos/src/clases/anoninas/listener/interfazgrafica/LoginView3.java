/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.anoninas.listener.interfazgrafica;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @see http://www.edu4java.com/es/swing/swing5.html
 * @since 13-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class LoginView3 {

 public static void main(String[] args) {

  JFrame frame = new JFrame("Demo application");
  frame.setSize(300, 150);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  placeComponents(frame);
  frame.setVisible(true);

 }

 private static void placeComponents(JFrame frame) {

  frame.setLayout(null);

  JLabel userLabel = new JLabel("User");
  userLabel.setBounds(10, 10, 10, 25);
  frame.add(userLabel);

  JTextField userText = new JTextField(20);
  userText.setBounds(100, 10, 160, 25);
  frame.add(userText);

  JLabel passwordLabel = new JLabel("Password");
  passwordLabel.setBounds(10, 40, 80, 25);
  frame.add(passwordLabel);

  JPasswordField passwordText = new JPasswordField(20);
  passwordText.setBounds(100, 40, 160, 25);
  frame.add(passwordText);

  JButton loginButton = new JButton("login");
  loginButton.setBounds(10, 80, 80, 25);
  frame.add(loginButton);

  JButton registerButton = new JButton("register");
  registerButton.setBounds(180, 80, 80, 25);
  frame.add(registerButton);

// Escuchador de eventos asociado a la Clase 'Intefaces' Anonima
  ActionListener loginButtonListener = new ActionListener() {
// Metodo que implementamos de la clase Anonima ActionListener
   @Override
   public void actionPerformed(ActionEvent e) {
    //Implementación del metodo actionPerformed de la clase Anonima ActionListener
    JButton source = (JButton) e.getSource();
    JOptionPane.showMessageDialog(source, source.getText() + " button has been pressed");
   }
  };

  loginButton.addActionListener(loginButtonListener);

// botonRegistro le agrego un actionListener
//-------------------------------------Clase Anonima
// Metodo que implementamos de la clase Anonima 'Intefaces' ActionListener
  registerButton.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent e) {
    //Implementación del metodo actionPerformed de la clase Anonima ActionListener
    JOptionPane.showMessageDialog((Component) e.getSource(), " button has been pressed");
   }
  });
 }

}
