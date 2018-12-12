/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.actividades.personas;

import java.util.Objects;

/**
 * @see -
 * @since 12-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Obrero extends Empleado {

 private String identificador;
 private String tipo;
 private String contrato;
 private String horario;

 /**
  * Construtor por defecto
  */
 public Obrero() {
  this("Sin identificador", "Sin tipo", "Sin contrato", "Sin horario");
 }

 /**
  *
  * @param obrero
  */
 public Obrero(Obrero obrero) {
  this.identificador = obrero.identificador;
  this.tipo = obrero.tipo;
  this.contrato = obrero.contrato;
  this.horario = obrero.horario;
 }

 /**
  * Construtor basico para inicializar los objetos de la propia clase y de la
  * superclase
  *
  * @param identificador
  * @param tipo
  * @param contrato
  * @param horario
  */
 public Obrero(String identificador, String tipo, String contrato, String horario) {
  super("Sin ID", 0);
  this.identificador = identificador;
  this.tipo = tipo;
  this.contrato = contrato;
  this.horario = horario;
 }

 /**
  * Construtor basico para inicializar los objetos con el objeto Persona como
  * parametro
  *
  * @param identificador
  * @param tipo
  * @param contrato
  * @param horario
  * @param emp
  */
 public Obrero(Empleado emp, String identificador, String tipo, String contrato, String horario) {
  super(emp);
  this.identificador = identificador;
  this.tipo = tipo;
  this.contrato = contrato;
  this.horario = horario;
 }

 public String getIdentificador() {
  return identificador;
 }

 public String getContrato() {
  return contrato;
 }

 public String getHorario() {
  return horario;
 }

 public String getTipo() {
  return tipo;
 }

 @Override
 public boolean equals(Object obj) {
  if (this == obj) {
   return true;
  }
  if (obj == null) {
   return false;
  }
  if (getClass() != obj.getClass()) {
   return false;
  }
  final Obrero other = (Obrero) obj;
  if (this.identificador != other.identificador) {
   return false;
  }
  if (this.contrato != other.contrato) {
   return false;
  }
  if (this.horario != other.horario) {
   return false;
  }
  if (this.tipo != other.tipo) {
   return false;
  }
  return true;
 }

 @Override
 public int hashCode() {
  int hash = 5;
  hash = 67 * hash + Objects.hashCode(this.contrato);
  hash = 67 * hash + Objects.hashCode(this.horario);
  hash = 67 * hash + Objects.hashCode(this.identificador);
  hash = 67 * hash + Objects.hashCode(this.tipo);
  return hash;
 }

 @Override
 public String toString() {
  return "◘ Obrero : [Contrato: " + getContrato()
          + " Horario: " + getHorario()
          + " Identificador: " + getIdentificador()
          + " Tipo: " + getTipo()
          + "]";

 }

}
