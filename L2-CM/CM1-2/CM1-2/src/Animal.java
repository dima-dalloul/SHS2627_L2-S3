public class Animal {
    String nom;
    int age;

    public void respire(){
        System.out.println("Je respire");
    }

    public void mange(){
        System.out.println("Je mange");
    }

    public void dort(){
        try{
            System.out.println("Je dors");
            throw new  Exception();
        } catch(Exception e){
            System.err.println("Erreur dans la méthode Dort.");
        }

    }
}
