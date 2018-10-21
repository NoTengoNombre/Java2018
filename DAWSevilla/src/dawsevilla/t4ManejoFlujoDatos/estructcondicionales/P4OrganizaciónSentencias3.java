/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t4ManejoFlujoDatos.estructcondicionales;

/**
 * @see pag3
 * @since 16-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class P4OrganizaciónSentencias3 {

 public static void main(String[] args) {

  //Modelo
  System.out.println("• Zona de declaracion de variables");
  int dia;
  int mes;
  int anio;
  String fecha;

  //Controlador
  System.out.println("▬ Zona de inicializacion o entrada de datos");
  dia = 10;
  mes = (int) (Math.random() * (1 + 12) + 1);
  anio = 2018;
  fecha = "";

  //Vista
  System.out.println("○ Zona de procesamiento");
  fecha = dia + "/" + mes + "/" + anio;
  System.out.println("Zona de salida");
  System.out.println("Organizar con zonas diferenciadas en el codigo");
  System.out.println("La fecha es : " + fecha);
 }
}
