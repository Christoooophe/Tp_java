package org.tpjava.polymorphisme;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cercle cercle = new Cercle(10);
        Carre carre = new Carre(10);
        TriangleRectangle triangle = new TriangleRectangle(25, 12);

        List<Forme> mesSupersFormes = new ArrayList<>();
        mesSupersFormes.add(cercle);
        mesSupersFormes.add(carre);
        mesSupersFormes.add(triangle);

        for(Forme forme : mesSupersFormes) {
            System.out.println("L'aire est de : " + forme.getAire());
        }
    }
}
