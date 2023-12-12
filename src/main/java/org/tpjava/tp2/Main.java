package org.tpjava.tp2;

public class Main {
    public static void main(String[] args){
        Thermometre thermometre = new Thermometre();
        double celsius;
        double kelvin;
        double fahren;
        double temp = 50;
        String type = "Celsius";

        thermometre.setTemperatureKelvin(temp, type);
        kelvin = thermometre.getTemperatureKelvin();
        thermometre.setTemperatureFahrenheit(temp, type);
        fahren = thermometre.getTemperatureFahrenheit();

        System.out.println();
        System.out.println(temp + "°c = " + kelvin + "°K = " + fahren + "°F");
    }
}
