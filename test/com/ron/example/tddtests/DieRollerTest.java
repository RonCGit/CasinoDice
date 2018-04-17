package com.ron.example.tddtests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DieRollerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetState() {
		fail("Not yet implemented");
	}

	@Test
	public void testRollDie() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDie() {
		DieRoller myRoller = new DieRoller();
		assertEquals(myRoller.getDie().size(),3);
	}

}
