package gestionproductos.backend.test;

import java.util.Date;

import gestionproductos.services.impl.ProductoServicesImpl;

public class TestClass {

	private void run() {
		
//		List<Producto> productos = productoServices.getAll();
//		
//		for(Producto producto : productos){
//			System.out.println(producto);
//		}
		
//		Productos productoNuevo = new Producto(666,
//		
//		productoServices.create(
		
		ProductoServicesImpl psi = new ProductoServicesImpl();
		psi.getBetweenDates(new Date(""),new Date(""));
		
		
	}
	
	
	public static void main(String[] args) {
		new TestClass().run();
		
		

	}

}
