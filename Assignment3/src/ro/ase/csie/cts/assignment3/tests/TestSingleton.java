package ro.ase.csie.cts.assignment3.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.assignment3.singleton.ServerSingleton;

public class TestSingleton {
	
	ServerSingleton server1 = null;
	ServerSingleton server2 = null;

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
	public void testSingleton() {
		ServerSingleton server1 = ServerSingleton.getServer(null, 0, 0, false, true);
		ServerSingleton server2 = ServerSingleton.getServer(null, 0, 0, false, true);
		Assert.assertEquals("They are the same", server1, server2);
	}

}
