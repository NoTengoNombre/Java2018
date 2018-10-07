/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rvssoft.gestionproductos.backend.dummydb;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.rvssoft.gestionproductos.backend.model.Familia;
import com.rvssoft.gestionproductos.backend.model.Producto;
import java.text.ParseException;

/**
 * Clase con DATOS
 *
 * @author Robot
 */
public class DummyDB {

 private static final Map<Integer, Producto> MAPA_PRODUCTOS = new HashMap<>();

 static {

  String strFecha1 = "10/12/2014";
  String strFecha2 = "10/12/2014";
  String strFecha3 = "11/12/2014";
  String strFecha4 = "12/12/2014";
  String strFecha5 = "12/12/2014";

  Date fecha1 = null;
  Date fecha2 = null;
  Date fecha3 = null;
  Date fecha4 = null;
  Date fecha5 = null;

  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  /*
    * parse : Analiza el texto desde el comienzo de la cadena dada para producir una
    * fecha. El método no puede usar el texto completo de la cadena dada.
   */
  try {
   fecha1 = sdf.parse(strFecha1);
   fecha2 = sdf.parse(strFecha2);
   fecha3 = sdf.parse(strFecha3);
   fecha4 = sdf.parse(strFecha4);
   fecha5 = sdf.parse(strFecha5);

  } catch (ParseException pa) {

   System.out.println("Excepcion : " + pa.getMessage());
  }

  Producto p1 = new Producto(3544, "ContaNerd", Familia.SOFTWARE, fecha1, 120.34);
  Producto p2 = new Producto(1923, "LaserJet 2P", Familia.HARDWARE, fecha2, 450.34);
  Producto p3 = new Producto(2566, "ContaNerd Deluxe", Familia.SOFTWARE, fecha3, 570.60);
  Producto p4 = new Producto(9835, "Alfombrilla Doraemon", Familia.CONSUMIBLE, fecha4, 15.20);
  Producto p5 = new Producto(1003, "Alfombrilla F.C. Barcelona", Familia.CONSUMIBLE, fecha5, 15.20);

  // Metodo tipo Maps
  MAPA_PRODUCTOS.put(p1.getCodigo(), p1);
  MAPA_PRODUCTOS.put(p2.getCodigo(), p2);
  MAPA_PRODUCTOS.put(p3.getCodigo(), p3);
  MAPA_PRODUCTOS.put(p4.getCodigo(), p4);
  MAPA_PRODUCTOS.put(p5.getCodigo(), p5);
 }

 public DummyDB() {

 }

 public Map<Integer, Producto> getMapaProductos() {
  return MAPA_PRODUCTOS;
 }
}
