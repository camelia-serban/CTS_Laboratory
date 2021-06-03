package ro.ase.csie.cts.assignment3.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.assignment3.prototype.ServerPrototype;

public class TestPrototype {

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

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testPrototype() throws CloneNotSupportedException {
		ServerPrototype server1 = new ServerPrototype("200", 10, 2, true, false);
		ServerPrototype server2 = (ServerPrototype) server1.clone();
		Assert.assertEquals("Cloning", server1.getPort(), server2.getPort());
	}

}
