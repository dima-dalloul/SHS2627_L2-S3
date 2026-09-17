import java.awt.*;

import javax.swing.*;

public class InterfaceGraphique3 {
	/**
	 * Méthode de création de l'interface graphique appelée dans le programme principal
	 */
	public static void creerUI() {
		/*
		 * Un objet de type JFrame est instancié et 
		 * est associé à la référence fenetre
		 */
		JFrame fenetre = new JFrame("Une fenêtre");
		
		/*
		 * La méthode setDefaultCloseOperation est appelée sur 
		 * l'objet fenetre avec comme paramètre la constante JFrame.EXIT_ON_CLOSE.
		 * Cela permet de dire que le fait de fermer la fenetre permet de quitter aussi l'application.
		 */
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * Un objet de type JLabel est instancié et 
		 * est ajouté dans la fenêtre en début de ligne (à l'ouest)
		 */
		fenetre.getContentPane().add(new JLabel("coucou"),BorderLayout.LINE_START);
		
		/*
		 * Un objet de type JLabel est instancié et 
		 * est ajouté dans le panneau de contenu de 
		 * la fenêtre en fin de ligne (à l'est)
		 */
		fenetre.getContentPane().add(new JButton("Bouton"),BorderLayout.LINE_END);
		
		/*
		 * La taille de la fenêtre est calculée automatiquement 
		 * en fonction des composants qu'elle contient
		 */
		fenetre.pack();
		
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
