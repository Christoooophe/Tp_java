package org.tpjava.tp2;

public class Main {
    public static void main(String[] args){
        Thermometre thermometre = new Thermometre();
        double celsius;
        double kelvin;
        double fahren;
        double temp = 323.15;
        String type = "Kelvin";

        thermometre.setTemperatureKelvin(temp, type);
        kelvin = thermometre.getTemperatureKelvin();

        thermometre.setTemperatureFahrenheit(temp, type);
        fahren = thermometre.getTemperatureFahrenheit();

        thermometre.setTemperatureCelsius(temp, type);
        celsius = thermometre.getTemperatureCelsius();

        System.out.println();
        System.out.println(celsius + "°c = " + kelvin + "°K = " + fahren + "°F");
    }
}
