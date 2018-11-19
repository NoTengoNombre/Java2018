/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.tiposcompuestos.arraysbasico;

/**
 * @see p13
 * @since 15-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T1VariablesAmbitoDuracion {

 public static void main(String[] args) {
//declaracion e inicializacion
//        Literal
  int i = 21;
//        Literal
  char ch = 'A';

//declaracion e inicializacion
//--------        Literal
  String nombre = "PEPE"; // 'nombre' es una referencia a un objeto 'String'

  float sueldo = 1245f, complemento = 321.5f; // varias asignacioens en una linea
  short a, c = 4, d = 6; // asignacion varios valores
  long numero = 4_567_890;
  float base = 6.0f, altura = 14.3f;
  double area = (base * altura) / 2;

  int x = 137, y = 6, z = 19, ii = 1, j = 5, k = 6;

  x %= y + z++; // Sentencia

  System.out.println("x : " + x);

  ii++; // Sentencia

  j = --k + ii; // Sentencia

  System.out.println("j : " + j);

 }
}
