/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.funciones.miembro.basico;

import java.util.Scanner;

/**
 * @see -
 * @since 13-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Clase01 {

 private int numero;
 private String nombre;

 public void definirDatos() {
  Scanner teclado = new Scanner(System.in);
  System.out.println("Teclea un nombre: ");
  nombre = teclado.nextLine();
  System.out.println("Teclea un numero: ");
  numero = teclado.nextInt();
 }

 public void leerDatos() {
  System.out.println("Nombre : " + nombre);
  System.out.println("Numero : " + numero);
 }

}
