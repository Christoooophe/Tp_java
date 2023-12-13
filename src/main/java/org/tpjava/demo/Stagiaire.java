package org.tpjava.demo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Stagiaire extends Personne{
    public static final int HEURE_TRAVAILLEES_MENSUELLES_NORMALES = 151;
    public static final double SALAIRE_DE_MISERE_POUR_UN_35H = 4.05;
    private LocalDate debutStage;
    private LocalDate finStage;
    private String tuteur;
    private boolean estPaye;

    public Stagiaire(
            String nom,
            String prenom,
            LocalDate dateNaissance,
            LocalDate debutStage,
            LocalDate finStage,
            String tuteur,
            boolean estPaye
    ){
        super(nom, prenom, dateNaissance);
        this.debutStage = debutStage;
        this.finStage = finStage;
        this.tuteur = tuteur;
        this.estPaye = estPaye;
    }
    public LocalDate getDebutStage() {
        return debutStage;
    }

    public void setDebutStage(LocalDate debutStage) {
        this.debutStage = debutStage;
    }

    public LocalDate getFinStage() {
        return finStage;
    }

    public void setFinStage(LocalDate finStage) {
        this.finStage = finStage;
    }

    public int getDureeStage() {
        return Period.between(this.debutStage, this.finStage).getDays();
    }
    public double getCombienQuOnVaLePayer(double heuresTravaillees) {
        if(this.estPaye) {
            if (heuresTravaillees == HEURE_TRAVAILLEES_MENSUELLES_NORMALES) {
                double salaire = 0;
                salaire += HEURE_TRAVAILLEES_MENSUELLES_NORMALES * this.SALAIRE_DE_MISERE_POUR_UN_35H;
                return salaire;
            }
            return heuresTravaillees * this.SALAIRE_DE_MISERE_POUR_UN_35H;
        }
        return 0;
    }

    public void licencier(LocalDate dateDeFin) {
        this.finStage = dateDeFin;
        System.out.println(this.nom + this.prenom + " est viré. LOL à compter de cette date " +this.finStage);
    }

    @Override
    public String toString(){
        return "Le stagiaire s'appelle " + this.prenom + " " + this.nom + ", il a " + this.getAge() + " " +
                ", il a commencé son stage en " + this.debutStage.getMonth().getDisplayName(TextStyle.FULL, Locale.FRANCE)
                + " et il a fini ajourd'hui, son tuteur est : " + this.tuteur;
    }
}
