package org.tpjava.demo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Salarie michel = new Salarie(
                "Quezak",
                "Michel",
                LocalDate.of(1980, 12, 31),
                30,
                LocalDate.now()
        );

        System.out.println(michel);



        Stagiaire json = new Stagiaire(
                "script",
                "java",
                LocalDate.of(1913, 8, 17),
                LocalDate.of(2023, 10, 20),
                LocalDate.now(),
                michel.getNom() + " " + michel.getPrenom(),
                true
        );
        System.out.println(json);
        System.out.println(json.getDebutStage());
        System.out.println("Le coco va être payé " + json.getCombienQuOnVaLePayer(50) + "€");
        json.licencier(LocalDate.of(2023, 10, 30));
    }
}
