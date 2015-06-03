package pgn.examenMarzo.concesionarioCoches;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class concesionarioTest {
	Concesionario concesionario = new Concesionario();

	@Test
	public void testAnnadirMatricula() {
		// coche correcto
		assertTrue(concesionario.annadir("1234GGG", Color.AZUL, Modelo.SERIE5));
		assertTrue(concesionario.annadir("9999GGH", Color.AZUL, Modelo.SERIE5));
		assertTrue(concesionario.annadir("1234-FFF", Color.AZUL, Modelo.SERIE5));
		assertTrue(concesionario.annadir("1234 GFF", Color.AZUL, Modelo.SERIE5));
		// coche repetido
		assertFalse(concesionario.annadir("1234GGG", Color.AZUL, Modelo.SERIE5));
		assertFalse(concesionario.annadir("1234-FFF", Color.AZUL, Modelo.SERIE5));
		assertFalse(concesionario.annadir("1234 GFF", Color.AZUL, Modelo.SERIE5));
		// Sobran numeros
		assertFalse(concesionario.annadir("14334BBB", Color.ROJO, Modelo.SERIE1));
		// Sobran letras
		assertFalse(concesionario.annadir("1234BDDD", Color.ROJO, Modelo.SERIE1));
		// falta un numero
		assertFalse(concesionario.annadir("123BBB", Color.ROJO, Modelo.SERIE1));
		// falta una letra
		assertFalse(concesionario.annadir("1234BB", Color.ROJO, Modelo.SERIE1));
		// letra minuscula
		assertFalse(concesionario.annadir("1234BBb", Color.ROJO, Modelo.SERIE1));
		// numero entre las letras
		assertFalse(concesionario.annadir("1434B1B", Color.ROJO, Modelo.SERIE1));
		// letra entre los numeros
		assertFalse(concesionario.annadir("1G34BBB", Color.ROJO, Modelo.SERIE1));
		// todo numero
		assertFalse(concesionario.annadir("0000000", Color.AZUL, Modelo.SERIE5));
		// todo letras
		assertFalse(concesionario.annadir("FFFFFFF", Color.AZUL, Modelo.SERIE5));
		// caracter erroneo
		assertFalse(concesionario.annadir("1G34*BBB", Color.ROJO, Modelo.SERIE1));

	}

	@Test
	public void testAnnadirColor() {
		// Colores correctos
		assertTrue(concesionario.annadir("5555FFF", Color.AZUL, Modelo.SERIE5));
		assertTrue(concesionario.annadir("2333FTF", Color.ROJO, Modelo.SERIE5));
		assertTrue(concesionario.annadir("3343FTF", Color.PLATA, Modelo.SERIE5));
		// color null
		assertFalse(concesionario.annadir("3232FTT", null, Modelo.SERIE5));
		

	}

	@Test
	public void probandoColoresValidos() {
		//comprobamos que no es nulo lo que devuelve
		assertNotNull(concesionario.getCochesColor(Color.PLATA));
		assertNotNull(concesionario.getCochesColor(Color.ROJO));
		assertNotNull(concesionario.getCochesColor(Color.AZUL));
	}

	@Test
	public void testAnnadirModelo() {
		// Colores correctos
		assertTrue(concesionario.annadir("5133DDD", Color.AZUL, Modelo.SERIE1));
		assertTrue(concesionario.annadir("2233FFF", Color.AZUL, Modelo.SERIE2));
		assertTrue(concesionario.annadir("7333TTF", Color.AZUL, Modelo.SERIE3));
		assertTrue(concesionario.annadir("8433FFF", Color.AZUL, Modelo.SERIE5));
		assertTrue(concesionario.annadir("9533FFF", Color.AZUL, Modelo.TOLEDO));
		assertTrue(concesionario.annadir("0633FFF", Color.AZUL, Modelo.CORDOBA));
		assertTrue(concesionario.annadir("1733FFF", Color.AZUL, Modelo.IBIZA));
		// color null
		assertFalse(concesionario.annadir("4783GTR", Color.AZUL, null));

	}

	@Test
	public void testEliminar() {
		// creamos algunos coches para las posteriores pruebas
		concesionario.annadir("0125TRT", Color.AZUL, Modelo.TOLEDO);
		concesionario.annadir("0816BBB", Color.AZUL, Modelo.SERIE5);
		concesionario.annadir("0833BBB", Color.ROJO, Modelo.SERIE1);
		concesionario.annadir("9933BBB", Color.AZUL, Modelo.SERIE2);
		// Comprobamos que quedan 4 coches en el array
		assertEquals(4, concesionario.size());
		// eliminamos
		assertTrue(concesionario.eliminar("0816BBB"));
		// Comprobamos que quedan 3 coches en el array
		assertEquals(3, concesionario.size());
		// eliminamos un coche que ya no existe
		assertFalse(concesionario.eliminar("0816BBB"));
		// Comprobamos que quedan 3 coches en el array
		assertEquals(3, concesionario.size());

	}
	
	@Test
	public void testGetCoche() {
		//Comprobamos los colores
		assertNotNull(concesionario.getCochesColor(Color.AZUL));
		assertNotNull(concesionario.getCochesColor(Color.PLATA));
		assertNotNull(concesionario.getCochesColor(Color.ROJO));
	


	}

}
