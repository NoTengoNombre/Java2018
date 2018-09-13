/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.ejemplos.Iteradores;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @see libro
 * @since 29-ago-2018
 * @version 1
 * @author Raul Vela Salas
 */
public class UsoEmpleado {

 public static void main(String[] args) {

  ArrayList<Empleado> listaEmpleados = new ArrayList<>();

  listaEmpleados.add(new Empleado((byte) 20, 1000, 45.0, 'f', true, "Ana"));
  listaEmpleados.add(new Empleado((byte) 21, 1200, 43.0, 'm', true, "Pepe"));
  listaEmpleados.add(new Empleado((byte) 31, 1500, 49.0, 'f', true, "Maria"));
  listaEmpleados.add(new Empleado((byte) 41, 2000, 65.0, 'm', true, "Paco"));
  listaEmpleados.add(new Empleado((byte) 51, 2500, 75.0, 'x', true, "Desconocido"));

  Iterator<Empleado> mi_iterator = listaEmpleados.iterator();

  while (mi_iterator.hasNext()) {
   String valores = mi_iterator.next().dame_datos();
   System.out.println(valores);
  }
 }

}
