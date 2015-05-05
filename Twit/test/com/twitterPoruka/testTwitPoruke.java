package com.twitterPoruka;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.poruke.TwiterPoruka;

import junit.framework.TestCase;

public class testTwitPoruke extends TestCase {

	TwiterPoruka tp;
	
	@Before
	public void setUp()throws Exception{
	 tp = new TwiterPoruka();
	}
	
	@After
	public void tearDown() throws Exception{
		tp = null;
	}
	@Test
	public void testSetKorisnik() {
		tp.setKorisnik("Stefan");
		
		assertEquals("Stefan", tp.getKorisnik());
	}	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPoruka() {
		tp.setPoruka("123321asdDSA");
		
		assertEquals("123321asdDSA", tp.getPoruka());
		
	}
	@Test
	public void testToString() {
		tp.setKorisnik("Stefan");
		tp.setPoruka("ASD");
		
		assertEquals("KORISNIK:Stefan PORUKA:ASD", tp.toString());
		
	}

}
