/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawsevilla.t3IntroProObjetos;

/**
 * @see @since 13-oct-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class Pajaro {

 private static int numeroObjetos = 1;

 /**
  *
  */
 private String nombre;

 /**
  *
  */
 private int posX, posY;

 /**
  * Se utiliza para inicializar los valores a su tipo estandar
  *
  * Numericos = 0;
  *
  * Caracter = '';
  *
  * Cadenas , Objetos , Referencias = null;
  *
  */
 public Pajaro() {
  System.out.println("Numero de objetos : " + getNumeroObjetos());
 }

 /**
  * Inicializa los valores de los objetos 'Pajaro' que vayamos creando
  *
  * @param nombre
  * @param posX
  * @param posY
  */
 public Pajaro(String nombre, int posX, int posY) {
  this.posX = posX;
  this.posY = posY;
  this.nombre = nombre;
  System.out.println("Numero de objetos : " + getNumeroObjetos());
 }

 public double volar(int posX, int posY) {
  double resultado = Math.sqrt((posX * posY) + (posX * posY));
  this.posX = posX;
  this.posY = posY;
  return resultado;
 }

 public static int getNumeroObjetos() {
  return numeroObjetos++;
 }

 public static void main(String[] args) {

  Pajaro loro0 = new Pajaro("Lucy1", 50, 50);
  Pajaro loro1 = new Pajaro("Lucy2", 150, 150);
  Pajaro loro2 = new Pajaro("Lucy3", 250, 250);
  System.runFinalization();
  Pajaro loro3 = new Pajaro("Lucy4", 350, 350);

  double volar = loro0.volar(50, 50);

  System.out.printf("- El desplazamiento ha sido de : %.2f \n", volar);
  System.out.printf("- Ver valores de \n• Posicion X : %d \n• Posicion Y : %d \n ", loro0.posX, loro0.posY);
  System.out.printf("- Ver valores de \n• Posicion X : %d \n• Posicion Y : %d \n ", loro1.posX, loro1.posY);
  System.out.printf("- Ver valores de \n• Posicion X : %d \n• Posicion Y : %d \n ", loro2.posX, loro2.posY);
  System.runFinalization();
  System.out.printf("- Ejecutar recolector : Ver valores de \n• Posicion X : %d \n• Posicion Y : %d \n ", loro3.posX, loro3.posY);

 }
}
