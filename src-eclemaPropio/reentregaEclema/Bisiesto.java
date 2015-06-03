package reentregaEclema;

public class Bisiesto {

	/**
	 * Muestra si un año es o no bisiesto
	 *
	 * @param a año
	 */
	static void mostrarSiBisiesto(int x) {
		if (x % 4 == 0) {
			if (x % 100 == 0) {
				if (x % 400 == 0) {
					System.out.println("Es bisiesto");
				} else {
					System.out.println("No es bisiesto");
				}
			} else {
				System.out.println("Es bisiesto");
			}
		} else {
			System.out.println("No es bisiesto");
		}
	}
}