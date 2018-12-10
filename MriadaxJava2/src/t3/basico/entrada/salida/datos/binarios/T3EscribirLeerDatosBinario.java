/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.basico.entrada.salida.datos.binarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see p11
 * @since 07-dic-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class T3EscribirLeerDatosBinario {

}

class EscribirBinario {

 public static void main(String[] args) {

  Random aleatorio = new Random();
  DataOutputStream escribir = null;

  System.out.println("Escribir datos binarios en el archivo");
  try {
   boolean b = aleatorio.nextBoolean();
   System.out.println("Booleano : " + b);
   int n = aleatorio.nextInt();
   System.out.println("Entero : " + n);
   long l = (aleatorio.nextInt() * 10L);
   System.out.println("Long : " + l);
   float f = aleatorio.nextFloat();
   System.out.println("Float : " + f);
   try {
    escribir = new DataOutputStream(new FileOutputStream("c:\\ficheros\\outputdatos2.txt"));
   } catch (FileNotFoundException ex) {
    Logger.getLogger(EscribirBinario.class.getName()).log(Level.SEVERE, null, ex);
   }

   System.out.println("Escribe booleano");
   escribir.writeBoolean(b);
   System.out.println("Escribe int");
   escribir.writeInt(n);
   System.out.println("Escribe Long");
   escribir.writeLong(l);
   System.out.println("Escribe float");
   escribir.writeFloat(f);

  } catch (IOException ex) {
   Logger.getLogger(EscribirBinario.class.getName()).log(Level.SEVERE, null, ex);
  } finally {
   if (escribir != null) {
    try {
     escribir.close();
    } catch (IOException ex) {
     Logger.getLogger(EscribirBinario.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
  }

  System.out.println("Leer Datos Binarios del archivo creado");
  DataInputStream leer = null;
  try {
   leer = new DataInputStream(new FileInputStream("c:\\ficheros\\outputdatos2.txt"));
   System.out.println("Booleano : " + leer.readBoolean());
   System.out.println("Entero : " + leer.readInt());
   System.out.println("Long : " + leer.readLong());
   System.out.println("Float : " + leer.readFloat());
  } catch (FileNotFoundException ex) {
   Logger.getLogger(EscribirBinario.class.getName()).log(Level.SEVERE, null, ex);
  } catch (IOException ex) {
   Logger.getLogger(EscribirBinario.class.getName()).log(Level.SEVERE, null, ex);
  } finally {
   if (leer != null) {
    try {
     leer.close();
    } catch (IOException ex) {
     Logger.getLogger(EscribirBinario.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
  }
 }
}
