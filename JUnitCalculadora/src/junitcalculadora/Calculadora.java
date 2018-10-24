/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitcalculadora;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @see https://jagonzalez.org/formulario-basico-en-java/
 * @author Robot
 */
public class Calculadora extends JPanel implements ActionListener {

 static Operaciones op = new Operaciones();

 JButton bt1;//Creando variables globales de los botones
 JButton bt2;//Creando variables globales de los botones
 JLabel jl1, jl2, jl3;//Creando variables globales para las etiquetas
 JTextField jt1, jt2, jt3;//Creando variables globales para los campos de texto
 JFrame jf = new JFrame("Formulario Basico Java");//Creacion de ventana con el titulo

 public Calculadora() { // Constructor de la clase

  jf.setLayout(new FlowLayout()); // Configurar como se dispondra el espacio del jFrame
  Dimension d = new Dimension(); // Objeto para obtener el ancho de la pantalla

  //Instanciando etiquetas
  jl1 = new JLabel("Numero 1");
  jl2 = new JLabel("Numero 2");
  jl3 = new JLabel("=");

//  Instanciando cuadros de texto
  jt1 = new JTextField(5);
  jt2 = new JTextField(5);
  jt3 = new JTextField(2);

//  Instanciando boton con texto
  bt1 = new JButton("+");
  bt2 = new JButton("-");

//  Añadiendo objetos a la ventana
  jf.add(jl1);
  jf.add(jt1);

  jf.add(bt1);
  jf.add(bt2);

  jf.add(jl2);
  jf.add(jt2);

  jf.add(jl3);
  jf.add(jt3);

//  margenes para texto en boton
  bt1.setMargin(new Insets(1, 5, 1, 5));
  bt2.setMargin(new Insets(1, 5, 1, 5));

//  añadiendo el listener a los botones para manipular los eventos del click
  bt1.addActionListener(this); // este objeto
  bt2.addActionListener(this); // este objeto

  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Finaliza el programa cuando se da click en la X
  jf.setResizable(false); // para configurar si se redimensiona la ventana
  jf.setLocation((int) ((d.getWidth() / 2) + 290), 150); //para ubicar inicialmente donde se muestra la ventana (x, y) respecto a la pantalla principal
  jf.setSize(400, 250); // configurando tamaño de la ventana (ancho , alto);
  jf.setVisible(true); // configurando visualizacion de la venta
 }

 /**
  * @param args the command line arguments
  */
 public static void main(String[] args) {
  new Calculadora(); // Uso de Constructor para la ventana
 }

 /**
  * Sobreescribir el metodo del listener
  *
  * @param e
  */
 @Override
 public void actionPerformed(ActionEvent e) {

  double n1, n2, nr; // Variables que almacenaran los numeros de los campos de texto

  if (e.getSource() == bt1) { // Podemos comparar por el contenido del boton

   // Los campos de texto son de tipo String 
//   asi que tomamos la cadena con el metodo .getText() 
// y lo almacenamos en la variable
   n1 = Double.parseDouble(jt1.getText());
   n2 = Double.parseDouble(jt2.getText());

   nr = (op.sumar(n1, n2)); // realizamos la operacion

   jt3.setText("" + nr); // mostramos el valor mediante el metodo .setText() como 
//   muestra cadena anteponemos una cadena vacia y concatenamos el resultado
  }

  double n11, n22, nrr; // Variables que almacenaran los numeros de los campos de texto

  if (e.getSource() == bt2) { // Podemos comparar por el contenido del boton

   // Los campos de texto son de tipo String 
//   asi que tomamos la cadena con el metodo .getText() 
// y lo almacenamos en la variable
   n11 = Double.parseDouble(jt1.getText());
   n22 = Double.parseDouble(jt2.getText());

   nrr = (op.restar(n11, n22)); // realizamos la operacion

   jt3.setText("" + nrr); // mostramos el valor mediante el metodo .setText() como 
//   muestra cadena anteponemos una cadena vacia y concatenamos el resultado
  }

 }

}
