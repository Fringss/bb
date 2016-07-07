package bb;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class ViewTest {

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
	public void testGetSizeY() {
		View SV = new View();
		int y = SV.getSizeY();
		Assert.assertEquals(y,30*20);
	}
	@Test
	public void testGetSizeX() {
		View SV = new View();
		int x = SV.getSizeX();
		Assert.assertEquals(x,30*20);
	}

	@Test
	public void testGetf() {
		View SV = new View();
		int f = SV.getf();
	Assert.assertEquals(f,0);
	}

	@Test
public void testGetw() {
	View SV = new View();
		int w = SV.getw();
	Assert.assertEquals(w,0);
	}

}
