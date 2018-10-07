package com.rvssoft.cajondesastre.model.override;

public class TestClass {
	public static void main(String[] args) {
//		Deportista d = new Deportista();
		//d.entrenar();
		//d.competir();
		//Ciclista c = new Ciclista();
		//c.entrenar();
		//c.competir();
		//Futbolista f = new Futbolista();
		//f.entrenar();
		//f.competir();
		
		Deportista d1 = new Deportista();
		Deportista d2 = new Ciclista();
		Deportista d3 = new Futbolista();
		
//		d1.entrenar();
	//	d2.entrenar();		
		//d3.entrenar();
		
		//d3 - Tratarlo como futbolista mediante un casting
		// Casting no seguro
		((Futbolista) d3).simularPenalty();
	
		Deportista deportista = getRandomDeportista();
		
		// obtener objeto de tipo futbolista
		if(deportista instanceof Futbolista) {
			//comprobar el tipo de isntancia para hacer
//			casting seguro
			Futbolista futbolista = (Futbolista) deportista;
			futbolista.simularPenalty();
		}
		
		// getClass = devuelve una clase y la comparo con la clase Futbolista
		if(deportista.getClass() == Futbolista.class) {
			Futbolista futbolista = (Futbolista) deportista;
			futbolista.simularPenalty();
		}
		
		Class clase = Futbolista.class;
		
	}

	
	private static Deportista getRandomDeportista() {
		if(Math.random() <0.5) {
			return new Ciclista();
		}else {
			System.out.println("Sin instancia del tipo Ciclista");
		}
		return new Ciclista();
	}
}
