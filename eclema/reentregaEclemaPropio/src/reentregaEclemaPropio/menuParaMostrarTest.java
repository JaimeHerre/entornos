package reentregaEclemaPropio;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class menuParaMostrarTest {

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
	public void testMenuOpcion1() {
		menuParaMostrar.menu(1);

	}

	@Test
	public void testMenuOpcion2() {

		menuParaMostrar.menu(2);

	}

	@Test
	public void testMenuOpcion3() {

		menuParaMostrar.menu(3);

	}

	@Test
	public void testMenuOpcion4() {

		menuParaMostrar.menu(4);
	}

}
