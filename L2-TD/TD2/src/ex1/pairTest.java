package ex1;

public class pairTest {
    public static void main(String[] args) {
        // I create the pairs
        Pair pair1 = new Pair();
        Pair pair2 = new Pair();
        Pair pair3 = new Pair();

        // I give the values to each pair
        pair1.firstInteger = 2;
        pair1.secondInteger = 3;
        System.out.println("Pair 1 : (" + pair1.firstInteger + ", " + pair1.secondInteger + ")" );

        pair2.firstInteger = 4;
        pair2.secondInteger = 5;
        System.out.println("Pair 2 : (" + pair2.firstInteger + ", " + pair2.secondInteger + ")" );


        pair3.firstInteger = 2;
        pair3.secondInteger = 3;
        System.out.println("Pair 3 : (" + pair3.firstInteger + ", " + pair3.secondInteger + ")" );

        // Test the equality of the values of the pairs
        System.out.println("The integers of Pair 1 are equal to Pair 2 ? " + pair1.equals(pair2));
        System.out.println("The integers of Pair 1 are equal to Pair 3 ? " + pair1.equals(pair3));


        // Test the equality of the pairs
        System.out.println("Pair 1 equal to Pair 2 ? " + (pair1 == pair2));
        System.out.println("Pair 1 to Pair 3 ? " + ( pair1 == pair3));
    }
}
