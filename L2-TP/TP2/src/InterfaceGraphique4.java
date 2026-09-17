import java.awt.*;

import javax.swing.*;

public class InterfaceGraphique4 {
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
		 * 5 objets de type JButton sont successivement créés, ajoutés et placés dans des
		 * endroits différents du panneau de contenu de la fenêtre
		 */
		fenetre.getContentPane().add(new JButton("Début de page"),BorderLayout.PAGE_START);
		fenetre.getContentPane().add(new JButton("Fin de page"),BorderLayout.PAGE_END);
		fenetre.getContentPane().add(new JButton("Début de ligne"),BorderLayout.LINE_START);
		fenetre.getContentPane().add(new JButton("Fin de ligne"),BorderLayout.LINE_END);
		fenetre.getContentPane().add(new JButton("Centre"),BorderLayout.CENTER);
		
		/*
		 * La même chose avec les points cardinaux
		 */
		/*fenetre.getContentPane().add(new JButton("Nord"),BorderLayout.NORTH);
		fenetre.getContentPane().add(new JButton("Sud"),BorderLayout.SOUTH);
		fenetre.getContentPane().add(new JButton("Ouest"),BorderLayout.WEST);
		fenetre.getContentPane().add(new JButton("Est"),BorderLayout.EAST);
		fenetre.getContentPane().add(new JButton("Centre"),BorderLayout.CENTER);*/
		
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
