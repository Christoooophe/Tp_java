package org.tpjava.demoabsctract;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Stagiaire extends Collaborateur {

    public Stagiaire(
            String nom,
            String prenom,
            LocalDate dateNaissance,
            LocalDate debutContrat,
            LocalDate finContrat
    ) {
        super(nom, prenom, dateNaissance, debutContrat, finContrat);
        this.debutContrat = debutContrat;
        this.finContrat = finContrat;
    }

    /**
     * Mets fin prématurément au stage
     */
    public void licencier() {
        this.finContrat = LocalDate.now();
        System.out.println( this.prenom +  " a mal fait le café");
    }

    public int getDureeContrat(){
        return (int) ChronoUnit.DAYS.between(debutContrat, finContrat);
    }
    @Override
    public void travailler() {
        System.out.println(this.nom + " " + this.prenom + " adore photocopier des documents");
    }

    @Override
    public String toString() {
        return "Le stagiaire s'appelle " + this.nom + ' ' + this.prenom;
    }

    @Override
    public void direBonjour() {
        System.out.println("Hello, je suis un stagiaire de ouf !");
    }
}