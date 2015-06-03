package pgn.examenMarzo.concesionarioCoches;



/**
 * Se limitar&oacute;n los colores a tres: plata, rojo y azul.
 * 
 * @author Jaime Herrerias Jimenez
 * @version 1.0
 * 
 */
public enum Color {
	PLATA, ROJO, AZUL;

	private static final Color[] VALUES = Color.values();
	/**
	 * Nos devuelve las opciones del men&uacute;
	 * @return
	 */
	public static String[] generarOpcionesMenu() {
		String[] opcionesMenu = new String[getValues().length + 1];
		int i = 0;
		for (Color color : getValues()) {
			opcionesMenu[i++] = color.name();
		}
		opcionesMenu[i] = "Salir";
		return opcionesMenu;
	}
	/**
	 * 
	 * @return valor de los colores
	 */
	public static Color[] getValues() {
		return VALUES;
	}

}
