import java.util.Arrays;

public class DictionnaireStringInt {
    //--------- Variables ---------
    private int[] valuesArray;
    private String[] keysArray;
    private int nbElements;

    //--------- Constructor ---------
    public DictionnaireStringInt(){
        // Create the arrays
        valuesArray = new int[10];
        keysArray = new String[10];

        // Fill them with empty values
        Arrays.fill(valuesArray, 0);
        Arrays.fill(keysArray, "");

        // Set the number of elements to 0
        nbElements = 0;
    }

    //--------- Methods ---------
    /**
     * Question 3. Écrire la méthode rechercherIdx permettant de rechercher et retourner l’indice d’une
     * clé passée en paramètre. Si la clé n’est pas présente la méthode retournera la valeur -1-idx (où idx
     * est l’indice de la case où aurait du se trouver la clé).
     * Rappel : l’égalité entre deux objets est réalisée en utilisant la méthode « equals »
     */
    public int rechercherIdx(String keyToBeFound){
        // If there are no elements, no need to search, we will return -1
        if(nbElements == 0)
            return -1;
        else {
            // We will search in the Keys Array: so we will do a loop in the keys array
            for(int i = 0; i < keysArray.length; i++){
                // we check if the element i is equal to the key to be found
                if(keysArray[i] != null && keysArray[i].equals(keyToBeFound))
                    // If it's equal, then we return the index i
                    return i;
            }
            // Si la clé n’est pas présente la méthode retournera la valeur -1-idx (où idx
            // est l’indice de la case où aurait du se trouver la clé).
            return -1-nbElements;
        }
    }

    /**
     * Question 4. En se servant de la méthode définie à la question précédente, écrire la méthode rechercherValeur retournant la
     * valeur associée à une clé. Si la clé n’est pas présente, on retournera 0.
     */
    public int rechercherValeur(String keyToBeFound){
        // We check if the key is present
        if(rechercherIdx(keyToBeFound) == -1)
            // The key is not present, so we return 0
            return 0;
        else {
            // version 1 : expanded code
            int resultID = rechercherIdx(keyToBeFound);
            return valuesArray[resultID];

            // version 2 : compact code
            // uncomment the next line to test
            //return valuesArray[rechercherIdx(keyToBeFound)];
        }
    }

    /*
    * Question 5 : Écrire la méthode agrandir qui permet de remplacer les tableaux si ils sont pleins.
    * Les nouveaux tableaux auront une taille supérieure de 10 éléments (par rapport aux anciens tableaux).
    */
    public void agrandir(){
        // Version 1 : use the method given by Arrays

        // At first, we test that the arrays are full by checking if the number of elements is equal to the length of
        // the array of keys or the array of values
        if(nbElements == keysArray.length){
            // The arrays are full, so we will expand them
            keysArray = Arrays.copyOf(keysArray, keysArray.length + 10);
            valuesArray = Arrays.copyOf(valuesArray, valuesArray.length + 10);
        }

        /*
        // Version 2 : use the manual way to expand the arrays

        // At first, we test that the arrays are full by checking if the number of elements is equal to the length of
        // the array of keys or the array of values
        if(nbElements == keysArray.length){
            // The arrays are full, so we will expand them
            // We create the new arrays with the length expanded by 10
            String[] newKeysArray = new String[keysArray.length + 10];
            int[] newValuesArray = new int[keysArray.length + 10];

            // We loop in the old arrays and copy each element into the new ones
            for(int i = 0; i < keysArray.length; i++){
                newKeysArray[i] = keysArray[i];
                newValuesArray[i] = valuesArray[i];
            }

            // We change the reference of the old arrays and point them to the new ones
            keysArray = newKeysArray;
            valuesArray = newValuesArray;
        }
        */
    }

    /*
     * Question 6 : Écrire la méthode ajouterModifier qui permet d’ajouter une paire (clé ; valeur) si la clé n’est pas
     présente ou de remplacer valeur associée si la clé est déjà présente.
     Avant l’ajout, cette méthode appellera la méthode définie à la question précédente pour s’assurer qu’il y a
     la place suffisante dans le tableau.
     */
    public void ajouterModifier(int value, String key){
        int keyID = rechercherIdx(key);

        // We check the value of keyID
        if(keyID > -1){
            // If the keyID is greater than -1, then it means that the key is present in the array and we should
            // just update the value
            valuesArray[keyID] = value;
        } else {
            // The keyID is equal to -1, we should add this pair
            agrandir();
            keysArray[nbElements] = key;
            valuesArray[nbElements] = value;
            nbElements++;
        }

    }

    /*
    Écrire la méthode supprimer qui supprime couple (clé ; valeur).
    Pour cela, on remplacera la clé, resp. la valeur, à supprimer par le dernier élément du tableau.
     */
    public int supprimer(int value, String key){
        int keyID = rechercherIdx(key);

        // We check if the key ID is equal to -1
        if(keyID == -1)
            // If keyID == -1, then it is not present and we have nothing to do.
            // we will return -1 to showcase this
            return -1;
        else {
            // we have found the key in the array, so we will replace the pair to be deleted by the pair
            // present at the end of the array
            // We have to check if the pair to be deleted is not at the end of the arrays
            if(keyID < nbElements -1){
                // we take the last pair and put them in place of the pair to be removed
                keysArray[keyID] = keysArray[nbElements - 1];
                valuesArray[keyID] = valuesArray[nbElements - 1];

                // we empty the values of the last pair
                keysArray[nbElements - 1] = "";
                valuesArray[nbElements - 1] = 0;

                // we decrement the nbElements
                nbElements--;
                return keyID;
            } else {
                // we empty the values of the last pair
                keysArray[nbElements - 1] = "";
                valuesArray[nbElements - 1] = 0;

                // we decrement the nbElements
                nbElements--;
                return keyID;
            }
        }

    }

    /**
     * Question 8 : Écrire la méthode String toString() permettant de retourner une représentation du tableau associatif
     * sous forme de chaîne de caractères. L’exemple du début sera représenté par la chaîne
     * « { [Pomme : 3] , [Poire : 5] , [Banane : 2] } »
     *
     */
    public String toString(){
        String displayArrays = "";

        // we add the beginning of our display string
        displayArrays += "{ ";

        // if we have pairs to show, then we will loop on them and add them to the display string
        if(nbElements != 0){
            for(int i = 0; i < nbElements; i++){
                if(i < (nbElements - 1))
                    // If I am not on the last pair, I will add a comma at the end
                    displayArrays += "[ " + keysArray[i] + " : " + valuesArray[i] + " ] , ";
                else
                    // if I am not on the last pair, I will not add a comma at the end
                    displayArrays += "[ " + keysArray[i] + " : " + valuesArray[i] + " ]";
            }
        }

        // we add the end of our display string
        displayArrays += " }";
        return displayArrays;
    }
}
