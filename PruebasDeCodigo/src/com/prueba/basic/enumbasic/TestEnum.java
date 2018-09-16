package com.prueba.basic.enumbasic;

/**
 * http://tutorials.jenkov.com/java/enums.html
 * 
 * @author Android
 *
 */
public class TestEnum {

	public static void main(String[] args) {

		// Instanciamos un Enum tipo 'Level' sacamos su objeto
		Niveles niveles = Niveles.HIGHER;

		System.out.println("Valores : " + niveles);

		for (Niveles indice : Niveles.values()) {
			switch (indice) {
			case HIGHER:
				System.out.println("HIGHER : toString " + Niveles.HIGHER.toString());
				break;
			case HIGH:
				System.out.println("HIGH : Comparacion : " + Niveles.HIGH.compareTo(Niveles.HIGHER));
				break;
			case MEDIUM:
				String cadena = Niveles.HIGH.toString();
				System.out.println("MEDIUM : " + Niveles.valueOf(cadena));
				if (Niveles.MEDIUM.compareTo(Niveles.HIGH) == 1) {
					System.out.println("Soy mayor : " + +Niveles.MEDIUM.compareTo(Niveles.HIGH));
				} else {
					System.out.println("Soy menor : " + Niveles.MEDIUM.compareTo(Niveles.HIGH));
				}
				break;
			case LOW:
				System.out.println("LOW : " + Niveles.LOW.getClass().toString());
				break;
			case LOWER:
				System.out.println("LOWER : " + Niveles.LOWER);
				break;
			default:
				System.out.println("Sin tipo Enum");
				break;
			}
		}

		System.out.println("------------------------");
		 

		TipoDeMadera[] values = TipoDeMadera.values();

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i].toString().toLowerCase());
		}

	}
}
