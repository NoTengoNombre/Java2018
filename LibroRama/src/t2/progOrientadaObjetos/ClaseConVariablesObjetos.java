/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.progOrientadaObjetos;

import java.util.Date;

/**
 * @see @since 21-ago-2018
 * @version
 * @author Raul Vela Salas
 */
public class ClaseConVariablesObjetos {

 private int sueldo;

 private Date fecha_ingreso;
 private Date fecha_ingreso2;

 public ClaseConVariablesObjetos() {

  this.sueldo = 20;

  this.fecha_ingreso = new Date(118, 5, 21);
  this.fecha_ingreso2 = new Date(118, 5, 21);

  boolean before = fecha_ingreso.before(fecha_ingreso2);
  System.out.println("♦ Fecha antes : " + before);

  before = fecha_ingreso2.before(fecha_ingreso);
  System.out.println("• Fecha antes : " + before);

 }

 public static void main(String[] args) {

  ClaseConVariablesObjetos ccvo = new ClaseConVariablesObjetos();

  System.out.println("♦ Fecha : " + ccvo.fecha_ingreso);
  System.out.println("• Fecha : " + ccvo.fecha_ingreso2);

 }

}
