package org.tpjava.tp1.exercice4;

public class CheckDouble {
    public static boolean checkDoubleFor(int[] tableau) {
        int compteur;
        int chiffreAVerifier;
        for(int i = 0; i < tableau.length; i++){
            compteur = 0;
            chiffreAVerifier = 0;
            for (int j = 0; j < tableau.length; j++) {
                chiffreAVerifier = tableau[i];
                if (chiffreAVerifier == tableau[j]) {
                    compteur++;
                    if(compteur > 1){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
