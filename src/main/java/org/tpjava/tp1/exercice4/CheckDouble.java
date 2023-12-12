package org.tpjava.tp1.exercice4;

public class CheckDouble {
    /**
     * On récupère un tableau, on tape 2 boucles à l'intérieur, une première pour récupérer chaque entier du tableau,
     * une deuxieme à l'intérieur de la première qui va boucler sur chaque élément du tableau. Tous les éléments du
     * tableau sont là une fois, mais dès que le compteur passe à 2, ça veut dire qu'il a vu un doublon
     * @param tableau
     * @return
     */
    public static boolean checkDoubleFor(int[] tableau) {
        int compteur;
        int chiffreAVerifier;
        for(int i = 0; i < tableau.length; i++){
            compteur = 0;
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
