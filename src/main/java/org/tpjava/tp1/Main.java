package org.tpjava.tp1;

import java.util.HashMap;

import static org.tpjava.tp1.exercice1.Moyenne.calculMoyenne;
import static org.tpjava.tp1.exercice2.Prix.calculTva;
import static org.tpjava.tp1.exercice3.Palindrome.estIlUnPalindrome;
import static org.tpjava.tp1.exercice4.CheckDouble.checkDoubleFor;
import static org.tpjava.tp1.exercice5.ChiffreRomain.chiffreRomaineVersChiffreArabes;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        System.out.println("");

        //-----------Exo 1-----------
        int[] tableauDeNotes = {8, 10, 6, 20, 8};
        calculMoyenne(tableauDeNotes);

        System.out.println("");

        //----------Exo 2----------
        int prixHt = 31;
        calculTva(prixHt);

        System.out.println("");

        //----------Exo 3-----------
        int nombre = 121;
        if (estIlUnPalindrome(nombre) == true) {
            System.out.println(nombre + " est un palindrome");
        }
        else {
            System.out.println(nombre + " n'est pas un palindrome");
        }

        System.out.println("");

        //-----------Exo 4-----------
        int[] tableauDeDoublons = {1, 2, 3, 4, 5, 6, 5, 7, 8};
        if (checkDoubleFor(tableauDeDoublons)) {
            System.out.println("Le tableau contient des doublons");
        }
        else {
            System.out.println("Le tableau ne contient pas de doublons");
        }

        System.out.println("");

        //-----------Exo 5----------
        HashMap<Character, Integer> liste = new HashMap<Character, Integer>();
        liste.put('I', 1);
        liste.put('V', 5);
        liste.put('X', 10);
        liste.put('L', 50);
        liste.put('C', 100);
        liste.put('D', 500);
        liste.put('M', 1000);
        System.out.println("Votre nombre romain en nombre arabe : " + chiffreRomaineVersChiffreArabes("V", liste));
    }
}
