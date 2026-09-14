package ex1;

public class Pair {
    // ---------- Attributs ----------
    int firstInteger = 0;       // Way 1 to instanciate 0 to firstInteger
    int secondInteger = 0;      // Way 1 to instanciate 0 to secondInteger

    // ---------- Constructor ----------
    // Way 2 to create an instance of the class
    // Formal way used for big-type / industrialized projects
    public Pair() {
        firstInteger = 0;
        secondInteger = 0;
    }

    // ---------- Methods ----------
    public boolean equals(Pair pairToBeComparedTo) {
        // Version 1
        /*
        if( (this.firstInteger == pairToBeComparedTo.firstInteger) &&
                (this.secondInteger == pairToBeComparedTo.secondInteger) ) {
            return true;
        } else {
            return false;
        }
        */

        // Version 2
        return( (this.firstInteger == pairToBeComparedTo.firstInteger) &&
                (this.secondInteger == pairToBeComparedTo.secondInteger) );
    }

}
