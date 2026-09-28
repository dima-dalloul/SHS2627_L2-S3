package ex4;

public class Personne {
    // Variables
    private String nom;
    private String prenom;
    private String ville;

    // Constructors
    public Personne(){
        nom = "Doe";
        prenom = "Joe";
        ville = "Grenoble";
    }

    public Personne(String nom, String prenom, String ville){
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
    }

    // Getters and Setters
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Methods
    public void affichage(){
        System.out.println("La personne est " + prenom + " " + nom + " et elle habite à " + ville);
    }
}