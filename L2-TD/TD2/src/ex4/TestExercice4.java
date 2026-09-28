package ex4;

public class TestExercice4 {
    public static void main(String[] args){
        Personne p = new Personne() ;
        Compte c1 = new Compte() ;
        c1.setTitulaire(p);
        p.affichage();
        Personne p2 = new Personne("Doe", "Jane", "Genève") ;
        Compte c2 = new Compte() ;
        c2.setTitulaire(p2);
        p2.affichage();
        System.out.println("Est-ce que la même personne a C1 et C2? " + c1.compteAppartientMemeTitulaire(c2));
        c2.setSolde(1000);
        c1.setSolde(900);
        c1.affichageCompte();
        c2.affichageCompte();
    }
}
