package com.company;

public class CurrencyConverter {
//    7
//    Design classes for currencies - Dram, Ruble, Dollar
//    Design a class named CurrencyConverter which has methods names “convert” for each pair of currency
//    convert(Dram from, Ruble to)
//    convert(Dram from, Dollar to)
//    convert(Dollar from, Ruble to)
//    convert(Dollar from, Dram to)
//    convert(Ruble from, Dram to)
//    convert(Ruble from, Dollar to)


    private CurrencyConverter() {
    }

    public double convertDollarToEuro(double dollar) {
        return dollar * 0.84;
    }

    public double convertDollarToDram(double dollar) {
        return dollar * 526.6;
    }

    public double convertDollarToRuble(double dollar) {
        return dollar * 73.0;
    }

    public double convertEuroToDollar(double euro) {
        return euro * 1.21;
    }

    public double convertEuroToDram(double euro) {
        return euro * 629.91;
    }

    public double convertEuroToRuble(double euro) {
        return euro * 87.48;
    }

    public double convertRubleToDollar(double ruble) {
        return ruble * 0.014;
    }

    public double convertRubleToEuro(double ruble) {
        return ruble * 0.011;
    }

    public double convertRubleToDram(double ruble) {
        return ruble * 7.19;
    }

    public double convertDramToDollar(double dram) {
        return dram * 0.0021;
    }

    public double convertDramToEuro(double dram) {
        return dram * 0.0017;
    }

    public double convertDramToRuble(double dram) {
        return dram * 0.15;

    }

}
