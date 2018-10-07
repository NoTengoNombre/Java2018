/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.estructuraControl.Seleccion;

/**
 * @see libro
 * @since 30-ago-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pag61IF_NotasAlumnos {

 public static void main(String[] args) {

  System.out.println(new Notas().toString());

  Notas n = new Notas();

  if (5 <= n.getMates()) {
   if (5 <= n.getLengua()) {
    if (5 <= n.getIngles()) {
     System.out.println(""
             + "• Aprobadas las Matematicas: " + n.getMates()
             + "\n• Aprobada la Lengua: " + n.getLengua()
             + "\n• Aprobado el Ingles: " + n.getIngles());
    } else {
     System.out.println("• Aprobadas las Matematicas: " + n.getMates());
     System.out.println("• Aprobado la Lengua: " + n.getLengua());
     System.out.println("• Suspenso el Ingles: " + n.getIngles());
    }
   } else {
    System.out.println("• Suspenso la Lengua: " + n.getLengua());
    System.out.println("• Aprobadas las Matematicas: " + n.getMates());
    if (n.getIngles() > 5) {
     System.out.println("• Aprobado el Ingles: " + n.getIngles());
    } else {
     System.out.println("• Suspenso el Ingles: " + n.getIngles());
    }
   }
  } else if (n.getLengua() >= 5) {
   System.out.println("♠ Suspenso las Matematicas: " + n.getMates());
   System.out.println("♠ Aprobada la Lengua: " + n.getLengua());
   if (n.getIngles() >= 5) {
    System.out.println("♠ Aprobado el Ingles: " + n.getIngles());
   } else {
    System.out.println("♠ Suspenso el Ingles: " + n.getIngles());
   }
  } else if (n.getIngles() >= 5) {
   System.out.println("○ Suspenso las Matematicas: " + n.getMates());
   System.out.println("○ Aprobado el Ingles: " + n.getIngles());
   if (n.getLengua() >= 5) {
    System.out.println("○ Aprobada la Lengua: " + n.getLengua());
   } else {
    System.out.println("○ Suspenso la Lengua: " + n.getLengua());
   }
  } else if ((n.getIngles() < 5) && (n.getLengua() < 5)) {
   System.out.println("○ Suspenso las Matematicas: " + n.getMates());
   System.out.println("○ Suspenso la Lengua: " + n.getLengua());
   System.out.println("○ Suspenso el Ingles: " + n.getIngles());
  }
 }
}

class Notas {

 private static int matesN = (int) (Math.random() * (1 + 9) + 1);
 private int mates;
 private static int lenguaN = (int) (Math.random() * (1 + 9) + 1);
 private int lengua;
 private static int inglesN = (int) (Math.random() * (1 + 9) + 1);
 private int ingles;

 public Notas(int mates, int lengua, int ingles) {
  this.mates = mates;
  this.lengua = lengua;
  this.ingles = ingles;
 }

 public Notas() {
  this(matesN, lenguaN, inglesN);
 }

 public int getMates() {
  return mates;
 }

 public int getLengua() {
  return lengua;
 }

 public int getIngles() {
  return ingles;
 }

 @Override
 public String toString() {
  return " ---> Asignaturas : Matematicas : " + getMates() + " Lengua : " + getLengua() + " Ingles : " + getIngles() + " <--- ";
 }

}
