package com.rvssoft.cajondesastre.excepciones;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestClassCheckedExceptions {

 public void m1() throws Exception {
  m2();
 }

 public void m2() throws Exception {
  m3();
 }

 /**
  * La excepci�n la lanza hacia arriba se refiere al metodo 'm2' y asi
  * sucesivamente hasta el main
  *
  * @throws Exception
  */
 public void m3() throws Exception {

  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  Date fecha = sdf.parse("18/04/1986");

 }

 /**
  * Aqui es la parte ideal para lanzar excepciones ejemplo : no podemos acceder
  * a una columna de una base de datos Columnas dinero Acceder una columna de
  * una bd
  *
  * @param args
  * @throws Exception
  */
 public static void main(String[] args) throws Exception {
  new TestClassCheckedExceptions().m1();
 }

}
