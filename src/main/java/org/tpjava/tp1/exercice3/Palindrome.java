package org.tpjava.tp1.exercice3;

public class Palindrome {
    /**
     * Fonction qui récupère un nombre, récupère chaque dernier int d'un nombre dans une boucle, puis l'assigne à une
     * nouvelle variable, puis les compare pour savoir si le nombre de base et le nombre inversé sont identiques
     * @param nombre
     * @return
     */
    public static boolean estIlUnPalindrome(int nombre) throws IllegalAccessException {
        if (nombre < 10) {
            throw new IllegalAccessException("Votre nombre doit contenir au minimum 2 nombres");
        }
        int nombreCompare = nombre;
        int nombreInverse = 0;
        int morceauNombre = 0;
        while (nombreCompare > 0) {
            morceauNombre = nombreCompare % 10;
            nombreInverse = nombreInverse * 10 + morceauNombre;
            nombreCompare /= 10;
        };
        if (nombre == nombreInverse) {
            return true;
        }
        return false;
    }
}
