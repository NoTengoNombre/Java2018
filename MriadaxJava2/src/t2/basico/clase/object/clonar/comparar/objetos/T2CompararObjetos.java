/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.basico.clase.object.clonar.comparar.objetos;

/**
 * @see p18
 * @since 25-nov-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T2CompararObjetos {

 public static void main(String[] args) throws CloneNotSupportedException {

  Liso liso = new Liso("verde", 0.3F, 11.2f, "mms", 103, "Canal");
  Liso clonLiso = (Liso) liso.clone();

  System.out.println("    Liso : " + liso.hashCode());
  System.out.println("ClonLiso : " + clonLiso.hashCode());

  if (liso == clonLiso) {
   System.out.println("No son iguales ");
  } else {
   System.out.println("Son Clones");
   System.out.println(liso);
   System.out.println(clonLiso);
  }

 }
}
