package com.twitter;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.poruke.TwiterPoruka;

public class TwitterTest {

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
		tw.unesi("Korisnik", "poruka");
		LinkedList<TwiterPoruka> poruke = tw.vratiSvePoruke();
		assertEquals("poruka", poruke.get(0).getPoruka());
	}

	@Test
	public void testUnesi() {
		
		tw.unesi("Stefan", "ASD");
		
		LinkedList<TwiterPoruka> poruke = tw.vratiSvePoruke();
		
		assertEquals("StefanASD", poruke.get(poruke.size()-1).getKorisnik()+poruke.get(poruke.size()-1).getPoruka());
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testVratiPorukeNullTag() {
		tw.unesi("Korisnik", "poruka");
		TwiterPoruka[] tp = tw.vratiPoruke(12, null);
		
		//assertEquals("poruka", poruke.get(0).getPoruka());
	}
	@Test(expected = java.lang.RuntimeException.class)
	public void testVratiPorukeEmptyTag() {
		tw.unesi("Korisnik", "poruka");
		TwiterPoruka[] tp = tw.vratiPoruke(12, "");
		
		//assertEquals("poruka", poruke.get(0).getPoruka());
	}
	@Test
	public void testVratiPoruke() {
		tw.unesi("Korisnik", "#poruka");
		tw.unesi("JA", "#poruka");
		TwiterPoruka[] tp = tw.vratiPoruke(20, "#poruka");
		String test = tp[0].getKorisnik()+tp[0].getPoruka();
		assertEquals("Korisnik#poruka", test);
		test = tp[1].getKorisnik()+tp[1].getPoruka();
		assertEquals("JA#poruka", test);
		
	}
}


