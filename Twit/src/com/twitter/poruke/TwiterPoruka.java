package com.twitter.poruke;

/**
 * @author Stefan
 * @version 1.0
 */

public class TwiterPoruka {
	

	/**
	 * korisnik  = user of the app
	 */
	private String korisnik;
	/**
	 * poruka = message
	 */
	private String poruka;
	/**
	 * 
	 * @return vraca ime korisnika kao String
	 */
	public String getKorisnik() {
	return korisnik;
	}
	/**
	 * 
	 * @param korisnik mora biti tipa String i predstavlja ime korisnika
	 */
	public void setKorisnik(String korisnik) {
	if (korisnik==null || korisnik.equals(""))
	throw new RuntimeException(
	"Ime korisnika mora biti uneto");
	this.korisnik = korisnik;
	}
	/**
	 * 
	 * @return poruka vraca poruku koju je korinik uneo kao String
	 */
	public String getPoruka() {
	return poruka;
	}
	/**
	 * 
	 * @param poruka mora biti string i predstavlja poruku koju je une korisnik
	 * @throws RuntimeException ako je uneto vise od 140 karaktera ili nije unet ni jedan
	 */
	public void setPoruka(String poruka) {
	if (poruka==null || poruka.length()>140)
	throw new RuntimeException(
	"Poruka mora biti uneta i mora imati najvise 140 znakova");
	this.poruka = poruka;
	}
	/**
	 * vraca podatke o koriniku i poruci koju je poslao
	 */
	public String toString(){
	return "KORISNIK:"+korisnik+" PORUKA:"+poruka;
	} 

}
