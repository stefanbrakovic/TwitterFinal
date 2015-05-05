package com.twitter;

import java.util.LinkedList;
import com.twitter.poruke.TwiterPoruka;
/**
 * 
 * @author Stefan
 * @version 1.0
 */
public class Twitter {
	/**
	 * sadrzi sve poruke koju su razmenili korisnici
	 */
	private LinkedList<TwiterPoruka> poruke =
			new LinkedList<TwiterPoruka>();
	/**
	 * 
	 * @return Vraca listu svih poruka koje su poslate
	 */
			public LinkedList<TwiterPoruka> vratiSvePoruke(){
			return poruke;
			}
			/**
			 * Pravi se nova poruka i puni podacima.
			 * Poruka se unosi u listu na kraj
			 * @param korisnik tipa String i predstavlja korisnika aplikacije
			 * @param poruka tipa String i predstavlja poruku koju korisnik salje
			 */
			public void unesi(String korisnik, String poruka) {
			
			TwiterPoruka tp = new TwiterPoruka();
			tp.setKorisnik("korisnik");
			tp.setPoruka(poruka);
			
			poruke.addLast(tp);
			}
			
			/**
			 * Pretrazuju se poruke i traze se one koje sadrze tag.
			 * Ako se nadje neka takva, i ako nije prekoracen maxBroj
			 * ona se upisuje u niz. Ako je prekoracen maxBroj,pretraga
			 * se prekida.
			 * @throws java.lang.RuntimeException Ako je maxBroj <=0, vraca maxBroj se postavlja na 100 poruka
			 * @param maxBroj Pomocna promenljiva koja predstavlja brojac upisanih poruka
			 * @param tag vraca sve poruke koje u sebi imaju zadati tag
			 * @return vraca Twiter Poruke
			 */
			public TwiterPoruka[] vratiPoruke(int maxBroj, String tag) {
			
			if (tag==null || tag.isEmpty())
			throw new RuntimeException("Morate uneti tag");
			
			if (maxBroj<=0)
			maxBroj = 100;
			
			int brojac = 0;
			//Pomocni niz koja predstavlja rezultat pretrage tj. sadrzace
			//sve poruke koje u sebi imaju zadati tag
			
	TwiterPoruka[] rezultat = new TwiterPoruka[maxBroj];
	
	for (int i = 0; i < poruke.size(); i++)
	if (poruke.get(i).getPoruka().indexOf(tag)!=-1)
	if (brojac < maxBroj){
	rezultat[brojac+1]=poruke.get(i);
	brojac++;
	}
	else break;
	return rezultat;
    }
}
	

