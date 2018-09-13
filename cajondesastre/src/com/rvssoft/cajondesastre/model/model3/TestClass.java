package com.rvssoft.cajondesastre.model.model3;

public class TestClass {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("46233289Q","Pepin","Galvez",true);
		Taxista t1 = new Taxista("27645583K","Honorio","Martin","AS45544");
		
//		Persona p1 = new Persona("37661234P","Clara","Roldan");
	
		Persona p1 = new Cliente("23443892L","Anna","Rius",true);
		Persona p2 = new Taxista("38772438F","Segismundo","Oña","SA23");
	
		//Abstraccion
		Object o1 = new Cliente("34555356","Luis","Sanchez",true);
		
		// Cliente c2 = new Object(); si creo una bola de object , object hace 4 cosas , lo del mando a distancia lo que hace , de un c2 es poder usar los metodos de la clase Cliente
		// no puedo utilizar los metods de una clase que esta por encima de la instanciada
		// declarar variable de la clase más abstracta posible , sera una interface que la clase más abstracta
		// izquierda interface y derecha instancia
		
		System.out.println(c1);
		
	}
}
