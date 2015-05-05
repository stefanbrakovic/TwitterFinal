package com.twitterPoruka;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.poruke.TwiterPoruka;

public class TwitterPorukaTest {

	TwiterPoruka tp;
	
	@Before
	public void setUp()throws Exception{
	 tp = new TwiterPoruka();
	}
	
	@After
	public void tearDown() throws Exception{
		tp = null;
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetKorisnikNull() {
		tp.setKorisnik(null);
		
		
	}	
	@Test
	public void testSetKorisnik() {
		tp.setKorisnik("Stefan");
		
		assertEquals("Stefan", tp.getKorisnik());
	}	
	@Test
	public void testSetPoruka() {
		
		tp.setPoruka("123321asdDSA");
		
		assertEquals("123321asdDSA", tp.getPoruka());
		
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPorukaNull() {
		
		tp.setPoruka(null);
		
		//assertEquals("123321asdDSA", tp.getPoruka());
		
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPorukaLarge() {
		
		tp.setPoruka("asdasdasdasdasdasdasdasasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasddasdasdas"
				+ "dasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdas"
				+ "dasdasdasdasdasdasdasdasdasasdasdasdasdasdasdasdasdasdasdasdasddasdasdasdasdasdasdasdasdasdasdasda"
				+ "sdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasda"
				+ "sdasdasdasdasdasdasdasdasdaasdasdasdasdasdasdasdasdasdasdasdasdsdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdas"
				+ "dasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasd");
		
		
		//assertEquals("123321asdDSA", tp.getPoruka());
		
	}
	
	@Test
	public void testToString() {
		tp.setKorisnik("Stefan");
		tp.setPoruka("ASD");
		
		assertEquals("KORISNIK:Stefan PORUKA:ASD", tp.toString());
		
	}

}
