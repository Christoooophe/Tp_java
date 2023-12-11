package org.tpjava.tp1;

import static org.tpjava.tp1.exercice1.Moyenne.calculMoyenne;
import static org.tpjava.tp1.exercice2.Prix.calculTva;
import static org.tpjava.tp1.exercice3.Palindrome.estIlUnPalindrome;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        //Exo 1
        int[] tableauDeNotes = {8, 10, 6, 20, 8};
        calculMoyenne(tableauDeNotes);

        //Exo 2
        int prixHt = 31;
        calculTva(prixHt);

        //Exo 3

        int nombre = 121;
        if (estIlUnPalindrome(nombre) == true) {
            System.out.println(nombre + " est un palindrome");
        }
        else {
            System.out.println(nombre + " n'est pas un palindrome");
        }
    }
}
