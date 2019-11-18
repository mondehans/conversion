package com.example.conversion.service;

public enum ConversionUnit {



    KELVIN_TO_CELSIUS(-272.15),
    POUNDS_TO_KILOGRAMS(0.453592),
    MILES_TO_KILOMETERS(1.60934);
    private final  double unit;

    ConversionUnit(double constant){
        unit=constant;
    }

    public double getUnits(){
        return unit;
    }
}
