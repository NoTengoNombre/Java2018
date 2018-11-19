/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.tiposcompuestos.arraysbasico;

/**
 * @see -
 * @since 15-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1TipoWrapper {

 public static void main(String[] args) {
  float sueldo = 1_245.8F;
  System.out.println("Sueldo : " + sueldo);

  Float oSueldo = sueldo;
  System.out.println("Cadena : " + oSueldo);

  Float oSueldoInstancia = new Float(sueldo);
  System.out.println("Instancia de sueldo : " + oSueldoInstancia);

  String sueldoString = "1245.8";
  Float oSueldoString = new Float(sueldoString);
  System.out.println("Sueldo String : " + oSueldoString);

  Float peso = Float.valueOf("73.2");
  System.out.println("De String a Float : " + peso);
  Float unbyte = Float.valueOf("00101011");
  System.out.println("String binario a Float : " + unbyte);

  Long oNif = new Long("05221791");
  long nif = oNif;
  System.out.println("oNif instanceof Long : " + (oNif instanceof Long));
//  Tipo primitivo 
//  System.out.println("oNif instanceof Long : " + (nif instanceof Long));
  System.out.println(nif);

 }
}
