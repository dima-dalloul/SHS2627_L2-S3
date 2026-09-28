package ex4;

public class Compte {
    // Variables
    private Personne titulaire;
    private double solde;
    private static double tauxConversion;
    //1.00 USD = 0.88 EUR

    // Constructors
    public Compte(){
        titulaire = new Personne();
        solde = 0;
        tauxConversion = 0.88;
    }

    public Compte(Personne personne, double solde, double tauxConversion){
        this.titulaire = personne;
        this.solde = solde;
        this.tauxConversion = tauxConversion;
    }

    // Getters and Setters
    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Personne titulaire) {
        this.titulaire = titulaire;
    }

    public double getTauxConversion() {
        return tauxConversion;
    }

    public void setTauxConversion(double tauxConversion) {
        this.tauxConversion = tauxConversion;
    }

    // Methods
    public void deposerArgent(double montant){
        this.solde += montant;
    }

    public boolean retirerArgent(double montant){
        if(this.solde >= montant){
            this.solde -= montant;
            System.out.println("Le montant " + montant + " a été retiré avec succès.");
            return true;
        } else {
            System.out.println("Solde insuffisant.");
            return false;
        }
    }

    public void transfererArgent(double montant, Compte compteDestinataire){
        if(this.solde >= montant){
            this.solde -= montant;
            compteDestinataire.deposerArgent(montant);
            System.out.println("Le montant " + montant + " a été transféré avec succès vers le compte de " + compteDestinataire.getTitulaire().getNom());
        } else {
            System.out.println("Solde insuffisant. Transfert annulé");
        }
    }

    public boolean compteAppartientMemeTitulaire(Compte compteATester){
        // Version 1 : compact
        // return this.titulaire.equals(compteATester.getTitulaire());

        // Version 2 : less compact
        /*
        if(this.titulaire.equals(compteATester.getTitulaire())){
            return true;
        } else {
            return false;
        }
        */

        // Version 3 : more into details
        if(titulaire.getPrenom().equals(compteATester.titulaire.getPrenom()) &&
            titulaire.getNom().equals(compteATester.titulaire.getNom()) &&
            titulaire.getVille().equals(compteATester.titulaire.getVille()))
            return true;
        else
            return false;

    }

    public double getSoldeEnDollars(){
        return this.solde * this.tauxConversion;
    }

    public void affichageCompte(){
        System.out.println("Le compte de " + titulaire.getPrenom() + " " + titulaire.getNom() + " présente un solde de " + solde);
    }
}