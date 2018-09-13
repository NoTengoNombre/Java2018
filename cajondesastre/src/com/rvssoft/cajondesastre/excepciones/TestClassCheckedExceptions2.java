package com.rvssoft.cajondesastre.excepciones;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestClassCheckedExceptions2 {

 public void m1() {
  try {
   m2();
  } catch (Exception e) {
   e.printStackTrace();
// siempre se ejecuta aunque pongas return
//pero si pones un System.exit(0);
  } finally {
   System.out.println("Se ejecuta siempre");
  }

  // Se ejecuta "funciones si o no"
//		try {
//			
//		}finally {
//			
//		}
 }

 public void m2() throws Exception {
  m3();
 }

 /**
  * La excepci�n la lanza hacia arriba se refiere al metodo 'm2' y asi
  * sucesivamente hasta el main
  *
  * @throws ParseException
  *
  * @throws Exception
  */
 public void m3() throws Exception {

  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  Date fecha = sdf.parse("18op/04/1986");

 }

 /**
  * Aqui es la parte ideal para lanzar excepciones ejemplo : no podemos acceder
  * a una columna de una base de datos Columnas dinero Acceder una columna de
  * una bd
  *
  * @param args
  * @throws Exception
  */
 public static void main(String[] args) {
  new TestClassCheckedExceptions2().m1();
 }

}
