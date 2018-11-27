/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.clase.object.ejercicio1;

/**
 * @see
 * <a href="https://miriadax.net/documents/91456252/91456480/6_ClaseSubclase.pdf/8aaec321-07fe-4a49-bf03-5852acf9ce6b">Enlace</a>
 * @since 25-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class PruebaPersonas {

 static Empleado[] empleados = new Empleado[4];

 public static void main(String[] args) {

  Persona p1 = new Persona();
  Persona p2 = new Persona("Pepe Perez", "12345678H", (byte) 30, 'M', true);
  Persona p3 = new Persona(p2);
  Persona p4 = new Persona("Ana Pastora", "87654321H", (byte) 41, 'F', true);

  System.out.println("Persona 1: " + p1.toString());
  System.out.println("Persona 2: " + p2.toString());
  System.out.println("Persona 3: " + p3.toString());
  System.out.println("Persona 4: " + p4.toString());

  Empleado e1 = new Empleado();
  System.out.println("• Empleado 1: " + e1.toString());
  e1.pintar();
  Empleado e2 = new Empleado(e1);
  System.out.println("• Empleado 2: " + e2.toString());
  e2.pintar();
  Empleado e3 = new Empleado("a1234", 1000.0F, p3);
  System.out.println("• Empleado 3: " + e3.toString());
  e3.pintar();
  Empleado e4 = new Empleado("b4321", 1400.0f, p4);
  System.out.println("• Empleado 4: " + e4.toString());
  e4.pintar();

  empleados[0] = e1;
  empleados[1] = e2;
  empleados[2] = e3;
  empleados[3] = e4;

  for (Empleado empleado : empleados) {
// Cada empleado muestra sus datos formateados 
// porque tiene implementado el metodo toString
   System.out.println("♦ Empleados : " + empleado);
  }

 }
}
