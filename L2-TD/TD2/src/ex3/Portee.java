package ex3;
public class Portee {
    public static void main(String[] args) {
        String s1 = new String("chaîne 1");
        {
            String s2 = new String("chaîne 2");
            String s3 = new String("chaîne 3");
            s1=s3;
        }
        String s4 = new String("chaîne 4");
        {
            System.out.println("coucou");
            //commentaire

            /* Uncomment this to test
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
            */
        }
    }
}
