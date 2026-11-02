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
            // version 1 : expanded code - Regular Search
            // int resultID = rechercherIdx(keyToBeFound);
            // return valuesArray[resultID];

            // version 2 : compact code - Regular Search
            // uncomment the next line to test
            // return valuesArray[rechercherIdx(keyToBeFound)];

            // version 3 : expanded code - Dichotomic Search
            int resultID = rechercheDichotomiqueIdx(keyToBeFound);
            return valuesArray[resultID];
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
    * Question 7 : Écrire la méthode supprimer qui supprime couple (clé ; valeur).
    * Pour cela, on remplacera la clé, resp. la valeur, à supprimer par le dernier élément du tableau.
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

    /**
     * Question 9 : Proposer une nouvelle méthode de recherche (remplaçant celle de la Question 3) qui
     * réalise une recherche dichotomique. La recherche dichotomique est un moyen efficace de recherche
     * dans un tableau trié. Le principe consiste à comparer l’élément à recherche avec l’élément de la case
     * du milieu du tableau. Si les éléments sont égaux alors c’est gagné sinon, on recommence la même
     * chose dans la moitié du tableau pertinente (celle d’après si l’élément du milieu est plus petit que
     * l’élément recherché, celle d’avant sinon)
     */
    private int rechercheDichotomiqueIdx(String cle) {
        int min=0;
        int max=nbElements;
        while (min<max) {
            int idx = (max+min)/2;
            int comp = cle.compareTo(keysArray[idx]);
            if (comp==0) {
                return idx;
            }
            else if (comp<0) {
                max=idx;
            }
            else {
                min=idx+1;
            }
        }
        return -1-(max+min)/2;
    }

    /**
     * Question 10 : Proposer une nouvelle méthode d’ajout (remplaçant celle de la Question 6) qui insère
     * un couple (clé ; valeur) à la bonne place selon l’ordre alphabétique des clés. Modifier également, la
     * méthode de suppression, pour qu’elle préserve l’ordre dans le dictionnaire
     */

    public void ajouterModifierDichotomique(int valeur, String cle) {
        int idx = rechercherIdx(cle) ;
        if (idx>-1) {
            valuesArray[idx]=valeur;
        }
        else {
            agrandir();
            idx = -idx -1; // ou idx~=idx
            for (int i=nbElements ; i>idx ;i--) {
                keysArray[i]=keysArray[i-1];
                valuesArray[i]=valuesArray[i-1];
            }
            keysArray[idx]=cle;
            valuesArray[idx]=valeur;
            nbElements+=1;

        }
    }


    public int supprimerDichotomique(String mot) {
        int idx = rechercherIdx(mot);
        if (idx<0) return 0;
        int res = valuesArray[idx];
        for (int i=idx ; i<nbElements-1 ; i++) {
            keysArray[i]=keysArray[i+1];
            valuesArray[i]=valuesArray[i+1];
        }
        // on aurait pu supprimer ce qui se trouve à nbElements, mais ce n'est pas obligatoire
        nbElements--;
        return res;
    }

}
