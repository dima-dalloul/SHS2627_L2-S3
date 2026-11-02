class Dessin {
    private Forme[] formes;

    public double aireTotale() {
        double total=0;

        // Je calcule l'aire de toutes les formes, peu importe si elles sont des rectangles, des cercles ou des carrés
        // Je fais ce travail en une seule fois alors que si la classe abstraite Forme n'existait pas, j'aurais dû
        // calculer l'aire de chaque type de forme respectivement puis faire la somme totale
        for (Forme f : formes) {
            total+=f.aire();
        }

        return total;
    }
}
