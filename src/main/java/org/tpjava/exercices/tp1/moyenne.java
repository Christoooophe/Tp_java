package org.tpjava.exercices.tp1;

public class moyenne {
    public static void main(String[] args) {
        int[] tableauDeNotes = new int[] {8, 10, 6, 20, 9};
        calculMoyenne(tableauDeNotes);
    }

    /**
     * On passe le tableau de notes à notre fonction qui va boucler sur chaque note du tableau
     * et qui va incrémenter le total par chaque note et qui va aussi incrémenter le divisuer par 1
     * afin d'avoir une fonction qui est dynamique en fonction du nombre de notes
     * @param notes
     */
    public static void calculMoyenne(int[] notes) {
        int total = 0;
        int diviseur = 0;
        for(int note : notes) {
            total += note;
            diviseur++;
        }
        try {
            int resultat = total / diviseur;
            System.out.println("La moyenne des notes est de : " + resultat);
        }
        catch (ArithmeticException e){
            System.out.println("Voici votre erreur messire : " + e.getMessage());
        }

    }
}
