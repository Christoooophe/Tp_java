package org.tpjava.tp1.exercice2;

import java.text.DecimalFormat;

public class Prix {

    /**
     * Cette fonction va mutliplier le prixHt par 1.2 pour ressortir la TVA à 20%
     * Le decimalFormat va permettre d'arrondir à 2 chiffres après la virgule, par exemple 31 donnera 37.20 au
     * lieu de 37.1999999999
     * @param prixHt
     */
    public static void calculTva(int prixHt) throws IllegalAccessException {
        final DecimalFormat df = new DecimalFormat("0.00");
        if (prixHt < 0) {
            throw new IllegalAccessException("Le prix HT doit être positif");
        }
        double prixTtc = prixHt * 1.20;
        System.out.println("Le prix TTC est de : " + df.format(prixTtc) + "€");
    }
}
