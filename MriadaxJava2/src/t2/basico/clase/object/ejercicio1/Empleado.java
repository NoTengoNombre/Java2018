/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.clase.object.ejercicio1;

/**
 * SUBClase
 *
 * @see
 * <a href="https://miriadax.net/documents/91456252/91456480/6_ClaseSubclase.pdf/8aaec321-07fe-4a49-bf03-5852acf9ce6b">Enlace</a>
 * @since 25-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Empleado extends Persona {

 private String idPersonal;
 private float sueldo;

 public Empleado() {
  super();
 }

 public Empleado(String idPersonal, float sueldo) {
  super();
  this.idPersonal = idPersonal;
  this.sueldo = sueldo;
 }

 public Empleado(String idPersonal, float sueldo, String nombre, String DNI, byte edad, char sexo, boolean bCasado) {
  super(nombre, DNI, edad, sexo, bCasado);
  this.idPersonal = idPersonal;
  this.sueldo = sueldo;
 }

 public Empleado(String idPersonal, float sueldo, Persona person) {
  super(person);
  this.idPersonal = idPersonal;
  this.sueldo = sueldo;
 }

 public Empleado(String idPersonal, float sueldo, Persona person, String nombre, String DNI, byte edad, char sexo, boolean bCasado) {
  super(nombre, DNI, edad, sexo, bCasado);
  this.idPersonal = idPersonal;
  this.sueldo = sueldo;
 }

 public Empleado(Empleado emp) {
  this(emp.idPersonal, emp.sueldo);
 }

 public String getIdPersonal() {
  return idPersonal;
 }

 public void setIdPersonal(String idPersonal) {
  this.idPersonal = idPersonal;
 }

 public float getSueldo() {
  return sueldo;
 }

 public void setSueldo(float sueldo) {
  this.sueldo = sueldo;
 }

 @Override
 public String getNombre() {
  return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
 }

 @Override
 public void setNombre(String nombre) {
  super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
 }

 @Override
 public String getDNI() {
  return super.getDNI(); //To change body of generated methods, choose Tools | Templates.
 }

 @Override
 public void setDNI(String DNI) {
  super.setDNI(DNI); //To change body of generated methods, choose Tools | Templates.
 }

 @Override
 public byte getEdad() {
  return super.getEdad(); //To change body of generated methods, choose Tools | Templates.
 }

 @Override
 public void setEdad(byte edad) {
  super.setEdad(edad); //To change body of generated methods, choose Tools | Templates.
 }

 @Override
 public char getSexo() {
  return super.getSexo(); //To change body of generated methods, choose Tools | Templates.
 }

 @Override
 public void setSexo(char sexo) {
  super.setSexo(sexo); //To change body of generated methods, choose Tools | Templates.
 }

 @Override
 public boolean isbCasado() {
  return super.isbCasado(); //To change body of generated methods, choose Tools | Templates.
 }

 @Override
 public void setbCasado(boolean bCasado) {
  super.setbCasado(bCasado); //To change body of generated methods, choose Tools | Templates.
 }

 @Override
 public boolean equals(Object obj) {
  return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
 }

 @Override
 public int hashCode() {
  return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
 }

 @Override
 public void pintar() {
  System.out.println(
          "♠ Clase : " + getClass()
          + " hashCode : " + hashCode()
          + " IdPersonal : " + getIdPersonal()
          + " Sueldo : " + getSueldo()
          + " DNI : " + getDNI()
          + " Nombre : " + getNombre()
          + " Edad : " + getEdad()
          + " Sexo : " + getSexo()
          + " Casado " + ((isbCasado() == false) ? "Si" : "No"));
 }

 @Override
 public String toString() {
  return "[IdPersonal : " + getIdPersonal() + "]"
          + "[Sueldo : " + getSueldo() + "]"
          + "[DNI : " + getDNI() + "]"
          + "[Edad : " + getEdad() + "]"
          + "[Nombre : " + getNombre() + "]"
          + "[Sexo : " + getSexo() + "]"
          + "[Casado : " + isbCasado() + "]";
 }

}
