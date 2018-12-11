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
  Persona p2 = new Persona("Pepe Perez", "12345678H", (byte) 31, 'M', true);
  Persona p3 = new Persona(p2);
  Persona p4 = new Persona("Ana Pastora", "87654321H", (byte) 42, 'F', true);

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
   System.out.println("♦ Empleados : [Nombre : " + empleado.getNombre() + "][Edad : " + empleado.getEdad() + "]");
  }

  System.out.println("------- Comparar Objetos Personas ---------");
  boolean equivalente1 = p1.equals(e1);
  System.out.println("Son equivalentes Persona 1 y Empleado 1 : " + equivalente1);
  boolean equivalente2 = p1.equals(e2);
  System.out.println("Son equivalentes Persona 1 y Empleado 2 : " + equivalente2);
  boolean equivalente3 = p1.equals(e3);
  System.out.println("Son equivalentes Persona 1 y Empleado 3 : " + equivalente3);
  boolean equivalente4 = p1.equals(e4);
  System.out.println("Son equivalentes Persona 1 y Empleado 4 : " + equivalente4);
  boolean persona2y3 = p2.equals(p3);
  System.out.println("Son equivalentes Persona 2 y Persona 3 : " + persona2y3);

  System.out.println("------- Comparar Objetos Empleados ---------");
  boolean equivalente5 = e1.equals(e2);
  System.out.println("Son equivalentes Empleado 1 y Empleado 2 : " + equivalente5);
  boolean equivalente6 = e1.equals(e3);
  System.out.println("Son equivalentes Empleado 1 y Empleado 3 : " + equivalente6);
  boolean equivalente7 = e1.equals(e4);
  System.out.println("Son equivalentes Empleado 1 y Empleado 4 : " + equivalente7);

 }
}
