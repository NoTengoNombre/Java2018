/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.entrada.salida.datos.acceso.aleatorio.ficheros;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static t3.basico.entrada.salida.datos.acceso.aleatorio.ficheros.FicheroRandom.mostrarFichero;

/**
 * @see p14
 * @since 08-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3LeerEscribirDatosAccesoAleatorio {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  RandomAccessFile fichero = null;

  int numero;

  try {
   fichero = new RandomAccessFile("c:\\ficheros\\numeros.dat", "rw");
   mostrarFichero(fichero);
  } catch (FileNotFoundException fnfe) {
   System.err.println("↨ Error - Archivo no encontrado : " + fnfe.getMessage());
  }
  System.out.println(fichero);
  System.out.println("♣ Introduce un numero entero: ");
  numero = sc.nextInt();
  try {
   fichero.seek(fichero.length());
   fichero.writeInt(numero);
   mostrarFichero(fichero);
  } catch (IOException ex) {
   System.err.println("♠ Mensaje de Error : " + ex.getMessage());
   Logger.getLogger(FicheroRandom.class.getName()).log(Level.SEVERE, null, ex);
  } catch (InputMismatchException ime) {
   System.out.println("♥ No se ha introducido un numero : " + ime.getMessage());
  } finally {
   if (fichero != null) {
    try {
     fichero.close();
    } catch (IOException ex) {
     System.err.println("• Mensaje de Error : " + ex.getMessage());
     Logger.getLogger(FicheroRandom.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
  }
 }
}

class FicheroRandom {

 /**
  * Mostrar fichero con acceso aleatorio dentro del archi
  *
  * @param fichero
  */
 public static void mostrarFichero(RandomAccessFile fichero) {
  int n;
  try {
   fichero.seek(0);
   System.out.println("Inicio del fichero");
   while (true) {
    n = fichero.readInt();
    System.out.println(n);
   }
  } catch (EOFException ex) {
   System.out.println("Error Fin de Fichero : " + ex.getMessage());
   Logger.getLogger(FicheroRandom.class.getName()).log(Level.SEVERE, null, ex);
  } catch (IOException ex) {
   System.out.println("Error IO : " + ex.getMessage());
   Logger.getLogger(FicheroRandom.class.getName()).log(Level.SEVERE, null, ex);
  }
 }
}
