/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejExternos.excepciones;

/**
 *
 * @author Robot
 */
class Cuenta {

 private String id;
 private String nombreCompleto;
 private String localidad;
 private String oficina;
 private double balance;

 public Cuenta() {
  this.id = null;
  this.nombreCompleto = null;
  this.localidad = null;
  this.oficina = null;
  this.balance = 0;
 }

 public Cuenta(String ID, String NombreCompleto, String Localidad, String Oficina, double balance) {
  this.id = ID;
  this.nombreCompleto = NombreCompleto;
  this.localidad = Localidad;
  this.oficina = Oficina;
  this.balance = balance;
 }

 public double setBalance() {
  return 1000;
 }

}
