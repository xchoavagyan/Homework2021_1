package com.company;

public class TemperatureConverter {
//    5
//Design a class named TemperatureConverter
//    methods
//    - convertFahrenheitToCelsius
//    - convertFahrenheitToKelvin
//
//    - convertCelsiusToFahrenheit
//    - convertCelsiusToKelvin
//
//    - convertKelvinToFahrenheit
//    - convertKelvinToCelsius


    private TemperatureConverter() {
    }

    public double convertFahrenheitToCelsius(int f) {
        return (f - 32) * 5 / 9;
    }

    public double convertFahrenheitToKelvin(int f) {
        return convertFahrenheitToCelsius(f) + 273.15;
    }

    public double convertCelsiusToFahrenheit(int c) {
        return (c * 9) / 5 + 32;
    }

    public double convertCelsiusToKelvin(int c) {
        return c + 273.15;
    }

    public double convertKelvinToFahrenheit(int k) {
        return (k - 273.15) * 9 / 5 + 32;
    }

    public double KelvinToCelsius(int k) {
        return k - 273.15;
    }
}
