/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejExternos.excepciones;

/**
 * @see http://elvex.ugr.es/decsai/java/pdf/B2-excepciones.pdf
 * @since 01-sep-2018
 * @version 1.0
 * @author Raul Vela Salas
 */
public class EjemploNoPropagacion {

 public void transferir(String IDorigen, String IDdestino, int cantidad) {
  Cuenta origen;
  Cuenta destino;

//  database.startTransaction();

//  try {

//   origen = database.find(IDorigen);

//   if (origen == null) {
//    throw new Exception("No existe  : " + IDorigen);

//    origen.setBalance(origen.getBalance() - cantidad);
//    database.store(origen);

//    destino = database.find(IDdestino);

//    if (destino == null) {
//     throw new Exception("No existe " + IDdestino);

//     destino.setBalance(destino.getBalance() + cantidad);
//     database.store(destino);

//     database.commit();
//    }
//   }
//  } catch (Exception error) {
   // Cancelar la transaccion
//   database.rollback;
//  }
 }

}
