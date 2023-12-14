package org.tpjava.demoabsctract;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) throws Exception {
        Salarie michel = new Salarie(
                "Quezak",
                "Michel",
                LocalDate.of(1980, 12, 31),

                30,
                LocalDate.now()
        );


        System.out.println(michel);

        Stagiaire json = new Stagiaire(
                "Script",
                "Java",
                LocalDate.of(1999, 12, 31),
                LocalDate.of(2023, 10, 31),
                LocalDate.of(2023, 12, 31)
        );
        System.out.println(json.getAge());
        System.out.println(json.getNom());
        System.out.println(json.getPrenom());
        System.out.println("Le contrat a duré : " + json.getDureeContrat() + " jours");
        json.travailler();
    }
}