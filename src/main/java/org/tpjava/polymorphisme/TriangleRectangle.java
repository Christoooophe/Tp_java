package org.tpjava.polymorphisme;

public class TriangleRectangle implements Forme{
    private double longueur;
    private double largeur;

    public TriangleRectangle(double longueur, double largeur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    @Override
    public double getAire() {
        return this.largeur * this.longueur / 2;
    }
}
