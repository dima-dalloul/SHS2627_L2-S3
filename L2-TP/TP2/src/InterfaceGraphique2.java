import javax.swing.*;

public class InterfaceGraphique2 {
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
		 * est associé à la référence lbl
		 */
		JLabel lbl = new JLabel("Hello Y'all !");
		JTextField t1 = new JTextField("First textfield");
		JButton button = new JButton("Press me !");
		JCheckBox cb1 = new JCheckBox("Check box");
		JSlider slider = new JSlider(0, 100, 50);
		JComboBox cb = new JComboBox();
		
		/*
		 * L'objet référencé par lbl est ajouté dans le 
		 * panneau de contenu de la fenêtre
		 */
		fenetre.getContentPane().add(lbl);
		fenetre.getContentPane().add(t1);
		fenetre.getContentPane().add(button);
		fenetre.getContentPane().add(cb1);
		fenetre.getContentPane().add(slider);
		//fenetre.getContentPane().add(cb);

		
		/* 
		 * Les deux instructions précédentes auraient pu être
		 * réalisées en une seule ligne sans passer par la référence lbl
		 */
		// fenetre.getContentPane().add(new JLabel("coucou"));
		
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
