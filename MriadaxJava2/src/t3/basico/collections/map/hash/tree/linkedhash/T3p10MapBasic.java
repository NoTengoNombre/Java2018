/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.map.hash.tree.linkedhash;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @see p10
 * @since 10-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3p10MapBasic {

}

class HashTreeLinkedHashMaps {

 static String[] nombres = new String[]{
  "Pepe", "Laura", "Ana", "Luisa", "Manolo"
 };

 static Float[] cuotas = new Float[]{
  21.3f, 12.8f, 67.6f, 11.8f, 27.9f
 };

 public static void main(String[] args) {

  Map<String, Float> hashMap = new HashMap<>();

  Map<String, Float> treeMap = new TreeMap<>();

  Map<String, Float> linkedMap = new LinkedHashMap<>();

  for (int i = 0; i < nombres.length; i++) {
   hashMap.put(nombres[i], cuotas[i]);
   treeMap.put(nombres[i], cuotas[i]);
   linkedMap.put(nombres[i], cuotas[i]);
  }

  System.out.println("• Elementos de HashMap : " + hashMap.size());
  for (Map.Entry<String, Float> entrada : hashMap.entrySet()) {
   System.out.println("Clave : " + entrada.getKey() + " - Valor : " + entrada.getValue());
  }

  System.out.println("• Elementos de TreeMap : " + treeMap.size());
  for (Map.Entry<String, Float> entrada : treeMap.entrySet()) {
   System.out.println("Clave : " + entrada.getKey() + " - Valor : " + entrada.getValue());
  }

  System.out.println("♠ Elementos de LinkedMap : " + linkedMap.size());
  for (Map.Entry<String, Float> entrada : linkedMap.entrySet()) {
   System.out.println("Clave : " + entrada.getKey() + " - Valor : " + entrada.getValue());
  }

 }
}
