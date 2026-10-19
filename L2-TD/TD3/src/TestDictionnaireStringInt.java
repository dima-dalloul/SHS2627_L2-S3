public class TestDictionnaireStringInt {
    public static void main(String[] args){
        DictionnaireStringInt dictionary = new DictionnaireStringInt();

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
    }
}
