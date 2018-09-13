/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejExternos.GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @see https://gist.github.com/alvareztech/9022849#file-ventana-java-L10
 * @since 27-ago-2018
 * @version 1
 * @author Raul Vela Salas
 */
public class Ventana extends JFrame implements ActionListener {

 /**
  * Etiqueta o texto no editable
  */
 private JLabel texto;

 /**
  * Caja de TExto , para insertar datos
  */
 private JTextField caja;

 /**
  * Boton con una determinada Acción
  */
 private JButton boton;

 /**
  * Muestra la estructura que deberia tener una Ventana en Java con la libreria
  * Swing.
  *
  * Contiene :
  *
  * Una etiqueta
  *
  * Un caja de texto
  *
  * Un boton que tiene la accion de mostrar el texto en la caja por una ventana
  * de mensaje.
  */
 public Ventana() {
  super(); // Usamos el constructor de la clase padre JFrame
  configurarVentana(); // Configuramos la ventana
  inicializarComponentes(); // Inicializamos los atributos o componentes
 }

 /**
  * Establecemos los parametros de diseño y formato de la ventana
  */
 private void configurarVentana() {
  this.setSize(310, 210); // establecemos el tamanio de la ventana ( ancho , alto )
  this.setTitle("Esta es una Ventana"); // establecer titulo de la ventana
  this.setLocationRelativeTo(null); // establece que centramos la ventana en la pantalla 
  this.setLayout(null); // establece que no usamos ningun layout , solo asi podremos dar posiciones a los componentes
  this.setResizable(false); // establece que la ventana no sea redimensionable
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // establece que cuando se cierre la ventana termina el proceso
 }

 /**
  * Establecemos las dimensiones y
  */
 private void inicializarComponentes() {
// Creamos los componentes
  texto = new JLabel();
  caja = new JTextField();
  boton = new JButton();
// Configuramos los componentes
  texto.setText("Insertar Nombre"); // establece un texto a la etiqueta
  texto.setBounds(50, 50, 100, 25); // colocamos posicion y tamanio al texto (x, y , ancho , alto )
// Campo de texto
  caja.setBounds(150, 50, 100, 25); // colocamos posicion y tamanio a la caja de TEXTO (x, y , ancho , alto )
// Campo boton
  boton.setText("Mostrar Mensaje"); // colocamos un texto al boton
  boton.setBounds(50, 100, 200, 30); // colocamos posicion y tamanio al boton (x, y , ancho , alto )
  boton.addActionListener(this);  // hacemos que el boton tenga una accion y esa accion estara en esta clase 'this = este objeto'
// Adicionamos los componentes a la ventana
  this.add(texto);
  this.add(caja);
  this.add(boton);
 }

 /**
  *
  * @param e : Objeto de la clase ActionEvent
  */
 @Override
 public void actionPerformed(ActionEvent e) {
  String nombre = caja.getText(); // obtenemos el contenido de la caja de texto
  JOptionPane.showMessageDialog(this, "Hola " + nombre + " . "); // mostramos un mensaje (frame , mensaje)
 }

 public static void main(String[] args) {

  Ventana v = new Ventana(); // Creamos una ventana
  v.setVisible(true); // Hacemos visible la ventana creada
//--------------------------------------------------------------
// Creamos una ventana y lo hacemos visible en una sola linea sin instanciar objetos
//  new Ventana().setVisible(true); 
 }
}
