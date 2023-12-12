package org.tpjava.tp2;

public class Thermometre {
    public double temperature;
    public String type = "Celsius";
    public Thermometre(double temperature, String type){
        this.temperature = temperature;
        this.type = type;
    }
    public Thermometre(){
        this.temperature = 0;
        this.type = "Celsius";
    }

    public double getTemperatureCelsius() {
        return this.temperature;
    }
    public double getTemperatureKelvin() {
        return this.temperature;
    }
    public double getTemperatureFahrenheit() {
        return this.temperature;
    }
    public void setTemperatureCelsius(double temperature, String type){
        if (type == "Kelvin") {
            this.temperature = temperature - 273.15;
        } else if (type == "Fahrenheit" ) {
            this.temperature = (temperature - 32) / 1.8;
        } else {
            this.temperature = temperature;
        }
    }
    public void setTemperatureKelvin(double temperature, String type){
        if (type == "Celsius") {
            this.temperature = temperature + 273.15;
        } else if (type == "Fahrenheit" ) {
            this.temperature = (temperature - 32) / 1.8 + 273.15;
        } else {
            this.temperature = temperature;
        }
    }
    public void setTemperatureFahrenheit(double temperature, String type){
        if (type == "Kelvin") {
            this.temperature = (temperature - 273.15) * 1.8 + 32;
        } else if (type == "Celsius" ) {
            this.temperature = temperature * 1.8 + 32;
        } else {
            this.temperature = temperature;
        }
    }
}
