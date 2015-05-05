package test;

import java.util.LinkedList;

import com.twitter.Twitter;
import com.twitter.poruke.TwiterPoruka;

import junit.framework.TestCase;

public class testTwiter extends TestCase {

	Twitter tw ;
	
	public void setUp(){
		tw =  new Twitter();
	}
	
	public void tearDown(){
		tw = null;
	}
	
	public void testVratiSvePoruke() {
		tw.vratiSvePoruke();
		assertEquals(null, tw.vratiSvePoruke());
	}

	public void testVratiSvePoruke2(){
		tw.unesi("Stefan", "poruka");
		tw.vratiSvePoruke();
		
		assertEquals("Stefan poruka", tw.vratiSvePoruke());
	}
	public void testUnesi() {
		tw.unesi("Stefan", "ASD");
		
		assertEquals("Stefan ASD", tw.toString());
	}

	
	
	public void testVratiPoruke() {
		fail("Not yet implemented");
		//asse
	}

}
