package fr.uga.miashs.inff3.bataillenavale;

public class Coordonnee {
	// Variables
	int line;
	int column;

	/*
	 * Par exemple, pour la coordonnée « C1 »,
	 * l’attribut ligne sera initialisé à 0 et l’attribut colonne à 2
	 */
	public Coordonnee(String s) {
		char c = s.toUpperCase().charAt(0); 	// We put the character as upper case and then extract the first character of the string
		this.column = c - 'A';
		this.line = Integer.parseInt(s.substring(1)) - 1;
	}

	/**
	 * Par exemple, pour la coordonnée « C1 »,
	 * l’attribut ligne sera initialisé à 0 et l’attribut colonne à 2
	 * @param l
	 * @param c
	 */
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
			return ((this.line == c.line) && (this.column == c.column));
		}
		return false;
	}
	
	public boolean voisine(Coordonnee c) {
		// Somewhat compact version
		/*boolean sameLineDifferentColumns = ((this.line == c.line) && (this.column == c.column - 1)) || ((this.line == c.line) && (this.column == c.column + 1));
		boolean differentLinesSameColumn = ((this.column == c.column) && (this.line == c.line - 1)) || ((this.column == c.column) && (this.line == c.line + 1));
		return sameLineDifferentColumns || differentLinesSameColumn;*/

		// Compact version
		//return ((this.line == c.line) && (this.column == c.column - 1)) || ((this.line == c.line) && (this.column == c.column + 1)) ||  ((this.column == c.column) && (this.line == c.line - 1)) || ((this.column == c.column) && (this.line == c.line + 1));

		// Expanded version
		boolean sameLineColumnBefore = ((this.line == c.line) && (this.column == c.column - 1));
		boolean sameLineColumnAfter = ((this.line == c.line) && (this.column == c.column + 1));
		boolean differentLinesSameColumnBefore = ((this.column == c.column) && (this.line == c.line - 1));
		boolean differentLinesSameColumnAfter = ((this.column == c.column) && (this.line == c.line + 1));
		return sameLineColumnBefore || sameLineColumnAfter || differentLinesSameColumnBefore || differentLinesSameColumnAfter;

	}


	/*
	 * A3 B3 C3
	 * A4 B4 C4
	 * A5 B5 C5
	 */
	
	public int compareTo(Coordonnee c) {
		// A modifier
		return 0;
	}
	
	public String toString() {
		String s = "";
		char columnString = (char) (this.column + 'A');
		String lineString = "" + (this.line + 1);
		s = columnString + lineString;
	   	return s;
	}
	/*
		char c = s.toUpperCase().charAt(0);
		this.column = c - 'A';
		this.line = s.charAt(1) - '1';


		a1 = new Coordonnee("A1");
		b4 = new Coordonnee("B4");
		a10 = new Coordonnee("A10");

		assertEquals("A1",a1.toString());
		assertEquals("B4",b4.toString());
		assertEquals("A10",a10.toString());
	 */
}
