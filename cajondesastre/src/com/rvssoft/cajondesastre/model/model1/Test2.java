package com.rvssoft.cajondesastre.model.model1;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona();
		
		p1.setCodigo(23455);
		p1.setNombre("Pepín");
		p1.setApellido1("Galvez");
		p1.setApellido2("Ridruejo");
		p1.setSexo('h');
		p1.setCasado(true);
	
		/**
		System.out.println(p1.getCodigo());
		System.out.println(p1.getNombre());
		System.out.println(p1.getApellido1());	
		System.out.println(p1.getApellido2());	
		System.out.println(p1.getSexo());
		*/
		
		System.out.print(p1.toString());
		
		
		
		
		
	
	
	}
}
