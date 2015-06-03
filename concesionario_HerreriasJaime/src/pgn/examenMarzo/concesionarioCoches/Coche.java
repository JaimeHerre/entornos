package pgn.examenMarzo.concesionarioCoches;

import java.util.regex.Pattern;
/**
 * 
 * @author Jaime Herrerias Jimenez
 * @version 1.0
 *
 */
public class Coche {
	/**matr&iacute;cula del coche*/
	private String matricula;
	/**Color del coche*/
	private Color color;
	/**Modelo de un coche*/
	private Modelo modelo;
	/**Patron de matricula*/
	static final private Pattern patternMatricula = Pattern
			.compile("^\\d{4}[ -]?[[B-Z]&&[^QEIOU]]{3}$");
	/**
	 * Constructor de un coche
	 * @param matricula 
	 * @param color
	 * @param modelo
	 */
	private Coche(String matricula, Color color, Modelo modelo) {
		super();
		setMatricula(matricula);
		setColor(color);
		setModelo(modelo);
	}
	/**
	 * Constructor de una matr&iacute;cula
	 * @param matricula 
	 */

	private Coche(String matricula) {
		setMatricula(matricula);
	}
	/**
	 * Crea una instancia de coche en funci&oacute;n de su matr&iacute;cula modelo o color
	 * @param matricula
	 * @param color
	 * @param modelo
	 * @return un coche si cumple todos los requisitos, de lo contrario null
	 */

	static Coche instanciarCoche(String matricula, Color color, Modelo modelo) {
		if (esValida(matricula) && color != null && modelo != null)
			return new Coche(matricula, color, modelo);
		return null;
	}
	/**
	 * Crea una instancia de coche en funcuion de su matr&iacute;cula
	 * @param matricula
	 * @return devuelve un coche
	 */

	static Coche instanciarCoche(String matricula) {
		if (esValida(matricula))
			return new Coche(matricula);
		return null;
	}
	

	private static boolean esValida(String matricula) {
		return patternMatricula.matcher(matricula).matches();
	}

	private void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		this.color = color;
	}

	private void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	/**
	 * Indica si otro coche es igual a este
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nCoche [matricula=" + matricula + ", color=" + color
				+ ", modelo=" + modelo + "]";
	}

}
