import java.awt.*;

import javax.swing.*;

public class InterfaceGraphique5 {
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
		 * On spécifie que le panneau de contenu de la fenetre doit utiliser
		 * une instance du gestionnaire de placement GridLayout. La taille de 
		 * la grille est initialisée à 3 lignes et 4 colonnes
		 */
		fenetre.getContentPane().setLayout(new GridLayout(3,4));
		
		/*
		 * On créer et on ajoute une douzaine boutons au panneau de contenu
		 * Le texte de chaque bouton est la chaine de caractère représentant
		 * l'indice du bouton (de 0 à 11)
		 */
		for (int i=0 ; i<12 ; i++) {
			fenetre.getContentPane().add(new JButton(Integer.toString(i)));
		}
		
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
