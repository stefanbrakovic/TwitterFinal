package com.twitter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.Twitter;

public class testTwiterJU4 {

	Twitter tw ;
	@Before
	public void setUp() throws Exception {
		tw =  new Twitter();
	}

	@After
	public void tearDown() throws Exception {
		tw = null;
	}

	@Test
	public void testVratiSvePoruke() {
		tw.vratiSvePoruke();
		assertEquals(null, tw.vratiSvePoruke());
	}

	@Test
	public void testUnesi() {
tw.unesi("Stefan", "ASD");
		
		assertEquals("Stefan ASD", tw.toString());
	}

	@Test
	public void testVratiPoruke() {
		tw.unesi("Stefan", "poruka");
		tw.vratiSvePoruke();
		
		assertEquals("Stefan poruka", tw.vratiSvePoruke());
	}

}
