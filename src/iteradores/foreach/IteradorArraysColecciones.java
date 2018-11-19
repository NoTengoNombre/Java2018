/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteradores.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @see apuntes
 * @since 07-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class IteradorArraysColecciones {

 public void verIteracionPrimitivos() {
  int[] a = {1, 2, 3, 4};
  for (int e : a) {
   System.out.println("Valores : " + e);
  }
 }

 public void verIteracionColecciones(List<Integer> lista) {
  for (int e : lista) {
   System.out.println("• Valores : " + e);
  }
  
  System.out.println("------------------");
  lista.forEach(p -> {
   System.out.println("- Valores : " + p);
  });
  
  System.out.println("------------------");
  lista.stream().forEach(p -> {
   System.out.println("+ Valores : " + p);
  });

  System.out.println("------------------");
  Iterator<Integer> itr = lista.iterator();
  int v1 = 0;
  int v2 = 0;
  while (itr.hasNext()) {
   System.out.println("+ Numero : " + itr.next());
  }
 }

 public int getNumero() {
  return (int) (Math.random() * (1000));
 }

 public static void main(String[] args) {

  IteradorArraysColecciones iac = new IteradorArraysColecciones();

  List<Integer> numeros = new ArrayList<>();
  numeros.add(iac.getNumero());
  numeros.add(iac.getNumero());
  numeros.add(iac.getNumero());
  numeros.add(iac.getNumero());
  numeros.add(iac.getNumero());
  iac.verIteracionColecciones(numeros);

 }
}
