package pgn.examenMarzo.concesionarioCoches;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CocheTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInstanciarCocheStringColorModelo() {
		//COCHES VALIDOS
		assertNotNull(Coche.instanciarCoche("0819BMR", Color.AZUL, Modelo.CORDOBA));
		assertNotNull(Coche.instanciarCoche("1234-GBX", Color.PLATA, Modelo.SERIE1));
		assertNotNull(Coche.instanciarCoche("1234 FTG", Color.ROJO, Modelo.SERIE5));
		
		//falta una letra
		assertNull(Coche.instanciarCoche("0819BR", Color.AZUL, Modelo.CORDOBA));
		//falta numero
		assertNull(Coche.instanciarCoche("089BMR", Color.AZUL, Modelo.CORDOBA));
		//sobra numero
		assertNull(Coche.instanciarCoche("12660FFF", Color.ROJO, Modelo.SERIE5));
		//sobra letra
		assertNull(Coche.instanciarCoche("1260FFFF", Color.ROJO, Modelo.SERIE5));
		//caracter invalido
		assertNull(Coche.instanciarCoche("0819_BMR", Color.AZUL, Modelo.CORDOBA));
		assertNull(Coche.instanciarCoche("1459sbmr", Color.AZUL, Modelo.CORDOBA));
		//todo letras
		assertNull(Coche.instanciarCoche("0819123", Color.AZUL, Modelo.CORDOBA));
		//todo numeros
		assertNull(Coche.instanciarCoche("DDDDBMR", Color.AZUL, Modelo.CORDOBA));
		//modelo nulo
		assertNull(Coche.instanciarCoche("1234GBX", Color.PLATA, null));
		//color nulo
		assertNull(Coche.instanciarCoche("0819BMR", null, Modelo.CORDOBA));
		//digitos inveridos
		assertNull(Coche.instanciarCoche("FTG1234", Color.ROJO, Modelo.SERIE5));
			
		
	}

	@Test
	public void testInstanciarCocheString() {
		//valido
		assertNotNull(Coche.instanciarCoche("1234FFF"));
		assertNotNull(Coche.instanciarCoche("1234-HBD"));
		assertNotNull(Coche.instanciarCoche("1234 FGG"));
		//falta una letra
		assertNull(Coche.instanciarCoche("0819BR"));
		//falta numero
		assertNull(Coche.instanciarCoche("089BMR"));
		//sobra numero
		assertNull(Coche.instanciarCoche("12660FFF"));
		//sobra letra
		assertNull(Coche.instanciarCoche("1260FFFF"));
		//caracter invalido
		assertNull(Coche.instanciarCoche("0819_BMR"));
		assertNull(Coche.instanciarCoche("1459sbmr"));
		//todo letras
		assertNull(Coche.instanciarCoche("0819123"));
		//todo numeros
		assertNull(Coche.instanciarCoche("DDDDBMR"));
	
	}

	

}
