/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.interfaces.referencias;

/**
 * @see p9
 * @since 07-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class MainInterface {

 public static void main(String[] args) {

  Diccionario midireccinario = new Diccionario();

  Visualizar visor = (Visualizar) midireccinario;

 }
}
