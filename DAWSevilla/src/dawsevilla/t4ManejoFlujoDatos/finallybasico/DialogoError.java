/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.finallybasico;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Event;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

/**
 * @see http://dis.um.es/~bmoros/Tutorial/parte9/cap9-3.html
 * @since 18-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class DialogoError extends Dialog {

 public DialogoError(Frame padre) {
  super(padre, true);
  setLayout(new BorderLayout());

  Panel p = new Panel();
  p.add(new Button("¿ Continuar ?"));
  p.add(new Button(" Salir "));

  // Presentacion un panel con continuar o salir
  add("Center", new Label("Se ha producido un error. ¿ Continuar ?"));
  add("South", p);
 }

 @Override
 public boolean action(Event evt, Object obj) {
  if ("Salir".equals(obj)) {
   dispose();
   System.exit(1);
  }
  return (false);
 }

 public static void main(String[] args) {
  Frame f = new Frame("Ventana");
  DialogoError d = new DialogoError(f);

 }
}
