/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejemplos.Iteradores;

/**
 * @see @since 29-ago-2018
 * @version
 * @author Raul Vela Salas
 */
public class Empleado {

 private byte edad;
 private int sueldo;
 private double peso;
 private char sexo;
 private boolean casado;
 private String nombre;

 /**
  * Constructor basico
  */
 public Empleado() {
  this((byte) 0, 0, 0.0, 'x', true, "Desconocido");
 }

 /**
  * Constructor
  *
  * @param edad
  * @param sueldo
  * @param peso
  * @param sexo
  * @param casado
  * @param nombre
  */
 public Empleado(byte edad, int sueldo, double peso, char sexo, boolean casado, String nombre) {
  this.edad = edad;
  this.sueldo = sueldo;
  this.peso = peso;
  this.sexo = sexo;
  this.casado = casado;
  this.nombre = nombre;
 }

 public byte getEdad() {
  return edad;
 }

 public void setEdad(byte edad) {
  this.edad = edad;
 }

 public int getSueldo() {
  return sueldo;
 }

 public void setSueldo(int sueldo) {
  this.sueldo = sueldo;
 }

 public double getPeso() {
  return peso;
 }

 public void setPeso(double peso) {
  this.peso = peso;
 }

 public char getSexo() {
  return sexo;
 }

 public void setSexo(char sexo) {
  this.sexo = sexo;
 }

 public boolean getCasado() {
  return casado;
 }

 public void setCasado(boolean casado) {
  this.casado = casado;
 }

 public String getNombre() {
  return nombre;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 /**
  *
  * @return
  */
 public String dame_datos() {
  return "Nombre : " + getNombre()
          + " Sueldo : " + getSueldo()
          + " Edad : " + getEdad()
          + " Peso : " + getPeso()
          + " Sexo : " + getSexo()
          + " Casado : " + getCasado();
 }
}
