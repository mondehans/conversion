package com.example.conversion.service;

public class ConversionStrategyKiloPound implements ConversionStrategy {

    @Override
    public double convert(double amount) {
        return amount * ConversionUnit.POUNDS_TO_KILOGRAMS.getUnits();
    }
}
