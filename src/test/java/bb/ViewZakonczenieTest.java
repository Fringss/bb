package bb;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class ViewZakonczenieTest {

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
	public void testGetInscription() {
		ViewZakonczenie SV = new ViewZakonczenie();
		String tt = SV.GetInscription();
		Assert.assertEquals(tt,"Koniec programu. Przedstawienie wzorca adapter is done.");
	}

}
