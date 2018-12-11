/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.clase.xsystem.metodos;

import java.util.Map;

/**
 * @see p9
 * @since 27-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T2ClaseSystem {

 public static void main(String[] args) {

  System.out.println("Muestra las classpath");
  Map<String, String> variableEntorno = System.getenv();
  System.out.println("\u001B[33m" + variableEntorno + "\n");

  long currentTimeMillis = System.currentTimeMillis();
  System.out.println("Devuelve instante actual en milisegundos : " + currentTimeMillis);

  System.out.println("Ejecuta el recolector de basura - Usar Runtime");

  System.out.println("----------------------");
  System.out.println("file.separator : " + System.getProperty("file.separator"));
  System.out.println("java.class.path : " + System.getProperty("java.class.path"));
  System.out.println("java.home : " + System.getProperty("java.home"));
  System.out.println("java.version : " + System.getProperty("java.version"));
  System.out.println("java.vendo : " + System.getProperty("java.vendo"));
  System.out.println("java.vendor.url : " + System.getProperty("java.vendor.url"));
  System.out.println("line.separator : " + System.getProperty("line.separator"));
  System.out.println("----------------------");
  System.out.println("jos.arch : " + System.getProperty("jos.arch"));
  System.out.println("os.name : " + System.getProperty("os.name"));
  System.out.println("os.version : " + System.getProperty("os.version"));
  System.out.println("path.separator : " + System.getProperty("path.separator"));
  System.out.println("user.dir : " + System.getProperty("user.dir"));
  System.out.println("user.home : " + System.getProperty("user.home"));
  System.out.println("user.name : " + System.getProperty("user.name"));

  System.gc();
//La llamada System.exit (n) es efectivamente equivalente a la llamada: 
// Salida del programa de forma - Si descomenta esta linea no sigue ejecutando el siguiente codigo
//  Runtime.getRuntime().exit(0);
// Salida del programa de forma anormal
  Runtime.getRuntime().exit(1);
//  System.exit(0);
 }
}
