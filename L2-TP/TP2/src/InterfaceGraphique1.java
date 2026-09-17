import javax.swing.*;

public class InterfaceGraphique1 {
	
	/**
	 * Méthode de création de l'interface graphique appelée dans le programme principal
	 */
	public static void creerUI() {
		/*
		 * Un objet de type JFrame est instancié et 
		 * est associé à la référence fenetre
		 */
		JFrame fenetre = new JFrame("My first beautiful window!!");
		
		/*
		 * La méthode setDefaultCloseOperation est appelée sur 
		 * l'objet fenetre avec comme paramètre la constante JFrame.EXIT_ON_CLOSE.
		 * Cela permet de dire que le fait de fermer la fenetre permet de quitter aussi l'application.
		 */
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * La taille de la fenêtre est fixée à une largeur de 300 pixel 
		 * et une hauteur de 200 pixels
		 */
		fenetre.setSize(300, 200);
		
		/*
		 * La fenêtre devient visible
		 */
		fenetre.setVisible(true);
	}
	
	public static void main(String[] args) {
		/*
		 * L'initialisation d'une interface graphique doit se faire dans conditions spéciales
		 * d'où ce bout de code, qui n'est pas au sujet de notre cours.
		 */
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	creerUI();
            }
        });
	}
}
