public class TestDictionnaireStringInt {
    public static void main(String[] args){
        DictionnaireStringInt dictionary = new DictionnaireStringInt();

        // Regular Search
        /*
        dictionary.ajouterModifier(1, "Maël");
        dictionary.ajouterModifier(2, "Agathe");
        dictionary.ajouterModifier(3, "Arnaud");
        dictionary.ajouterModifier(4, "Célia");
        dictionary.ajouterModifier(5, "Emmanuel");
        dictionary.ajouterModifier(6, "Enao");
        dictionary.ajouterModifier(7, "Iliès");
        dictionary.ajouterModifier(8, "Jihène");
        dictionary.ajouterModifier(9, "Laurine");
        dictionary.ajouterModifier(10, "Louai");
        dictionary.ajouterModifier(11, "Maguelone");
        dictionary.ajouterModifier(12, "Manon C");
        dictionary.ajouterModifier(13, "Manon F");
        dictionary.ajouterModifier(14, "Nathan");
        dictionary.ajouterModifier(15, "Pierre");
        dictionary.ajouterModifier(16, "Raphaël");
        dictionary.ajouterModifier(17, "Stella");
        dictionary.ajouterModifier(18, "Viacheslav");
        dictionary.ajouterModifier(19, "Haoran");
        dictionary.ajouterModifier(20, "Dima");

        System.out.println(dictionary.toString());
        dictionary.supprimer(20, "Dima");
        System.out.println(dictionary.toString());
        */

        // Dichotomic search
        dictionary.ajouterModifierDichotomique(1, "Maël");
        dictionary.ajouterModifierDichotomique(2, "Agathe");
        dictionary.ajouterModifierDichotomique(3, "Arnaud");
        dictionary.ajouterModifierDichotomique(4, "Célia");
        dictionary.ajouterModifierDichotomique(5, "Emmanuel");
        dictionary.ajouterModifierDichotomique(6, "Enao");
        dictionary.ajouterModifierDichotomique(7, "Iliès");
        dictionary.ajouterModifierDichotomique(8, "Jihène");
        dictionary.ajouterModifierDichotomique(9, "Laurine");
        dictionary.ajouterModifierDichotomique(10, "Louai");
        dictionary.ajouterModifierDichotomique(11, "Maguelone");
        dictionary.ajouterModifierDichotomique(12, "Manon C");
        dictionary.ajouterModifierDichotomique(13, "Manon F");
        dictionary.ajouterModifierDichotomique(14, "Nathan");
        dictionary.ajouterModifierDichotomique(15, "Pierre");
        dictionary.ajouterModifierDichotomique(16, "Raphaël");
        dictionary.ajouterModifierDichotomique(17, "Stella");
        dictionary.ajouterModifierDichotomique(18, "Viacheslav");
        dictionary.ajouterModifierDichotomique(19, "Haoran");
        dictionary.ajouterModifierDichotomique(20, "Dima");

        System.out.println(dictionary.toString());
        dictionary.supprimerDichotomique("Dima");
        System.out.println(dictionary.toString());
    }
}
