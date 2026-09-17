//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Création et initialisation de la taille du tableau
    int[] tab= new int[(int) (Math.random()*100)+1];

    // Je remplis le tableau avec des valeurs aléatoires
    for (int i = 0 ; i < tab.length ; i++ ) {
        tab[i]=(int) (Math.random()*1000);
    }

    // J'affiche le tableau sans mention d'indices
    for (int element : tab) {
        System.out.println(element);
    }

    // J'affiche le tableau avec mention d'indices
    for (int i = 0; i <= tab.length; i++) {
        System.out.println("tab[" + i + "] = " + tab[i]);
    }

}
