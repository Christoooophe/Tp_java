package org.tpjava.tp1.exercice5;

import java.util.HashMap;

public class ChiffreRomain {
    /**
     * Franchement je suis arrivé à un stade où je ne sais meme plus ce que j'essaie de faire mdr
     * @param nombreRomains
     * @param liste
     * @return
     * @throws IllegalAccessException
     */
    public static int chiffreRomaineVersChiffreArabes(String nombreRomains, HashMap<Character, Integer> liste) throws IllegalAccessException {

        verifierLongueurInput(nombreRomains);
        verifierContenuInput(nombreRomains, liste);

        char[] contenu = transformerStringVersTabChar(nombreRomains);
        int chiffreArabe = 0;
        for (int index = 0; index < contenu.length; index++) {
            if(contenu.length - 1 != index){
                if (contenu[index] == 'I' && contenu[index + 1] == 'V' || contenu[index] == 'I' && contenu[index + 1] == 'X'
                        || contenu[index] == 'X' && contenu[index + 1] == 'L' || contenu[index] == 'X' && contenu[index + 1] == 'C'
                        || contenu[index] == 'C' && contenu[index + 1] == 'D' || contenu[index] == 'C' && contenu[index + 1] == 'M') {
                }
                else {
                    chiffreArabe += liste.get(contenu[index]);
                }
                System.out.println("ici");
            } else if (contenu[index] == 'V' || contenu[index] == 'X' || contenu[index] == 'C' ) {
                chiffreArabe += liste.get(contenu[index]) - liste.get(contenu[index - 1]);
            } else {
                chiffreArabe += liste.get(contenu[index]);
            }
        }
        return chiffreArabe;
    }

    /**
     * Verifie si l'input contient entre 1 et 15 caractères
     * @param texte
     * @throws IllegalAccessException
     */
    public static void verifierLongueurInput(String texte) throws IllegalAccessException {
        if (texte.length() < 1 || texte.length() > 15) {
            throw new IllegalAccessException("Le nombre romain doit faire entre 1 et 15 caractères");
        }
    }

    /**
     * Transforme l'input utilisateur de String à tableau de caractères
     * @param texte
     * @return
     */
    public static char[] transformerStringVersTabChar(String texte) {
        char[] caracteres = texte.toCharArray();
        return caracteres;
    }

    /**
     * Verifie si l'input de l'utilisateur a bien uniquement des chiffres romains en prenant chaque caractère de
     * l'input et en bouclant sur le hasmap passé en paramètre
     * @param texte
     * @param liste
     * @throws IllegalAccessException
     */
    public static void verifierContenuInput(String texte, HashMap<Character, Integer> liste) throws IllegalAccessException {
        char[] caracteres = transformerStringVersTabChar(texte);
        for (char car : caracteres) {
            if(!liste.containsKey(car)) {
                throw new IllegalAccessException("Dommage");
            }
        }
    }
}
