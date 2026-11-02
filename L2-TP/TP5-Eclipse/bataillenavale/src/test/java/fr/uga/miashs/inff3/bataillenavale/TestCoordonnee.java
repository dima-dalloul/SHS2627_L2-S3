package fr.uga.miashs.inff3.bataillenavale;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestCoordonnee {
	
	private Coordonnee a1;
	private Coordonnee b4;
	private Coordonnee a10;
	
	private Coordonnee a2 = new Coordonnee("A2");
	private Coordonnee e1 = new Coordonnee("E1");
	
	@Test
	public void testConstructeurString() {
		// vérifie que A1 est bien (0,0)
		a1 = new Coordonnee("A1");
		assertEquals(0,a1.getLigne());
		assertEquals(0,a1.getColonne());

		// verifie que B4 est bien (3,1)
		b4 = new Coordonnee("B4");
		assertEquals(3,b4.getLigne());
		assertEquals(1,b4.getColonne());
		
		b4 = new Coordonnee("b4");
		assertEquals(3,b4.getLigne());
		assertEquals(1,b4.getColonne());
		
		/*a10 = new Coordonnee("A10");
		assertEquals(a10.getLigne(),9);
		assertEquals(a10.getColonne(),0);*/
	}
	
	@Test
	public void testConstructeurInt() {
		b4 = new Coordonnee(3,1);
		assertEquals(3,b4.getLigne());
		assertEquals(1,b4.getColonne());
	}
	
	@Test
	public void testToString() {
		a1 = new Coordonnee("A1");
		b4 = new Coordonnee("B4");
		a10 = new Coordonnee("A10");
		
		assertEquals("A1",a1.toString());
		assertEquals("B4",b4.toString());
		assertEquals("A10",a10.toString());
	}
	
	@Test
	public void testEquals() {
		a1 = new Coordonnee("A1");
		b4 = new Coordonnee("B4");
		// test egalité si c'est le cas
		assertEquals(new Coordonnee("A1"),a1);
		assertEquals(new Coordonnee("B4"),b4);
		
		// test non egalité
		assertNotEquals(new Coordonnee("A1"),b4);
		assertNotEquals(new Coordonnee("B4"),a1);
		
		// test non egalité lorsqu'on inverse ligne et colonne
		assertNotEquals(new Coordonnee("D2"),b4);
		
		 // test non égalité avec la même colonne mais pas la même ligne;
		 assertNotEquals(new Coordonnee("B2"),b4);

		 // test non égalité avec la même ligne mais pas la même colonne;
		 assertNotEquals(new Coordonnee("C1"),a1);
	}
	
	@Test
	public void testVoisines() {
		b4 = new Coordonnee("B4");
		/* 
		 * A3 B3 C3
		 * A4 B4 C4
		 * A5 B5 C5
		 */
		
		// test des quatres voisines
		assertTrue(b4.voisine(new Coordonnee("B3")));
		assertTrue(b4.voisine(new Coordonnee("B5")));
		assertTrue(b4.voisine(new Coordonnee("A4")));
		assertTrue(b4.voisine(new Coordonnee("C4")));
		
		// test de non voisines des diagonales
		assertFalse(b4.voisine(new Coordonnee("A3")));
		assertFalse(b4.voisine(new Coordonnee("C3")));
		assertFalse(b4.voisine(new Coordonnee("A5")));
		assertFalse(b4.voisine(new Coordonnee("C5")));
		
		// test autre au hasard
		assertFalse(b4.voisine( new Coordonnee("D2")));
		
	}
	
	@Test
	public void testCompareTo() {
		b4 = new Coordonnee("B4");
		/* 
		 * A3 B3 C3
		 * A4 B4 C4
		 * A5 B5 C5
		 */
		
		// test des comapreTo avec les quatres voisines
		assertTrue(b4.compareTo(new Coordonnee("B3"))>0 );
		assertTrue(b4.compareTo(new Coordonnee("B5"))<0);
		assertTrue(b4.compareTo(new Coordonnee("A4"))>0);
		assertTrue(b4.compareTo(new Coordonnee("C4"))<0);
		
		
		// test egalité
		assertTrue(b4.compareTo(new Coordonnee("B4")) == 0);
		
		// E1 < A2
		assertTrue(e1.compareTo(a2) < 0);
		
	}

}
