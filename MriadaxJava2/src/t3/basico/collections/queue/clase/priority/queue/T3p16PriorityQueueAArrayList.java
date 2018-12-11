/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.queue.clase.priority.queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @see p14
 * @since 10-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3p16PriorityQueueAArrayList {

 static int c = 1;

 public static void main(String[] args) {

  Random aleatorio = new Random();
  List<Number> listaNumeros = new ArrayList(10);

  System.out.println("Longitud : " + listaNumeros.size());

  for (int i = 0; i < 5; i++) {
   listaNumeros.add(aleatorio.nextDouble());
   listaNumeros.add(aleatorio.nextInt(100));
  }

  listaNumeros.forEach((numero) -> {
   System.out.println((c++) + " - " + numero);
  });

  Iterator<Number> iterator = listaNumeros.iterator();

  System.out.println("-------------------------");
  while (iterator.hasNext()) {
   Class clase = iterator.next().getClass();

   if (clase.equals(Float.class) || (clase.equals(Double.class))) {
    iterator.remove();
   }
  }

  c = 1;

  for (Iterator<Number> it = listaNumeros.iterator();
          it.hasNext();) {
   Number numero = it.next();
   System.out.println((c++) + " Valor : " + numero);
  }

 }
}
