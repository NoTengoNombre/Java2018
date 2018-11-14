/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.system.basic;

/**
 * @see -
 * @since 10-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class ClaseSystemSO {

 private static String OS = System.getProperty("os.name").toLowerCase();
 private static String OSArch = System.getProperty("os.arch").toLowerCase();
 private static String OSVersion = System.getProperty("os.version").toLowerCase();

 public static void main(String[] args) {

  System.out.println("Sistema Operativo");

  System.out.println("- SO : " + OS);
  System.out.println("- Arquitectura SO : " + OSArch);
  System.out.println("- Version SO : " + OSVersion);

  if (isWindows()) {
   System.out.println("Es un Windows");
  } else if (isWindows()) {
   System.out.println("Es un Mac");
  } else if (isWindows()) {
   System.out.println("Es un Unix/Linux");
  } else if (isWindows()) {
   System.out.println("Es Solaris");
  } else {
   System.out.println("Sistema operativo no reconocido");
  }

 }

 /**
  *
  * @return
  */
 public static boolean isWindows() {
  return (OS.indexOf("win") >= 0);
 }

 /**
  *
  * @return
  */
 public static boolean isMac() {
  return (OS.indexOf("mac") >= 0);
 }

 /**
  *
  * @return
  */
 public static boolean isUnix() {
  return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0);
 }

 /**
  *
  * @return
  */
 public static boolean isSolaris() {
  return (OS.indexOf("sunos") >= 0);
 }

}
