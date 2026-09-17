import java.awt.*;

import javax.swing.*;

public class InterfaceGraphique6 {
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
		
		fenetre.getContentPane().setLayout(new BorderLayout());
		
		fenetre.getContentPane().add(new JButton("Début de page"),BorderLayout.PAGE_START);
		fenetre.getContentPane().add(new JButton("Fin de page"),BorderLayout.PAGE_END);
		fenetre.getContentPane().add(new JButton("Début de ligne"),BorderLayout.LINE_START);
		fenetre.getContentPane().add(new JButton("Fin de ligne"),BorderLayout.LINE_END);
		
		
		JPanel milieu = new JPanel();
		milieu.setLayout(new GridLayout(3,3));
		for (int i=0 ; i<9 ; i++) {
			milieu.add(new JButton(Integer.toString(i)));
		}
		
		
		fenetre.getContentPane().add(milieu,BorderLayout.CENTER);
		
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
