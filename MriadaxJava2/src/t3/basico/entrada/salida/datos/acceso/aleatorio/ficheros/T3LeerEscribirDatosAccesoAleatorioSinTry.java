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
public class T3LeerEscribirDatosAccesoAleatorioSinTry {

 public static void main(String[] args) throws FileNotFoundException, IOException {

  Scanner sc = new Scanner(System.in);
  RandomAccessFile fichero = null;

  int numero;

  fichero = new RandomAccessFile("c:\\ficheros\\numeros.dat", "rw");
  mostrarFichero(fichero);

  System.out.println(fichero);
  System.out.println("♣ Introduce un numero entero: ");
  numero = sc.nextInt();
  fichero.seek(fichero.length());
  fichero.writeInt(numero);
  mostrarFichero(fichero);
  if (fichero != null) {
   fichero.close();
  }
 }
}

class FicheroRandom2 {

 /**
  * Mostrar fichero con acceso aleatorio dentro del archi
  *
  * @param fichero
  */
 public static void mostrarFichero(RandomAccessFile fichero) throws IOException {
  int n;
  fichero.seek(0);
  System.out.println("Inicio del fichero");
  while (true) {
   n = fichero.readInt();
   System.out.println(n);
  }
 }
}
