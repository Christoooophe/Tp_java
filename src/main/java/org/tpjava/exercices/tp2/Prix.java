package org.tpjava.exercices.tp2;

import java.text.DecimalFormat;

public class Prix {
    public static void main(String[] args){
        int prixHt = 31;
        calculTva(prixHt);
    }

    /**
     * Cette fonction va mutliplier le prixHt par 1.2 pour ressortir la TVA à 20%
     * Le decimalFormat va permettre d'arrondir à 2 chiffres après la virgule, par exemple 31 donnera 37.20 au
     * lieu de 37.1999999999
     * @param prixHt
     */
    public static void calculTva(int prixHt){
        final DecimalFormat df = new DecimalFormat("0.00");
        double prixTtc = prixHt * 1.20;
        System.out.println("Le prix TTC est de : " + df.format(prixTtc) + "€");
    }
}
