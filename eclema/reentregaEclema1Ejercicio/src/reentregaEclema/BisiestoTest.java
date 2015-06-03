package reentregaEclema;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BisiestoTest {

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
	public void test() {
		Bisiesto.mostrarSiBisiesto(2000);
		Bisiesto.mostrarSiBisiesto(2004);
		Bisiesto.mostrarSiBisiesto(1100);
		Bisiesto.mostrarSiBisiesto(2001);
	
	}

}
