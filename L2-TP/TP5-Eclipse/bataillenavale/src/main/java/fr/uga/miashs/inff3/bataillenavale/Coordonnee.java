package fr.uga.miashs.inff3.bataillenavale;

public class Coordonnee {
	// Variables
	// Par exemple, pour la coordonnée « C1 », 
	// l’attribut ligne sera initialisé à 0 et l’attribut colonne à 2
	int line;
	int column;
	
	public Coordonnee(String s) {
		// A modifier
	}
	
	public Coordonnee(int l, int c) {
		line = l;
		column = c;
	}
	
	public int getLigne() {
		return line;
	}
	
	public int getColonne() {
		return column;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Coordonnee) {
			Coordonnee c = (Coordonnee) o;
			// A modifier
		}
		return false;
	}
	
	public boolean voisine(Coordonnee c) {
		// A modifier
		return true;
	}
	
	public int compareTo(Coordonnee c) {
		// A modifier
		return 0;
	}
	
	public String toString() {
		// A modifier
	   return super.toString();
	}
}
