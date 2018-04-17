package com.ron.example.tddtests;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ron.example.tddtests.RollDie;

public class tests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		RollDie myDie = new RollDie();
		int roll = myDie.getDieState();
		assertTrue(roll > 0);
		//fail("Not yet implemented");
		}
	}

