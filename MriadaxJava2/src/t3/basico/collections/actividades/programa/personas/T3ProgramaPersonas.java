/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.collections.actividades.programa.personas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import t3.basico.collections.actividades.personas.Empleado;
import t3.basico.collections.actividades.personas.Obrero;
import t3.basico.collections.actividades.personas.Persona;
import t3.basico.collections.actividades.personas.Tecnico;

/**
 * @see -
 * @since 12-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3ProgramaPersonas {

 public Object getGenerarPersona() {
  Random r = new Random();
  int valor = r.nextInt(5) + 1;
  Persona p = null;
  switch (valor) {
   case 1:
    p = new Empleado("e111", 1000.0F);
    break;
   case 2:
    p = new Obrero("o222", "construccion", "indefinido", "L-V");
    break;
   case 3:
    p = new Tecnico("delineante", "diseñadores gráficos", 100);
    break;
   case 4:
    p = new Obrero("o333", "mecanica", "temporal", "L-V");
    break;
   case 5:
    p = new Persona("Pepe Perez", "12345678X", (byte) 33, 'M', true);
    break;
   default:
    System.out.println("Sin empleados");
    break;
  }
  return p;
 }

 public static void main(String[] args) {

  List personas = new ArrayList(20);

  for (int i = 0; i < 20; i++) {
   personas.add(new T3ProgramaPersonas().getGenerarPersona());
  }

  personas.forEach((persona) -> {
   System.out.println(persona.toString());
  });

 }

}
