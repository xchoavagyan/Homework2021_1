package com.company;

public class DistanceConverter {
//    6
//Design a class named DistanceConverter
//    methods
//    - convertMetersToMiles
//    - convertMilesToMeters

    private DistanceConverter() {
    }

    public double convertMetersToMiles(double meter) {
        return meter * 0.00062;
    }

    public double convertMilesToMeters(double mile) {
        return mile * 1609.34;
    }
}
