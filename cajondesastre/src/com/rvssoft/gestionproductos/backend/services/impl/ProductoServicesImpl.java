package com.rvssoft.gestionproductos.backend.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import com.rvssoft.gestionproductos.backend.dummydb.DummyDB;
import com.rvssoft.gestionproductos.backend.model.Familia;
import com.rvssoft.gestionproductos.backend.model.Producto;
import com.rvssoft.gestionproductos.backend.services.ProductoServices;

public class ProductoServicesImpl implements ProductoServices {

 private DummyDB dummyDB = new DummyDB();

 @Override
 public void create(Producto producto) {
  // TODO Auto-generated method stub
 }

 /**
  *
  * @param codigo
  * @return
  */
 @Override
 public Producto read(int codigo) {
  ArrayList<Producto> productosCol = new ArrayList<>();
  Producto producto = productosCol.get(codigo);
  System.out.println("Numero de Producto :" + producto);
  return producto;
 }

 @Override
 public List<Producto> getAll() {
  return new ArrayList<>(dummyDB.getMapaProductos().values());
 }

 @Override
 public List<Producto> getByFamilia(Familia familia) {
  return null;
 }

 @Override
 public List<Producto> getByPriceRange(double min, double max) {
  // TODO Auto-generated method stub
  return null;
 }

 @Override
 public List<Producto> getBetweenDates(Date fecha1, Date fecha2) {
  // TODO Auto-generated method stub
  return null;
 }

 @Override
 public Map<String, Integer> getNumeroProductosByFamilia() {
  // TODO Auto-generated method stub
  return null;
 }

 @Override
 public Map<String, Double> getPrecioMedioByFamilia() {
  // TODO Auto-generated method stub
  return null;
 }

 @Override
 public int incrementarPrecioToFamilia(double incremento, Familia familia) {
  // TODO Auto-generated method stub
  return 0;
 }

 @Override
 public int incrementarPrecioToProductList(double incremento, List<Producto> productos) {
  // TODO Auto-generated method stub
  return 0;
 }

}
